package objectpool.jdk;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.SECONDS;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) throws InterruptedException {
    logger.info("----- String -----");
    String str1 = "Hello, world";
    String str2 = "Hello, world";
    logger.info("str1 == str2 -> {}", (str1 == str2));

    // Строковый литерал -- в пуле строк (string pool) (интернирование, interning)
    String str3 = "Hello, world";
    String str4 = "Hello, world";
    logger.info("str3 == str4 -> {}", (str3 == str4));

    // intern() - помещаем в пул
    String str5 = "Hello, world".intern();
    logger.info("str1 == str5 -> {}", (str1 == str5));

    logger.info("----- Thread -----");
    // Один поток
    Thread thread = new Thread(() -> logger.info("Hello from Thread"));
    thread.start();

    // Пул с двумя потоками
    ExecutorService fixed = Executors.newFixedThreadPool(2);
    fixed.submit(() -> logger.info("Hello from FixedThreadPool"));

    // Кэширующий пул потоков,
    // создает потоки по мере необходимости, переиспользует неактивные потоки
    ExecutorService cached = Executors.newCachedThreadPool();
    cached.submit(() -> logger.info("Hello from CachedThreadPool"));

    // Отложенный, периодический запуск
    ScheduledExecutorService scheduled = Executors.newScheduledThreadPool(1);
    scheduled.scheduleAtFixedRate(() -> logger.info("Hello from ScheduledThreadPool"), 0, 100, MILLISECONDS);

    Thread.sleep(SECONDS.toMillis(1));
    //Shutdown() просто сообщит executor service, что она не может принимать новые задачи, но уже отправленные задачи продолжают выполняться
    //shutdownNow() сделает то же самое И попытается отменить уже отправленные задачи, прервав соответствующие потоки.
    scheduled.shutdownNow();
    fixed.shutdownNow();
    cached.shutdownNow();
  }

}
