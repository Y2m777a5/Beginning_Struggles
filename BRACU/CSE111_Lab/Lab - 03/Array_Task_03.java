import java.util.Scanner;
public class Array_Task_03 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Array_Task_03");
    System.out.print("N = ");
    int inp = sc.nextInt();
    int temp = 0;
    int [] arr = new int [inp];
    
    for(int i=0; i<inp; i++){
      arr[i] = sc.nextInt();
    }
    for(int i=0, j=inp-1; i<(inp/2); i++, j--){
      temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
    }
    for(int i=0; i<inp; i++){
      if(i!=inp-1){
       System.out.print(arr[i]+" ");
      }
      else{
        System.out.println(arr[i]);
      }
    }
  }
}
