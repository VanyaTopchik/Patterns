package decorator.example;

public final class DataSourceImpl implements DataSource {
  @Override
  public int getInteger() {
    return 15;
  }
}
