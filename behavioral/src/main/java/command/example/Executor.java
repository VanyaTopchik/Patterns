package command.example;

import java.util.ArrayDeque;
import java.util.Queue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class Executor {
  private static final Logger logger = LoggerFactory.getLogger(Executor.class);
  private final SomeObject object;
  private final Queue<Command> commands = new ArrayDeque<>();

  public Executor(SomeObject object) {
    this.object = object;
  }

  public void addCommand(Command command) {
    commands.add(command);
  }

  public void executeCommands() {
    Command command;
    while ((command = commands.poll()) != null) {
      var result = command.execute(object);
      logger.info("command execution result:{}", result);
    }
  }
}
