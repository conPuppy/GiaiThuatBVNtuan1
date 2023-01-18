import java.util.Scanner;

public class Bai5 {
    //    Bài 5: Cho n chiếc giày, in ra tổng số đôi có thể ghép được biết 2 chiếc giày ghép thành 1 đôi phải thỏa mãn:
//- Hai chiếc giày phải cùng cỡ
//- Hai chiếc giày phải khác bên
//Ví dụ: R12 và L12 là 1 đôi
//
//Đầu vào:
//- Dòng đầu tiên là số chiếc giày n
//- n dòng tiếp là mỗi chiếc giày có định dạng (R-x hoặc L-x). Trong đó R là bên phải, L là bên trái, x là cỡ
//Đầu ra:
//- Một dòng duy nhất là số đôi có thể ghép
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] shoes = new int[101]; // Mảng lưu trữ số lượng của mỗi cỡ giày
        int count = 0;
        while (n-- > 0) {
            String shoe = sc.next();
            int size = Integer.parseInt(shoe.substring(2)); // Lấy ra cỡ giày
            if (shoe.startsWith("R")) {
                shoes[size]++;
            } else {
                if (shoes[size] > 0) {
                    shoes[size]--;
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }

}
