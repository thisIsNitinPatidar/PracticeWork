public class sumOfArray {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 5, 6 };
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        System.out.println(sum);
    }
}
