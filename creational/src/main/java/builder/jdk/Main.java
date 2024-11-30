package builder.jdk;

import java.util.Calendar;
import static java.util.Calendar.MONDAY;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    Locale locale = new Locale.Builder()
        .setLanguage("ru")
        .setRegion("RU")
        .build();
    logger.info("language:{}", locale.getLanguage());

    Calendar calendar = new Calendar.Builder()
        .setCalendarType("iso8601")
        .setWeekDate(2024, 1, MONDAY)
        .build();
    logger.info("time:{}", calendar.getTime());

    StringBuilder builder = new StringBuilder();
    builder.append("a").append("b").append("c");
    logger.info("result:{}", builder);
  }

}