public class Prime {
    public boolean isPrime (int num) {
        int originalNumber;
        if(num != 1){
            originalNumber = num/2;
        } else {
            originalNumber = 1;
        }
        while (originalNumber != 1) {
            if(num % originalNumber == 0){
                return false;
            }
            originalNumber--;
        }
            return true;
    }

    public static void main(String[] args){
        Prime pr = new Prime();
        boolean result = pr.isPrime(4);
        if(result == true){
            System.out.println("Is Prime");
        } else {
            System.out.println("Is not Prime");
        }
    }
}
