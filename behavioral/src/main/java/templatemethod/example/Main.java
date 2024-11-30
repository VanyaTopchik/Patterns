package templatemethod.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
  private static final Logger logger = LoggerFactory.getLogger(Main.class);

  public static void main(String[] args) {

    ComputerBuilder standardComputerBuilder = new StandardComputerBuilder();
    Computer standardComputer = standardComputerBuilder.buildComputer();
    standardComputer.getComputerParts().forEach((k, v) -> logger.info("Part : {} Value : {}", k, v));

    ComputerBuilder highEndComputerBuilder = new HighEndComputerBuilder();
    Computer highEndComputer = highEndComputerBuilder.buildComputer();
    highEndComputer.getComputerParts().forEach((k, v) -> logger.info("Part : {} Value : {}", k, v));
  }
}
