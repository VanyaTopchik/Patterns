package visitor.jdk;

import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TrivialFileVisitor extends SimpleFileVisitor<Path> {

  private static final Logger logger = LoggerFactory.getLogger(TrivialFileVisitor.class);

  @Override
  public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
    logger.info("Start directory:{}", dir);
    return FileVisitResult.CONTINUE;
  }

  @Override
  public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
    logger.info("{}", file.getFileName());
    return FileVisitResult.CONTINUE;
  }
}