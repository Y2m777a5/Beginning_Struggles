
import java.util.Scanner;
public class Evaluation_2
{  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.println("input num");
    int num = sc.nextInt();
    
    
    if((num>0)&&(num%2==0))
    {
    System.out.println("Number is positive and even ");
    
  }
    else if((num>0)&&!(num%2==0))
    {
    System.out.println("Number is positive and odd ");
    
  }
    else if(num<0)
    {
    System.out.println("Number is negetive ");
    
  }
    else{
    System.out.println("Number is zero");
    }
    
    
    
 }
}