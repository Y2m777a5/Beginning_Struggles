import java.util.Scanner;
public class Array_Task_01 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Array_Task_01");
    System.out.print("N = ");
    int inp = sc.nextInt();
    int [] arr = new int [inp];
    for(int i=0; i<inp; i++){
      arr[i] = sc.nextInt();
    }
    
    System.out.print("Remove Element = ");
    int elmnt = sc.nextInt();
    
    System.out.println("Input array: ");
    for(int i=0; i<inp; i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    boolean flag = false;
    int count = 0;
    for(int i=0; i<inp; i++){
      if(arr[i]==elmnt){
        flag=true;
        count++;
      }
    }
    if(flag){
      int [] narr = new int [inp-count];
      int j=0;
      for(int i=0; i<inp; i++){
        if(arr[i]!=elmnt){
          narr[j]=arr[i];
          j++;
        }
      }
      System.out.println("New array: ");
      for(int i=0; i<narr.length; i++){
        System.out.print(narr[i]+" ");
      }
    }
    else{
      System.out.println("Element not found");
    }
  }
}
