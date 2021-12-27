import static java.lang.Math.*;

class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    // Array
    int[] myints = new int[20];
    myints[0] = 0;
    myints[1] = 1;
    System.out.println(myints[1]);

    // The E constant, and the pow() method
    // come from the imported Math library:
    System.out.println(E); // 2.718281828459045
    System.out.println(pow(2, 3)); // 8.0
  }
}