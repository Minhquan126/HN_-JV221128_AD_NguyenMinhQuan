package exam_Advance_2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class ReverseDocument {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] list = new String[0];
        Stack<String> stackString = new Stack<>();
        while (true){
            System.out.println("****************REVERSE-DOCUMENT-MENU***************\n" +
                    "1. Nhập câu\n" +
                    "2. Đảo ngược câu\n" +
                    "3. Thoát");
            System.out.println("Nhập chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("Nhập văn bản");
                    String document = scanner.nextLine();
                   String[] listDocument = document.split(" ");
                   list = listDocument;
                    break;
                    case 2:
                        String[] newList = new String[list.length];
                        for (int i = 0; i < list.length; i++) {
                            stackString.push(list[i]);
                        }
                        for (int i = 0; i < list.length; i++) {
                            newList[i] = stackString.pop();
                        }
                        for (int i = 0; i < list.length; i++) {
                            System.out.print(newList[i] + " ");
                        }
                    break;
                    case 3:
                        System.exit(0);
                    break;
                default:
                    System.out.println("Nhập không chính xác");
            }
        }
    }
}
