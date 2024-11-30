package flyweight.example;

public class ObjectOnLine {
  private final int x;

  private final HeavyCommonPart heavyCommonPart;

  public ObjectOnLine(HeavyCommonPart heavyCommonPart, int x) {
    this.heavyCommonPart = heavyCommonPart;
    this.x = x;
  }

  @Override
  public String toString() {
    return "ObjectOnLine{" + "x=" + x + ", heavyCommonPart=" + heavyCommonPart + '}';
  }
}
