public class SumOfTwoDArray {

    private int[][] array;

    SumOfTwoDArray(int rows, int columns) {
        array = new int[rows][columns];
    }

    public void set(int i, int j , int value){
        array[i][j] = value;
    }

    public int get(int i, int j){
        return array[i][j];
    }

    public int lengthOfRows(){
        return array.length;
    }

    public int lengthOfCols(){
        return array[0].length;
    }

    public static void main(String[] args){
        SumOfTwoDArray array = new SumOfTwoDArray(2,2);

        array.set(0,0,5);
        array.set(0,1,5);
        array.set(1,0,5);
        array.set(1,1,5);

        int sum = 0;

        for(int i = 0; i < array.lengthOfRows(); i++) {
            for(int j = 0; j < array.lengthOfCols(); j++){
                sum += array.get(i,j);
            }
        }
        System.out.println("Sum of Array " + sum);
    }
}
