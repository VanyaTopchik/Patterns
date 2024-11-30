package command.example2;

@FunctionalInterface //Чтобы не могли добавить методы
public interface TextFileOperation {

  String execute();

}