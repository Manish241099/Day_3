public class sort {
    public static void main(String[] args) {
        int arr[] = {6, 2, 9, 6, 3, 5, 4};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }


        }
        for (int n : arr) {
            System.out.print(n);

        }

    }
}
