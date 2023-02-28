import java.util.Scanner;
public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Enter all the grades and type DONE when finished");
        Scanner input = new Scanner(System.in);

       double total = 0;
       int count = 0;
       System.out.print("Enter grade: ");

       while (input.hasNextDouble()){
           System.out.print("Enter grade: ");
           double number = input.nextDouble();
           total = total + number;
           count++;
       }

        double average = 0;
        if (count > 0){
            average = total / count;
        }
        System.out.println("The average of the grades is: "+average);


    }
}
