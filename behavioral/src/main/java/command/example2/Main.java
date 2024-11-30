package command.example2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    TextFileOperation openTextFileOperation = new OpenTextFileOperation(new TextFile("file1.txt"));
    TextFileOperation saveTextFileOperation = new SaveTextFileOperation(new TextFile("file2.txt"));
    TextFileOperationExecutor textFileOperationExecutor = new TextFileOperationExecutor();
    textFileOperationExecutor.addOperation(openTextFileOperation);
    textFileOperationExecutor.addOperation(saveTextFileOperation);

    TextFile textFile = new TextFile("file3.txt");
    textFileOperationExecutor.addOperation(textFile::open);
    textFileOperationExecutor.addOperation(textFile::write);
    textFileOperationExecutor.addOperation(textFile::save);
    textFileOperationExecutor.addOperation(() -> "Opening file file4.txt");
    textFileOperationExecutor.addOperation(() -> "Saving file file4.txt");

    textFileOperationExecutor.executeOperations();
  }
}
