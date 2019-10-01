import java.util.Scanner;
 
class MicroAndArrayUpdate {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
 
        while (testCases > 0) {
            int arrSize = scanner.nextInt();
            int K = scanner.nextInt();
 
            int[] arr = new int[arrSize];
            for (int i = 0; i < arrSize; i++) {
                arr[i] = scanner.nextInt();
            }
 
            int min = arr[0];
            for (int i = 1; i < arrSize; i++) {
                if (arr[i] < min)
                    min = arr[i];
            }
 
            if (min < K)
                System.out.println(K - min);
            else
                System.out.println(0);
 
            testCases--;
        }
    }
}
 
