import java.util.Scanner;
public class String_Task_03 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.println("String_Task_03");
    String str = sc.nextLine();
    int len = str.length();
    for(int i=0; i<len; i++){
      String out = "";
      for(int j=0; j<=i; j++){
        char chr = str.charAt(j);
        out+=chr;
      }
      System.out.println(out);
    }
  }
}
