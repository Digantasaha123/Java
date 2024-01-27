public class WaterMonster extends Monster {
  private String power;

  public WaterMonster(String name, String power) {
    super(name);
    this.power = power;
  }

  public void display() {
    System.out.println("This is a water monster named " + name + " with power " + power);
  }
}