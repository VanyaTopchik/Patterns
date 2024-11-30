package objectpool.example;

public interface ObjectFactory<T> {
  T create();
}
