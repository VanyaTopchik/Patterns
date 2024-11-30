package interpreter.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Context {
  private static final Map<String, List<Row>> tables = new HashMap<>();
  private static final Predicate<String> matchAnyString = s -> s.length() > 0;
  private static final Function<String, Stream<String>> matchAllColumns = Stream::of;

  static {
    List<Row> list = new ArrayList<>();
    list.add(new Row("John", "Doe"));
    list.add(new Row("Jan", "Kowalski"));
    list.add(new Row("Dominic", "Doom"));

    tables.put("people", list);
  }

  private String table;
  private String column;
  private int colIndex = -1;
  private Predicate<String> whereFilter = matchAnyString;
  private Function<String, Stream<String>> columnMapper = matchAllColumns;

  void setColumn(String column) {
    this.column = column;
    setColumnMapper();
  }

  void setTable(String table) {
    this.table = table;
  }

  void setFilter(Predicate<String> filter) {
    whereFilter = filter;
  }

  void clear() {
    column = "";
    columnMapper = matchAllColumns;
    whereFilter = matchAnyString;
  }

  List<String> search() {

    List<String> result = tables.entrySet()
        .stream()
        .filter(entry -> entry.getKey().equalsIgnoreCase(table))
        .flatMap(entry -> Stream.of(entry.getValue()))
        .flatMap(Collection::stream)
        .map(Row::toString)
        .flatMap(columnMapper)
        .filter(whereFilter)
        .collect(Collectors.toList());

    clear();

    return result;
  }

  private void setColumnMapper() {
    switch (column) {
      case "*" -> colIndex = -1;
      case "name" -> colIndex = 0;
      case "surname" -> colIndex = 1;
    }
    if (colIndex != -1) {
      columnMapper = s -> Stream.of(s.split(" ")[colIndex]);
    }
  }
}
