package prototype.example;

import java.util.Objects;

public class CopyableUser implements Copyable<CopyableUser> {
  private String name;
  private Car car;

  public CopyableUser(String name) {
    this.name = name;
  }

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

  @Override
  public CopyableUser copy() {
    CopyableUser copy = new CopyableUser(name);
    if (this.car != null) {
      copy.setCar(new Car(this.car.getModel()));
    }
    return copy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    CopyableUser user = (CopyableUser) o;
    return Objects.equals(name, user.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }

}
