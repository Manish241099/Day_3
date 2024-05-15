public class oddEvenNumINArr {
    public static void main(String[] args) {
        int arr[]={1,3,4,5,6,7,8,9};

        System.out.println("odd number in array:");
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] % 2 != 0)
            {
                System.out.println(arr[i]);
            }
        }
        System.out.println("even number in array:");
        for(int i =0;i<arr.length;i++)
        {
            if(arr[i] % 2 ==0)
            {
               System.out.println(arr[i]);
            }
        }
    }

    public static class computeQnR {
        public static void main(String[] args) {
            int divident= 35;
            int divisor=6;
            int Quotient= divident / divisor;
            int reminder= divident%divisor;
            System.out.println("Quotient is"+Quotient);
            System.out.println("reminder is"+reminder);






        }

    }

    public static class swapNumber {
        public static void main(String[] args) {
            int x=100;
            int y=200;
            System.out.println("value of x before swap"+x);
            System.out.println("value of y before swap"+y);
            int temp = x;
            x=y;
            y=temp;
            System.out.println("value of x after swap"+x);
            System.out.println("value of y after swap"+y);
        }
    }
}
