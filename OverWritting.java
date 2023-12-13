public class OverWritting {
    
    public static void main(String[] args) {
        WriteAgain wr = new WriteAgain();
        wr.write();
    }
}


class Writing {
    public void write() {
        System.out.println("Written...");
    }
}

class WriteAgain extends Writing {
    @Override
    public void write() {
        System.out.println("Overwritten...");
    }
}
