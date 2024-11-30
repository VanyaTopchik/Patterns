package templatemethod.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HighEndComputerBuilder extends ComputerBuilder {
  private static final Logger logger = LoggerFactory.getLogger(HighEndComputerBuilder.class);

  @Override
  public void addMotherboard() {
    computerParts.put("Motherboard", "High-end Motherboard");
  }

  @Override
  public void setupMotherboard() {
    motherboardSetupStatus.add("Screwing the high-end motherboard to the case.");
    motherboardSetupStatus.add("Pluging in the power supply connectors.");
    motherboardSetupStatus.forEach(logger::info);
  }

  @Override
  public void addProcessor() {
    computerParts.put("Processor", "High-end Processor");
  }
}