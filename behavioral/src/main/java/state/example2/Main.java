package state.example2;

public class Main {
  public static void main(String[] args) {

    Package pkg = new Package();
    pkg.printStatus();

    pkg.nextState();
    pkg.printStatus();

    pkg.previousState();
    pkg.printStatus();

    pkg.nextState();
    pkg.nextState();
    pkg.printStatus();

    pkg.nextState();
    pkg.printStatus();
  }
}
