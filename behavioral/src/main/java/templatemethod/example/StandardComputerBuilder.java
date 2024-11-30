package templatemethod.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class StandardComputerBuilder extends ComputerBuilder {
  private static final Logger logger = LoggerFactory.getLogger(StandardComputerBuilder.class);

  @Override
  public void addMotherboard() {
    computerParts.put("Motherboard", "Standard Motherboard");
  }

  @Override
  public void setupMotherboard() {
    motherboardSetupStatus.add("Screwing the standard motherboard to the case.");
    motherboardSetupStatus.add("Pluging in the power supply connectors.");
    motherboardSetupStatus.forEach(step -> logger.info(step));
  }

  @Override
  public void addProcessor() {
    computerParts.put("Processor", "Standard Processor");
  }
}