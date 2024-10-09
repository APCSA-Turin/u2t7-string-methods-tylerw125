package U2T7_P3_CustomStringMethods;

public class CustomStringMethods {
    public CustomStringMethods() {
    }
  
    public boolean longerThan(String myString, int maxLength) {
      return myString.length() > maxLength;
    }
  
    public String funnyString(String str, int idx) {
      char ch = str.charAt(idx);
      return ch + str + ch;
    }
  
    public String halvesReversed(String myString) {
      int length = myString.length();
      int mid = length / 2;
      String firstHalf = myString.substring(0, mid);
      String secondHalf = myString.substring(mid);
  
      return secondHalf + firstHalf;
    }
  }
  
  