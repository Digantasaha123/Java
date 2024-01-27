public class StoneMonster extends Monster {
  private String power;

  public StoneMonster(String name, String power) {
    super(name);
    this.power = power;
  }

  public void display() {
    System.out.println("This is a stone monster named " + name + " with power " + power);
  }
}
