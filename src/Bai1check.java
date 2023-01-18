import java.util.Scanner;

public class Bai1check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Đã có trong mảng");
                }
            }
        }
        sc.close();
    }
}
