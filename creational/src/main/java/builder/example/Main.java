package builder.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {
    House house1 = new House(Walls.BRICK, Roof.TILES, Doors.IRON, Windows.PLASTIC, true, true, true, true);
    House house2 = new House(Walls.WOODEN, Roof.TILES, Doors.WOODEN, Windows.WOODEN, false, false, false, false);

    logger.info("house1:{}", house1);
    logger.info("house2:{}", house2);

    House house3 = new House.Builder()
        .setDoors(Doors.WOODEN)
        .setRoof(Roof.CORRUGATED_SHEET)
        .setWalls(Walls.WOODEN)
        .setWindows(Windows.PLASTIC)
        .setHasGarage(true)
        .setHasPool(true)
        .build();

    logger.info("house3:{}", house3);
  }
}
