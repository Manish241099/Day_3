public class EvenElementInArray {
    public static void main(String arg[]){
    int arr[]={1,2,3,4,5,6,7,8,9,10};
    int count=0;
    
      System.out.println("Even number in array:");

    for(int i=0;i<=arr.length;i++)
    {
        if(arr[i]%2  ==0)
        {
            System.out.println(arr[i]);
            count++;
        }
    }
}

    public static class arrayReverse {
        public static void main(String[] args) {

            int [] arr =  {1, 2, 3, 4, 5};
            System.out.println("Original array: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
            System.out.println("Array in reverse order: ");

            for (int i = arr.length-1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}