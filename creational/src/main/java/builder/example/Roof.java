package builder.example;

public enum Roof {
  TILES("Черепица"),
  CORRUGATED_SHEET("Профнастил");

  private final String title;

  Roof(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }
}
