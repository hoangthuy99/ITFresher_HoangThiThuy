import java.util.Scanner;

public class BT1 {
    public static void main(String[] args) {
//        Bài 1: Tạo lớp Exam01 trong package ra. Khai báo mảng số nguyên một chiều gồm
//        100 phần tử. In menu và thực hiên các chức năng theo menu sau:
// ************************MENU**************************
//        1. Nhập giá trị n phần tử của mảng (n nhập từ bàn phím) [03 điểm]
//        2. In giá trị các phần tử trong mảng [03 điểm]
//        3. Tính trung bình các phần tử dương (>0) trong mảng [03 điểm]
//        4. In ra vị trí (chỉ số) các phần tử có giá trị bằng k trong
//        mảng (k nhập từ bàn phím) [05 điểm]
//        5. Sử dụng thuật toán sắp xếp nổi bọt sắp xếp mảng giảm dần [05 điểm]
//        6. Tính số lượng các phần tử là số nguyên tố trong mảng [10 điểm]
//        7. Sắp xếp các phần tử chẵn chia hết cho 3 ở đầu mảng theo thứ tự tăng
//        dần, các phần tử lẻ chia hết cho 3 ở cuối mảng theo thứ tự giảm dần,
//        các phần tử còn lại ở giữa mảng theo thứ tự tăng dần [10 điểm]
//        8. Nhập giá trị m từ bàn phím, chèn giá trị m vào mảng (sắp xếp giảm
//                dần) đúng vị trí [10 điểm]
//        9. Thoát [01 điểm]
        int size = 100;
        int[] arr = new int[size];
        int length = 0;

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("************************MENU**************************");
            System.out.println("1.Nhập giá trị n phần tử của mảng (n nhập từ bàn phím) ");
            System.out.println("2.In giá trị các phần tử trong mảng");
            System.out.println("3.Tính trung bình các phần tử dương (>0) trong mảng");
            System.out.println("4.In ra vị trí(chỉ số) các phần tử có giá trị bằng k trong mảng ");
            System.out.println("5.Sử dụng thuật toán sắp xếp nổi bọt sắp xếp mảng giảm dần");
            System.out.println("6.Tính số lượng các phần tử là số nguyên tố trong mảng");
            System.out.println("7.Sắp xếp các phần tử chẵn chia hết cho 3 ở đầu mảng theo thứ tự tăng dần, các phần tử lẻ " +
                    "\n chia hết cho 3 ở cuối mảng theo thứ tự giảm dần, các phần tử còn lại ở giữa mảng theo thứ tự tăng dần");
            System.out.println("8. Nhập giá trị m từ bàn phím, chèn giá trị m vào mảng");
            System.out.println("9.Thoát");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Nhập số lượng của mảng: ");
                    System.out.println("Nhập giá trị của phần tử mảng: ");
                    int n = scanner.nextInt();
                    length = Math.min(n, size);
                    for (int i = 0; i < length; i++) {
                        System.out.printf(" Phần tử %d có giá trị là:", i);
                        arr[i] = scanner.nextInt();
                    }
                    break;
                case 2:
                    System.out.println("Các phần tử có giá trị trong mảng: ");
                    for (int i = 0; i < length; i++) {
                        System.out.print(arr[i] + "\t");
                    }
                    System.out.println();
                    break;
                case 3:
                    int sum = 0;
                    int count = 0;
                    for (int i = 0; i < length; i++) {
                        sum += arr[i];
                        count++;
                    }
                    if (count > 0) {
                        float avarage = (float) sum / count;
                        System.out.println("Trung bình các phần tử dương là: " + avarage);
                    }
                    break;
                case 4:
                    System.out.println("Nhập giá trị k cần tìm: ");
                    int k = scanner.nextInt();
                    System.out.printf("Vị trí của k %d trong mang la:", k);
                    for (int i = 0; i < length; i++) {
                        if (arr[i] == k) {
                            System.out.printf("%d", i);
                        }
                    }
                    break;
                case 5:
                    for (int i = 0; i < length - 1; i++) {
                        for (int j = 0; j < length - 1; j++) {
                            if (arr[i] < arr[j+1]){
                                int temp = arr[j] ;
                                arr[j] = arr[j+1];
                                arr[j+1]  = temp;

                            }
                        }
                    }
                    System.out.println("Dãy số sau khi được giảm dần là:");
                    for (int i = 0; i < length; i++) {
                        System.out.print(arr[i] + "\t");
                    }
                    System.out.println();
                    break;
                case 6:
                    int counts = 0;
                    for (int i = 0; i < length; i++) {
                        boolean isPrime = true;
                        if (arr[i] >= 2) {
                            for (int j = 2; j <= Math.sqrt(arr[i]); j++) {
                                if (arr[i] % j == 0) {
                                    isPrime = false;
                                    break;
                                }
                            }
                        } else {
                            isPrime = false;
                        }
                        if (isPrime) {
                            counts++;
                        }
                    }
                    System.out.printf("Số lương các phần tử là số nguyên tố trong mảng là: %d", counts);

                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bạn nhập sai, vui lòng nhập lai!");
                    break;
            }
        } while (true);
    }
}
