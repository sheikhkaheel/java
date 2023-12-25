class MineException extends Exception {
    public MineException(String message) {
        super(message);
    }
}

class Exp {
    public void Check(int age) throws MineException {
        if (age < 18) {
            throw new MineException("Age should be above 18");
        } else {
            System.out.println("Welcome");
        }
    }
}

class ThrowMineException {
    public static void main(String[] args) {
        try {
            Exp exp = new Exp();
            exp.Check(15); // Pass the desired age to check
        } catch (MineException ex) {
            System.out.println(ex);
        }
    }
}
