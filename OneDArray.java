class OneDArray{
    public int array[];

    OneDArray(int size){
        array = new int[size];
    }

    public void set(int index, int value) {
        array[index] = value;
    }

    public int get(int index) {
        return array[index];
    }

    public static void main(String[] args){
        OneDArray arr = new OneDArray(4);
        arr.set(0,2);
        int val = arr.get(0);
        System.out.println("Value at index 0 is "+val);
    }
}