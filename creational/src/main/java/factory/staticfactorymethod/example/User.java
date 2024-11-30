package factory.staticfactorymethod.example;

import java.time.LocalDateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User {
  private static final Logger logger = LoggerFactory.getLogger(User.class);

  private final String name;
  private final String email;
  private final String country;

  public static User createWithDefaultCountry(String name, String email) {
    return new User(name, email, "Russia");
  }

  public static User createWithLoggedInstantiationTime(String name, String email, String country) {
    logger.info("Creating User instance at : {}", LocalDateTime.now());
    return new User(name, email, country);
  }

  public static User createTestInstance() {
    return new User("test", "test@test.ru", "test");
  }

  private User(String name, String email, String country) {
    this.name = name;
    this.email = email;
    this.country = country;
  }

  public String getName() {
    return name;
  }

  public String getEmail() {
    return email;
  }

  public String getCountry() {
    return country;
  }
}