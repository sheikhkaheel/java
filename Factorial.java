import java.util.Scanner;

public class Factorial {
    private int fact = 1;

    public int calculateFactorial(int number){
        while(number != 0){
            fact = fact * number;
            number--;
        }
        return fact;
    }

    public static void main(String[] args){
        Factorial factorial = new Factorial();
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter Number :- ");
            int num = sc.nextInt();
            System.out.print("Factorial is " + factorial.calculateFactorial(num));
        } 
    }
}
