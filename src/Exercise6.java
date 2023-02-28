import java.util.Scanner;
public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please type integer to find sum of digits!");
        int n = input.nextInt();
        int sum = 0;
        while (n > 0){
            int temp = n % 10;
            sum = sum + temp;
            n = n / 10;
        }

        System.out.println("The sum of the digits of this integer is: "+sum);

    }
}
