package flyweight.example;

public class HeavyCommonPart {

  private final Object reallyBigObject = new Object();

  @Override
  public String toString() {
    return "HeavyCommonPart:" + reallyBigObject;
  }
}
