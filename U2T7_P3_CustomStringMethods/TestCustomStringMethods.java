package U2T7_P3_CustomStringMethods;

public class TestCustomStringMethods {
    public static void main(String[] args) {
      CustomStringMethods methods = new CustomStringMethods();
  
      // TEST CODE for longerThan method
      boolean bool = methods.longerThan("apple", 4);
      System.out.println(bool);
      bool = methods.longerThan("apple", 5);
      System.out.println(bool);
      bool = methods.longerThan("apple", 2);
      System.out.println(bool);
      bool = methods.longerThan("apple", 7);
      System.out.println(bool);
      System.out.println();  
  
      // TEST CODE FOR funnyString method
      String str = methods.funnyString("computer", 3);
      System.out.println(str);
      str = methods.funnyString("computer", 0);
      System.out.println(str);
      str = methods.funnyString("computer", 7);
      System.out.println(str);
      str = methods.funnyString("apples", 1);
      System.out.println(str);
      System.out.println();
  
      // TEST CODE for halvesReversed method
      str = methods.halvesReversed("computer");  // even #
      System.out.println(str);
      str = methods.halvesReversed("computers");  // odd #
      System.out.println(str);
      str = methods.halvesReversed("sky");
      System.out.println(str);
      str = methods.halvesReversed("weekend");
      System.out.println(str);
      str = methods.halvesReversed("an");
      System.out.println(str);
      str = methods.halvesReversed("I");
      System.out.println(str);
      str = methods.halvesReversed("see you soon");
      System.out.println(str);
      str = methods.halvesReversed("see you later!");
      System.out.println(str);
    }
  }
  