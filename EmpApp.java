
import java.util.Scanner;

public class EmpApp {
    double salary, exp , amount;
    double new_salary, new_amount, extra_expense;
    String name,gender;
	private Scanner sc;
    
    void getData(){
        sc = new Scanner(System.in);
        System.out.println("Name: ");
        name = sc.next();
        System.out.println("Gender: ");
        gender = sc.next();
        System.out.println("Salary: ");
        salary = sc.nextInt();
        System.out.println("Experience: ");
        exp = sc.nextInt();
    }
    
    void appraisal(){
        new_salary = salary;
        if(salary>=10000)
            new_salary = new_salary + (new_salary*0.03);
        if(gender.equals("female"))
            new_salary = new_salary + (new_salary*0.015);
        if(exp >= 5)
            new_salary = new_salary + (new_salary *0.02);
        System.out.println("New salary = "+ new_salary);
    }
    void extraExpense(){
        extra_expense = new_salary - salary;
        System.out.println("Extra Expense: "+ (extra_expense *12));
        
    }
    public static void main(String[] args) {
        EmpApp emp1[];
        emp1 = new EmpApp[5];
         for(int i =0; i< 5; i++){
            emp1[i] = new EmpApp();
         }
  
        for(int i =0; i< 3; i++){
            emp1[i].getData();
            emp1[i].appraisal();
            emp1[i].extraExpense();
        }
        
    }
    
}
