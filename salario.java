import java.util.Scanner;

public class salario {
        public static void main(String[] args) {
        Scanner lector= new Scanner(System.in);
        System.out.println("*** Welcome ***");
        System.out.println("Put your salary: ");
        double salary = lector.nextInt();
        
        double newsalary = (salary*5)/100;
        double income = newsalary + salary;
        
        System.out.println("Your new salary is: " + income);
    }
}

