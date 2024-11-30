package command.example;

@FunctionalInterface
public interface Command {
  String execute(SomeObject object);
}
