package adapter.example2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    StringTokenizer tokenizer = new StringTokenizer("Hello World");
    Iterator<String> tokenizerAdapter = new StringTokenizerIteratorAdapter("Hello World");

    List<String> actualTokens = new ArrayList<>();
    IteratorAdapter<Object> adapter = new IteratorAdapter<>(tokenizer);
    adapter.forEachRemaining(s -> actualTokens.add((String) s));
    logger.info("{}", actualTokens);

    List<String> actualTokens2 = new ArrayList<>();
    tokenizerAdapter.forEachRemaining(actualTokens2::add);
    logger.info("{}", actualTokens2);
  }
}
