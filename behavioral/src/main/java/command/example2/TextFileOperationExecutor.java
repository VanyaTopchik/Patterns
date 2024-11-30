package command.example2;

import java.util.ArrayDeque;
import java.util.Queue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TextFileOperationExecutor {
  private static final Logger logger = LoggerFactory.getLogger(TextFileOperationExecutor.class);

  private final Queue<TextFileOperation> operations = new ArrayDeque<>();

  public void addOperation(TextFileOperation operation) {
    operations.add(operation);
  }

  public void executeOperations() {
    TextFileOperation operation;
    while ((operation = operations.poll()) != null) {
      var result = operation.execute();
      logger.info(result);
    }
  }
}