package state.example2;

public interface PackageState {

  void next(Package pkg);

  void prev(Package pkg);

  void printStatus();
}