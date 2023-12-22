public class Swap {
    public void printSwap(int num1,int num2){
        int temp = num1;
        int a = num2;
        int b = temp;

        System.out.println("Swap of num1 & num2 " + a + " " + b);
    }

    public static void main(String[] args){
        Swap sw = new Swap();
        sw.printSwap(2,4);
    }
}
