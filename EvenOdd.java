class EvenODD {
    public int Tell(int num){
        return num;
    }

    public static void main (String[] args){
        EvenODD eo = new EvenODD();
        int result = eo.Tell(9);
        if(result % 2 == 0){
            System.out.print("Its is even number");
        } else {
            System.out.print("Its is odd number");
        }
    }
}