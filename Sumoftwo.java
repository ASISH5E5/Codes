/*import scanner library for scan the input
The main class called Sum
The main method
syntax for scanning [Scanner name=new Scanner(System.in)
scanning inputs a and b
sum of a and b
Syntax for output [System.out.println]
*/
import java.util.*;

class Sum{

  public static void main(String []args){
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int sum=a+b;
    System.out.println("The sum of "+a+" and "+b+" is "+sum);
  }
}
