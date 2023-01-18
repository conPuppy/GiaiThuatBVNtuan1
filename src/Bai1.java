import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Bai1 {

    //    Bài 1: Nhập vào 1 số nguyên n là số lượng phần tử trong dãy.
//    Tiếp theo lần lượt là các phần tử của 1 dãy. Xuất mảng ra màn hình.
//    Nếu phần tử đấy xuất hiện từ lần thứ 2 trở đi thì hiển thị "Đã có trong mảng".
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        show(n);
    }

    public static void show(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        int max = arr[0];
        for (int i : arr) {
            if(max<i) {
                max = i;
            }
        }
        System.out.println(Arrays.toString(arr));
        int[] result = new int[max+1];
        for (int i : result) {
            i=0;
        }
        for (int i = 0; i < n; i++) {
               result[arr[i]]++;
        }
        System.out.println(Arrays.toString(result));
        for (int i = 0; i < result.length; i++) {
            if(result[i]>=2) {
                System.out.println(i+" Da co trong mang");
            }
        }
    }
}