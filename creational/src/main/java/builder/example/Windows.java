package builder.example;

public enum Windows {
  PLASTIC("Пластик"),
  WOODEN("Дерево");
  private final String title;

  Windows(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }
}
