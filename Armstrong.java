public class Armstrong {
    public boolean getNumber(int num){
        int originalNumber = num;
        int isArmstrong = 0,count = 0;
        
        while(originalNumber != 0){
            originalNumber /= 10;
            count ++;
        }
        originalNumber = num;
        while(originalNumber != 0){
            int remainder = originalNumber % 10;
            isArmstrong += Math.pow(remainder,count);
            originalNumber /= 10;
        }
        if(num == isArmstrong) {
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Armstrong arm = new Armstrong();
        boolean result = arm.getNumber(371);

        if(result){
            System.out.print("Its a Armstrong number");
        } else {
            System.out.print("Its not a Armstrong number");
        }
    }
}
