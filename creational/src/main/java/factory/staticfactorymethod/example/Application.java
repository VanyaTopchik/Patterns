package factory.staticfactorymethod.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Application {
  private static final Logger logger = LoggerFactory.getLogger(Application.class);

  public static void main(String[] args) {
    User user1 = User.createWithDefaultCountry("John", "john@domain.com");
    User user2 = User.createWithLoggedInstantiationTime("John", "john@domain.com", "Argentina");
    User testUser = User.createTestInstance();
  }

}