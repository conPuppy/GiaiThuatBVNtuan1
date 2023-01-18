import java.util.Scanner;

public class Bai3 {
//    Sắp xếp lại mảng không dùng hàm có sẵn, không dùng 2 for lồng
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] index = new int[n];

        // Nhập mảng và lưu vị trí ban đầu của mỗi phần tử
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            index[i] = i;
        }

        // Sắp xếp mảng
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                    // Cập nhật lại vị trí ban đầu của mỗi phần tử
                    int tempIndex = index[i];
                    index[i] = index[j];
                    index[j] = tempIndex;
                }
            }
        }

        // Hiển thị vị trí ban đầu của mỗi phần tử
        for (int i = 0; i < n; i++) {
            System.out.print(index[i] + " ");
        }
        sc.close();
    }
}
