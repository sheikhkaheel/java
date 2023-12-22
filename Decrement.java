import java.util.Scanner;

class Decrement {
    private int[] reverse;

    public int[] printDecrement(int number) {
        reverse = new int[number]; // Initialize the array with the size of 'number'
        int i = 0;

        while (number > 0) {
            reverse[i] = number;
            i++;
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
