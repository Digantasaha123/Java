public class FireMonster extends Monster {
  private String power;

  public FireMonster(String name, String power) {
    super(name);
    this.power = power;
  }

  public void display() {
    System.out.println("This is a fire monster named " + name + " with power " + power);
  }
}