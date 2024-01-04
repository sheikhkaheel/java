import java.util.Scanner;

class Decrement {
    public int[] printDecrement(int number) {
        int[] reverse = new int[number]; // Initialize the array with the size of 'number'

        for (int i = 0; number > 0; i++) {
            reverse[i] = number;
            number--;
        }
        return reverse;
    }

    public static void main(String[] args) {
        Decrement d = new Decrement();
        System.out.print("Enter number: ");
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            int[] result = d.printDecrement(num);
            System.out.print("Decrement of " + num + ": ");
            for (int value : result) {
                System.out.print(value + " ");
            }
        }
    }
}
