import java.util.Scanner;
public class Task_2 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    int i = 1;
    int sum = 0;
    while(i<=10){
      System.out.print("Enter number:");
      int num = sc.nextInt();
      sum = sum + num;
      System.out.println("Sum ="+sum);
      i++;
    }
  }
  
  /* ADD YOUR CODE HERE */
  
}
