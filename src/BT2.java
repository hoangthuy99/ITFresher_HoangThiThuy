import java.util.Scanner;

public class BT2 {
    public static void main(String[] args) {
//        Bài 2: Tạo lớp Exam02 trong package ra. Khai báo mảng số nguyên hai chiều gồm
//        n*m phần tử (n, m nhập từ bàn phím). In menu và thực hiên các chức năng theo menu
//        sau:
// ************************MENU**************************
//        1. Nhập giá trị các phần tử của mảng [03 điểm]
//        2. In giá trị các phần tử trong mảng theo ma trận [03 điểm]
//        3. Tính số lượng các phần tử chia hết cho 2 và 3 trong mảng [03 điểm]
//        4. In các phần tử và tổng các phần tử nằm trên đường biên, đường chéo chính và
//        đường chéo phụ [05 điểm]
//        5. Sử dụng thuật toán sắp xếp lựa chọn sắp xếp các phần tử tăng dần theo cột của
//        mảng [10 điểm]
//        6. In ra các phần tử là số nguyên tố trong mảng [05 điểm]
//        7. Sử dụng thuật toán chèn (Insertion sort) sắp xếp các phần tử trên đường chéo chính
//        của mảng giảm dần [10 điểm]
//        8. Nhập giá trị một mảng 1 chiều gồm m phần tử và chỉ số dòng muốn chèn vào mảng,
//                thực hiện chèn vào mảng 2 chiều
//        9.Thoat
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số dòng m: ");
        int m = scanner.nextInt();
        System.out.println("Nhập số cột n: ");
        int n = scanner.nextInt();
        int[][] arr = new int[m][n];
        do {
            System.out.println("1. Nhập giá trị các phần tử của mảng");
            System.out.println("2. In giá trị các phần tử trong mảng theo ma trận");
            System.out.println("3. Tính số lượng các phần tử chia hết cho 2 và 3 trong mảng");
            System.out.println("4. In các phần tử và tổng các phần tử nằm trên đường biên, đường chéo chính và\n" + "đường chéo phụ ");
            System.out.println("5. Sử dụng thuật toán sắp xếp lựa chọn sắp xếp các phần tử tăng dần theo cột của mảng");
            System.out.println("6. In ra các phần tử là số nguyên tố trong mảng");
            System.out.println("7. Sử dụng thuật toán chèn (Insertion sort) sắp xếp các phần tử trên đường chéo chính\n" +
                    "của mảng giảm dần");
            System.out.println("8. Nhập giá trị một mảng 1 chiều gồm m phần tử và chỉ số dòng muốn chèn vào mảng,\n" +
                    "thực hiện chèn vào mảng 2 chiều ");
            System.out.println("9.Thoát");

            int choose = scanner.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Nhâp giá trị của phần tử mảng: ");
                    for (int i = 0; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.printf("Giá trị %d[]%d[]", i, j);
                            arr[i][j] = scanner.nextInt();
                        }
                    }
                    break;
                case 2:
                    System.out.println("Giá trị các phần tử trong mảng: ");
                    for (int i = 0; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print(arr[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    int count = 0;
                    for (int[] row : arr) {
                        for (int value : row) {
                            if (value % 2 == 0 && value % 3 == 0) {
                                count++;
                            }
                        }
                    }
                    System.out.println("Số lượng phần tử chia hết cho 2 và 3 là: " + count);
                    break;
                case 4:
                    int sum = 0;
                    int sum1 = 0;
                    int sum2 = 0;
                    System.out.println("Cac phan tu tren duong bien");
                    for (int i = 0; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                            if (i == 0 || i == arr.length - 1 || j == 0 || j == arr[0].length - 1) {
                                System.out.print(arr[i][j] + "\t");
                                sum += arr[i][j];
                            }
                        }

                    }

                    System.out.println("Các phần tử trên đường chéo chính là:");
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[0].length; j++) {
                            if (i == j) {
                                System.out.print(arr[i][j] + "\t");
                                sum1 += arr[i][j];
                            } else {
                                System.out.print("\t");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("Các phần tử trên đường chéo phụ là:");
                    for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[0].length; j++) {
                            if (i + j == arr.length - 1) {
                                System.out.print(arr[i][j] + "\t");
                                sum2 += arr[i][j];
                            } else {
                                System.out.print("\t");
                            }
                        }
                        System.out.println();
                    }
                    System.out.println("Tong cac duong bien la: " + sum);
                    System.out.println("Tổng các phần tử trên đường chéo chính là: " + sum1);
                    System.out.println("Tổng các phần tử trên đường chéo phụ là: " + sum2);
                    break;
                case 5:
                    int k = m * n;
                    for (int i = 0; i < k - 1; i++) {
                        for (int j = i + 1; j < k; j++) {
                            if (arr[i / n][i % n] > arr[j / n][j % n]) {
                                int temp = arr[i / n][j % n];
                                arr[i / n][i % n] = arr[j / n][j % n];
                                arr[j / n][j % n] = temp;
                            }
                        }
                    }
                    System.out.println("Mảng sau khi sắp xếp tăng dần là: ");
                    for (int i = 0; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print(arr[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 6:
                    System.out.println("Cac so nguyen to trong mang la:");
                    for (int i = 0; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                            boolean isPreme = true;
                            if (arr[i][j] > 2) {
                                for (int l = 0; l <= Math.sqrt(arr[i][j]); l++) {
                                    if (arr[i][j] % l == 0) {
                                        isPreme = false;
                                        break;
                                    }
                                }
                            } else {
                                isPreme = false;
                            }
                            if (isPreme) {
                                System.out.println(arr[i][j]);
                            }
                        }
                    }

                    System.out.println();
                    break;
                case 7:

                case 8:
                    System.out.print("Nhập số phần tử của mảng 1 chiều: ");
                    int z = scanner.nextInt();
                    int[] array = new int[m];
                    System.out.println("Nhập giá trị cho mảng 1 chiều:");
                    for (int i = 0; i < z; i++) {
                        array[i] = scanner.nextInt();
                    }
                    System.out.print("Nhập chỉ số dòng muốn chèn (từ 0 đến " + (z - 1) + "): ");
                    int rowIndex = scanner.nextInt();
                    if (rowIndex < 0 || rowIndex >= arr.length) {
                        System.out.println("Chỉ số dòng không hợp lệ.");
                        return;
                    }
                    for (int i = 0; i < array.length; i++) {
                        arr[rowIndex][i] = array[i];
                    }
                    System.out.println("Mảng sau khi sắp xếp là: ");
                    for (int i = 0; i < m; i++) {
                        for (int j = 0; j < n; j++) {
                            System.out.print(arr[i][j] + "\t");
                        }
                        System.out.println();
                    }
                    break;
                case 9:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bạn nhập sai, vui lòng nhập lại: ");
                    break;
            }
        } while (true);


    }
}
