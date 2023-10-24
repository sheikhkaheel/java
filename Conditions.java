import java.util.*;
public class Conditions {
    public static void main(String[] args){
        System.out.println("Enter age");
        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();

            if(age < 18){
                System.out.println("You are minor");
            } else{
                System.out.println("Your are adult");
            }
        }
    }
} 
    

