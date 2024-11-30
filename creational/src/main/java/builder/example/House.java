package builder.example;

public class House {

  private final Walls walls;
  private final Roof roof;
  private final Doors doors;
  private final Windows windows;
  private final boolean hasGarage;
  private final boolean hasPool;
  private final boolean hasMansard;
  private final boolean hasGarden;

  public Walls getWalls() {
    return walls;
  }

  public Roof getRoof() {
    return roof;
  }

  public Doors getDoors() {
    return doors;
  }

  public Windows getWindows() {
    return windows;
  }

  public boolean getHasGarage() {
    return hasGarage;
  }

  public boolean getHasPool() {
    return hasPool;
  }

  public boolean getHasMansard() {
    return hasMansard;
  }

  public boolean getHasGarden() {
    return hasGarden;
  }

  @Override
  public String toString() {
    return "Дом{" +
        "Материал стен '" + walls.getTitle() + "'" +
        ", материал крыши '" + roof.getTitle() + "'" +
        ", материал дверей '" + doors.getTitle() + "'" +
        ", материал окон '" + windows.getTitle() + "'" +
        (hasGarage ? ". Есть гараж" : "") +
        (hasPool ? ". Есть бассейн" : "") +
        (hasMansard ? ". Есть мансарда" : "") +
        (hasGarden ? ". Есть сад" : "") +
        '}';
  }

  public House(Walls walls,
               Roof roof,
               Doors doors,
               Windows windows,
               boolean hasGarage,
               boolean hasPool,
               boolean hasMansard,
               boolean hasGarden) {
    this.walls = walls;
    this.roof = roof;
    this.doors = doors;
    this.windows = windows;
    this.hasGarage = hasGarage;
    this.hasPool = hasPool;
    this.hasMansard = hasMansard;
    this.hasGarden = hasGarden;
  }

  public static class Builder {
    private Walls walls;
    private Roof roof;
    private Doors doors;
    private Windows windows;
    private boolean hasGarage;
    private boolean hasPool;
    private boolean hasMansard;
    private boolean hasGarden;

    public Builder setWalls(Walls walls) {
      this.walls = walls;
      return this;
    }

    public Builder setRoof(Roof roof) {
      this.roof = roof;
      return this;
    }

    public Builder setDoors(Doors doors) {
      this.doors = doors;
      return this;
    }

    public Builder setWindows(Windows windows) {
      this.windows = windows;
      return this;
    }

    public Builder setHasGarage(Boolean hasGarage) {
      this.hasGarage = hasGarage;
      return this;
    }

    public Builder setHasPool(boolean hasPool) {
      this.hasPool = hasPool;
      return this;
    }

    public Builder setHasMansard(boolean hasMansard) {
      this.hasMansard = hasMansard;
      return this;
    }

    public Builder setHasGarden(boolean hasGarden) {
      this.hasGarden = hasGarden;
      return this;
    }

    public House build() {
      validateParams(walls, roof, doors, windows);
      return new House(walls,
          roof,
          doors,
          windows,
          hasGarage,
          hasPool,
          hasMansard,
          hasGarden);
    }

    private void validateParams(Walls walls, Roof roof, Doors doors, Windows windows) {
      if (walls == null || roof == null || doors == null || windows == null)
        throw new IllegalArgumentException("params walls, roof, doors, windows can not be null");
    }
  }
}
