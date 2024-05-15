public class palindrome {
public static void main(String[] args) {
    int n=0,temp,sum =0   ,result;
    n=121;
    System.out.println("number:"+n);
    temp=n;
    while( n > 0)
    {
        result=n %10 ;
        sum = sum *10 + result;
        n=n/10;
        
    }
if (temp == sum) {
    System.out.println("Integer is palendrome");
} 
 else  
{  
    System.out.println("Integer is not palendrome");
}

    
}
}
