import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws NonIntegerExceptions {
        int num;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your number: ");
        num = s.nextInt();
        try {
            int res = factorial.calculator(num);
            System.out.println("The factorial of the number is: "+res);
        }catch (NegativeIntegerExceptions e){
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid number: ");
            s.nextLine();
        }
    }
    }
