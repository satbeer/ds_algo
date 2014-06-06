package problems.thoughtworks;


/**
 * write a program to perform divison operation of two numbers without using /, %, and modules operator
 * @author satbeer
 *
 */
public class Division {

  
  public static void main(String[] args) {
    int num = 123;
    int divisor = 11;
    int n = num;
    int i=0;
    while(n > divisor){
      n = n - divisor;
      i++;
    }
    System.out.println(String.format("%s divided by %s : quotient %s remainder %s", num, divisor, i, n));
  }
}
