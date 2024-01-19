package finaloutput;
import java.util.Scanner;

public class Finaloutput {
 public static int sum = 0, num1 = 0, num2 = 0, num3 = 0, num4 = 0, num5 = 0, num6 = 0;
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Hello, Human!\n I am AI your assistant\n How can I help you: ");
        String line = sc.nextLine();
        System.out.print("Okay then, let's find out\n First things first, Enter your first month salary: ");
        num1 = sc.nextInt();
        System.out.print("Enter your second month salary: ");
        num2 = sc.nextInt();        
        System.out.print("Enter your third month salary: ");
        num3 = sc.nextInt();
        System.out.print("Enter your fourth month salary: ");
        num4 = sc.nextInt();
        System.out.print("Enter your fifth month salary: ");
        num5 = sc.nextInt();
        System.out.print("Enter your sixth month salary: ");
        num6 = sc.nextInt();
        addNum(num1, num2, num3, num4, num5, num6);
          
        System.out.print("How much is your budget for tuition: ");
        int budget = sc.nextInt();
        checkTuitionBudget(budget);
        
        
     }
        
        public static int addNum(int a, int b, int c, int d, int e, int f) {
        sum = a + b + c + d + e + f;
        System.out.println("Your overall salary in sixth months is "+sum);
        return sum;
       
        }

         

             public static void checkTuitionBudget(int budget) {
                
        if(budget <= 5000) {
            System.out.println("Your allotted budget is capable of enrolling into Bataan Peninsula State University");
        }   else if((budget >= 10000) && (budget <= 19000)) {
            System.out.println("Your allotted budget is capable of enrolling into De La Salle University");
        }   else if((budget >= 20000 ) && (budget <= 29000)) {
            System.out.println("Your allotted budget is capable of enrolling into University of San Carlos");
        }   else if((budget >= 30000) && (budget <= 39000)) {
            System.out.println("Your allotted budget is capable of enrolling into Mapua University");
        }   else if((budget >= 40000) && (budget <= 49000)) {
            System.out.println("Your allotted budget is capable of enrolling into University of Santo Thomas");
        }   else if((budget >= 50000) && (budget <= 59000)) {
            System.out.println("Your allotted budget is capable of enrolling into Far Eastern University");
        }   else if((budget >= 60000) && (budget <= 69000)) {
            System.out.println("Your allotted budget is capable of enrolling into Ateneo de Manila University"); 
        }   else if((budget >= 70000) && (budget <= 79000)) {
            System.out.println("Your allotted budget is capable of enrolling into Diliman Univeristy");
        }   else if((budget >= 80000) && (budget <= 89000)) {
            System.out.println("Your allotted budget is capable of enrolling into Normal University");
        }   else if((budget >= 90000) && (budget <= 99000)) {
            System.out.println("Your allotted budget is capable of enrolling into Centro Escolar Univeristy");
        }   else if((budget >= 100000) && (budget <= 109000)) {
            System.out.println("Your allotted budget is capable of enrolling into Holy Angel University");
            
        }
    }
}
         
        
       