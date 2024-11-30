package builder.example;

public enum Walls {
  BRICK("Кирпич"),
  WOODEN("Дерево");
  private final String title;

  Walls(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }
}
