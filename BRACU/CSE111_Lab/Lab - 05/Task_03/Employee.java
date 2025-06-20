
public class Employee {
  public String name;
  public double salary;
  public String designation;
  
  public void newEmployee(String name){
    this.name = name;
    salary = 30000.0;
    designation = "junior";
  }
  
  public void displayInfo(){
    System.out.println("Employee Name: "+name);
    System.out.println("Employee Salary: "+salary);
    System.out.println("Employee Designation: "+designation);
  }
  
  public void calculateTax(){
    if(salary>30000 && salary<=50000){
      System.out.println(name+" Tax Amount: "+(salary*0.1));
    }
    else if(salary>50000){
      System.out.println(name+" Tax Amount: "+(salary*0.3));
    }
    else{
       System.out.println("No need to pay tax");
    }
  }
  
  public void promoteEmployee(String designation){
    this.designation=designation;
    if(designation.equals("senior")){
      System.out.println(name+" has been promoted to lead"+"\n"+"New Salary: "+(salary+=25000.00));
    }
    if(designation.equals("lead")){
      System.out.println(name+" has been promoted to lead"+"\n"+"New Salary: "+(salary+=50000.00));
    }
    if(designation.equals("manager")){
      System.out.println(name+" has been promoted to lead"+"\n"+"New Salary: "+(salary+=75000.00));
    }
  }
}
