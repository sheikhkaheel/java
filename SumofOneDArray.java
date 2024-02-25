public class SumofOneDArray {
    private int[] array;

    SumofOneDArray(int size){
        array = new int[size];
    }

    public void set(int index, int value){
        array[index] = value;
    }

    public int get(int index){
        return array[index];
    }

    public int lengthOfArray(){
        return array.length;
    }


    public static void main(String[] args) {
        SumofOneDArray array = new SumofOneDArray(3);

        array.set(0,5);
        array.set(1,10);
        array.set(2,15);

        int sum = 0;

        System.out.print("Elements in array ");
        for(int i = 0; i < array.lengthOfArray(); i++) {
            System.out.print(array.get(i) + " ");
            sum += array.get(i);
        }
        System.out.println();
        System.out.println("Sum of 1D Array " + sum);
    }

}
