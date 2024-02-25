public class SumOfArray {
    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3},  // 06
            {4, 5, 6},  // 15
            {7, 8, 9}   // 24
        };

        int sum = calculateSum(array);
        System.out.println("Sum of the array: " + sum);
    }

    public static int calculateSum(int[][] array) {
        int sum = 0;
        // Iterate through each row
        for (int i = 0; i < array.length; i++) {
            // Iterate through each column in the current row
            for (int j = 0; j < array[i].length; j++) {
                // Add the current element to the sum
                sum += array[i][j];
            }
        }
        return sum;
    }
}
