package builder.example;

public enum Doors {
  WOODEN("Дерево"),
  IRON("Железо");
  private final String title;

  Doors(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }
}
