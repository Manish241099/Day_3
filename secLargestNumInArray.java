public class secLargestNumInArray {
    public static void main(String[] args) {
        int largest=Integer.MIN_VALUE;
        int sec_largest=Integer.MIN_VALUE;
        int arr[]={2,35,63,64,56,23,87,97};
        for (int i =0;i< arr.length;i++){
            if(arr[i]>largest)
            {
                sec_largest=largest;
                largest=arr[i];


            }
            else{
                if(arr[i] > sec_largest && arr[i] != largest)
                {
                    sec_largest=arr[i];
                }
            }
        }
        System.out.println("largest element :"+largest);
        System.out.println("second largest:"+sec_largest);



    }
}
