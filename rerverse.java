import java.util.*;
/**
 * rerverse
 */
public class rerverse {

    public static void main(String[] args) {
        int n ;
        System.out.print("enter the Number");
        Scanner sc= new Scanner(System.in);
        n = sc.nextInt();

        while(n > 0)
        {
           int  result = n % 10 ;
           
           n =n /10;
           System.out.print(result);
           
            

        }
        
    }

    public static class primeFactors {

        public static void main(String[] args) {

            // positive number
            int number = 60;
            int flag=0;

            System.out.print("Factors of " + number + " are: ");

            // loop runs from 1 to 60
            for (int i = 2; i <= number; ++i) {

                // if number is divided by i
                // i is the factor
                if (number % i == 0) {
                    System.out.print(i + " ");

                for (int j = 2;j<=i;j++) {
                    if (number % i == 0) {
                        System.out.println(j);

                        flag = 1;
                        break;
                    }
                }

                }

            }
                }
            }
}