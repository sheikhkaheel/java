public class TwoDArray {
    private int[][] array;

    // Constructor to initialize the array with given dimensions
    public TwoDArray(int rows, int columns) {
        array = new int[rows][columns];
    }

    // Method to set the value of an element at specific indices
    public void set(int row, int column, int value) {
        array[row][column] = value;
    }

    // Method to get the value of an element at specific indices
    public int get(int row, int column) {
        return array[row][column];
    }

    // Method to get the number of rows in the array
    public int getRowCount() {
        return array.length;
    }

    // Method to get the number of columns in the array
    public int getColumnCount() {
        return array[0].length;
    }

    public static void main(String[] args) {
        // Create an instance of TwoDimensionalArray with 3 rows and 4 columns
        TwoDArray myArray = new TwoDArray(3, 4);

        // Set values
        myArray.set(0, 0, 1);
        myArray.set(0, 1, 2);
        myArray.set(0, 2, 3);
        myArray.set(0, 3, 4);
        myArray.set(1, 0, 5);
        myArray.set(1, 1, 6);
        myArray.set(1, 2, 7);
        myArray.set(1, 3, 8);
        myArray.set(2, 0, 9);
        myArray.set(2, 1, 10);
        myArray.set(2, 2, 11);
        myArray.set(2, 3, 12);

        int col = myArray.getColumnCount();
        System.out.println("Length of Columns "+col);
        int row = myArray.getRowCount();
        System.out.println("Length of Rows "+row);

        // Print array
        for (int i = 0; i < myArray.getRowCount(); i++) {
            for (int j = 0; j < myArray.getColumnCount(); j++) {
                System.out.print(myArray.get(i, j) + " ");
            }
            System.out.println();
        }
    }
}

