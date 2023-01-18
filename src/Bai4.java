import java.util.Scanner;

public class Bai4 {
//    Thống kê số lần xuất hiện của mỗi phần tử trong 1 chuỗi nhập vào
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

        // Sắp xếp mảng bằng thuật toán Quick Sort
        quickSort(arr, index, 0, n - 1);

        // Hiển thị vị trí ban đầu của mỗi phần tử
        for (int i = 0; i < n; i++) {
            System.out.print(index[i] + " ");
        }
        sc.close();
    }

    public static void quickSort(int[] arr, int[] index, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, index, low, high);
            quickSort(arr, index, low, pivot - 1);
            quickSort(arr, index, pivot + 1, high);
        }
    }

    public static int partition(int[] arr, int[] index, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, index, i, j);
            }
        }
        swap(arr, index, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] arr, int[] index, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

        int tempIndex = index[i];
        index[i] = index[j];
        index[j] = tempIndex;
    }
}
