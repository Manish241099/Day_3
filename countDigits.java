import java.util.*;
class countDigits
{
public static void main (String arges[])
{
    int n , count=0 ;
    System.out.println("enter the Integer");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    while (n > 0) {
        n = n / 10 ;
        count++;
        
    }
    System.out.println("Digits of Integer are:" + " " + count);
    
}
}