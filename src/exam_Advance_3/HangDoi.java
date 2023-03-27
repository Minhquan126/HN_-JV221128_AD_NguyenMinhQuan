package exam_Advance_3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HangDoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> queue = new LinkedList<>();
        while (true) {
            System.out.println("****************JAVA-HACKATHON-05-ADVANCE-1-MENU***************\n" +
                    "1. Nhập tên phụ huynh nộp hồ sơ\n" +
                    "2. Phụ huynh tiếp theo\n" +
                    "3. Thoát");
            System.out.println("Nhập để chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhập số phụ huynh đăng ký");
                    int numb = Integer.parseInt(scanner.nextLine());
                    for (int i = 0; i < numb; i++) {
                        System.out.println("Nhập tên phụ huynh thứ : " + (i + 1));
                        String name = scanner.nextLine();
                        queue.add(name);
                    }
                    break;
                    case 2:
                        if (queue.isEmpty()){
                            System.out.println("Không có phụ huynh đăng ký");
                        } else {
                            System.out.println("Phụ huynh tiếp theo là : " + queue.poll());
                        }

                    break;
                    case 3:
                        System.exit(0);
                    break;
                default:
                    System.out.println("Chọn không chính xác");
            }
        }
    }
}
