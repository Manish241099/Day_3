public class dupValue {
    public static void main(String[] args) {
        int arr[]={2,5,6,7,4,3,5,3,2,7,6};


        for(int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i]==arr[j])
                {

                    System.out.println(arr[j]);
                    break;

                }
            }

        }


    }
}
