package command.example;

public class AdderABC implements Command {
  @Override
  public String execute(SomeObject object) {
    object.setValue(object.getValue() + "+ABC");
    return "ABC added";
  }
}
