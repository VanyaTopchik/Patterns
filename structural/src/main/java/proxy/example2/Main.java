package proxy.example2;

public class Main {
  public static void main(String[] args) {
    security();
  }

  private static void security() {
    SecurityAccess proxy = new SecurityProxy(new SecurityAccessImpl());
    proxy.access();
  }
}
