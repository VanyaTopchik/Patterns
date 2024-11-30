package prototype.jdk;

import java.util.Objects;
import prototype.example.Car;

public class ClonableUser implements Cloneable {
  private String name;
  private Car car;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Car getCar() {
    return car;
  }

  public void setCar(Car car) {
    this.car = car;
  }

  ClonableUser(String name) {
    this.name = name;
  }

  @Override
  public ClonableUser clone() throws CloneNotSupportedException {
    return (ClonableUser) super.clone();
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    ClonableUser sheep = (ClonableUser) o;
    return Objects.equals(name, sheep.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
