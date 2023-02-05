import java.util.Scanner;
//Program for prime factorization
public class PrimeFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to find prime factors");
        int num = scanner.nextInt();

        for (int i = 2; i <= num ; i++) {
            while(num%i==0){                //checking if completely divisible
                System.out.println(i);
                num=num/i;                  //taking remainder in num
            }
        }
    }
}