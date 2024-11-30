package objectpool.example;

public class Main {

  public static void main(String[] args) {
    ConnectionObjectFactory connectionFactory = new ConnectionObjectFactory();

    ObjectPool<Connection> pool = new ObjectPool<>(2, 5, connectionFactory, Connection::connect);

    var con1 = pool.get(); // из пула
    con1.execSelect();

    var con2 = pool.get(); // из пула
    con2.execSelect();

    var con3 = pool.get(); // новый объект
    con3.execSelect();

    var con4 = pool.get();
    con4.execSelect();

    pool.release(con3);
    // максимальное количество объектов в пула
    var con5 = pool.get();
    var con6 = pool.get();
    var con7 = pool.get(); // ошибка
  }

}
