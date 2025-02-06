
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        while(n > 1){
            System.out.println(n+ " is a prime number");
            break;
        }
        sc.close();
    }
}
