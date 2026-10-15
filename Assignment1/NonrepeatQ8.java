public class NonrepeatQ8 {
    public static int firstNonRepeating(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return arr[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8};
        int result = firstNonRepeating(arr);
        System.out.println("First non-repeating element: " + result);
    }
}