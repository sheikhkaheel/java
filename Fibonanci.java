class Fibonacci {
    public void generateFibonacci(int num) {
        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
        }

        int[] array = new int[num];
        array[0] = 0;
        if (num > 1) {
            array[1] = 1;
        }

        System.out.print("Fibonacci: " + array[0] + " " + array[1]);

        for (int i = 2; i < num; i++) {
            array[i] = array[i - 1] + array[i - 2];
            System.out.print(" " + array[i]);
        }

        System.out.println();  // Add a newline for better output formatting
    }

    public static void main(String[] args) {
        Fibonacci fb = new Fibonacci();
        fb.generateFibonacci(5);

    }
}
