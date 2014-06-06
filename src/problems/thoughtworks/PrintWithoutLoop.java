package problems.thoughtworks;
/**
 * Print a character 1000 times without using loop and recursion.
 * @author satbeer
 *
 */
public class PrintWithoutLoop {
  
  PrintWithoutLoop(){
    System.out.println("A");
  }
  public static void main(String[] args) {
    PrintWithoutLoop[] p = new PrintWithoutLoop[100];
    //function1('A', 0);
  }

  public static void function1(char c, int numofTimes){
    if(numofTimes == 1000){
      return;
    }
    else{
      System.out.println(c + "" + numofTimes);
      numofTimes++;
      function2(c, numofTimes);
    }
  }

  public static void function2(char c, int numofTimes){
    if(numofTimes == 1000){
      return;
    }
    else{
      System.out.println(c + "" + numofTimes);
      numofTimes++;
      function1(c, numofTimes);
    }
  }
  
}
