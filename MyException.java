public class MyException {
    public static void main(String[] args) {
        try {
            float num = 2/0;
            System.out.print(num);
        } catch (ArithmeticException ex) {
            System.out.print("Expection " + ex.getMessage());
        }
    }
}
