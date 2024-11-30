package factory.staticfactorymethod.jdk;

import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    var optional1 = Optional.of("Value");
    var optional2 = Optional.empty();
    var optional3 = Optional.ofNullable(null);

    Collection syncedCollection = Collections.synchronizedCollection(new ArrayDeque<>(List.of("first", "second")));

    Set syncedSet = Collections.synchronizedSet(new HashSet(List.of("first", "second")));

    List<Integer> unmodifiableList = Collections.unmodifiableList(new ArrayList<>(List.of(1, 2)));

    Map<String, Integer> originalMap = new HashMap<>();
    originalMap.put("first", 1);
    originalMap.put("sedond", 2);
    Map<String, Integer> unmodifiableMap = Collections.unmodifiableMap(originalMap);

    var today = LocalDate.now();
    var date = LocalDate.of(2024, 1, 1);
  }

}