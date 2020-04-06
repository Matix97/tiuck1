/**
 * Main class which runs the whole application
 *
 * @author Mateusz
 * @version 1.0
 * @since 2020-03-31
 */
public class Main {
  /** Sample first data */
  private int x;

  /** Sample second data */
  private double sasda;

  /** Sample third data */
  private String sa = "asdasdasd";

  /**
   * This is the main method which makes use of addNum method.
   *
   * @param args Unused.
   * @return Nothing.
   */
  public static void main(String[] args) {
    System.out.println("Hello world");

    System.out.println("asdasd");
  }

  /**
   * Gets the first and last name of this Student.
   *
   * @return this Student's name.
   */
  public String getName() {
    return "name";
  }

  /**
   * Changes the name of this Student. This may involve a lengthy legal process.
   *
   * @param newName This Student's new name. Should include both first and last name.
   */
  public void setName(String newName) {
    System.out.println(newName);
  }
}
