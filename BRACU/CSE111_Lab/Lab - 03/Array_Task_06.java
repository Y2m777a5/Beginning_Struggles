import java.util.Scanner;
public class Array_Task_06 {
  
  
  public static void main(String[] args) { 
    Scanner sc = new Scanner(System.in);
    System.out.println("Array_Task_06");
    int inp = sc.nextInt();
    int [] arr = new int [inp];
    for(int i=0; i<inp; i++){
      arr[i] = sc.nextInt();
    }
    for(int i=0; i<inp; i++){
      for(int j=0; j<(inp-i-1); j++){
        if(arr[j]>arr[j+1]){
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
        }
      }
    }
    int medv=0;
    if(inp%2!=0){
      medv=arr[inp/2];
    }
    else{
      int n1=arr[(inp/2)-1];
      int n2=arr[inp/2];
      medv=(n1+n2)/2;
    }
    System.out.println("The median is "+medv);
  }
}
