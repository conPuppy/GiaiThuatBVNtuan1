import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Bai2 {

    //Bài 2: Cho 1 dãy chưa sắp xếp. Sắp xếp lại mảng và hiển thị vị trí ban đầu của mỗi phần tử.
//VD: 3 6 2 7
//=> 2 0 1 3
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        sapxep(n);
    }

    public static void sapxep(int n) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        int[] index = new int[n];
        for (int i = 0; i < n; i++) {
            index[i] = i;
        }
        

    }

}
