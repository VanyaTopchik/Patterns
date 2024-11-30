package visitor.jdk;

import java.io.IOException;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
  public static void main(String[] args) throws IOException {
    Path startingPath = Paths.get("/Users/i.golyshkin/IdeaProjects/Patterns/behavioral");

    FileVisitor<Path> visitor = new TrivialFileVisitor();

   // Use the built-in walkFileTree client to
    // visit all directory and file nodes
    Files.walkFileTree(startingPath, visitor);
  }
}
