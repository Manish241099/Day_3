public class maxArray {
    public static void main(String[] args) {
        int arr[]={54,7,5,4,2,3};
        int max= arr[0];
        for(int i = 0; i<arr.length;i++)
        {
            if(arr[i] < max) {
                max = arr[i];
                System.out.println(max);
            }
        }

    }
}
