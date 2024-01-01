public class Armstrong {
    public int getNumber(int num){
        return num;
    }

    public static void main(String[] args){
        Armstrong arm = new Armstrong();
        int number = arm.getNumber(371);
        int originalNumber = number;
        int isArmstrong = 0,count = 0;
        
        while(originalNumber != 0){
            originalNumber /= 10;
            count ++;
        }

        originalNumber = number;

        while(originalNumber != 0){
            int remainder = originalNumber % 10;
            isArmstrong += Math.pow(remainder,count);
            originalNumber /= 10;
        }

        if(number == isArmstrong){
            System.out.print("Its a Armstrong number");
        } else {
            System.out.print("Its not a Armstrong number");
        }
    }
}
