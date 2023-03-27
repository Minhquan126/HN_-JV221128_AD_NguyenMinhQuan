package exam_Advance_1.run;

import exam_Advance_1.businessImp.Catalog;
import exam_Advance_1.businessImp.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Catalog> listCatalogs = new ArrayList<>();
        List<Product> listProduct = new ArrayList<>();
        while (true){
            System.out.println("****************PRODUCT-MENU***************\n" +
                    "1. Nhập số danh mục sản phẩm và nhập thông tin các danh mục.\n" +
                    "2. Nhập số sản phẩm và nhập thông tin các sản phẩm.\n" +
                    "3. Sắp xếp sản phẩm theo giá sản phẩm tăng dần (Comparable/Comparator).\n" +
                    "4. Tìm kiếm sản phẩm theo tên danh mục sản phẩm.\n" +
                    "5. Thoát");
            System.out.println("Nhập để chọn chức năng");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    createCatalog(listCatalogs,scanner);
                    break;
                    case 2:
                        createProduct(listProduct,scanner,listCatalogs);
                    break;
                    case 3:
                        sortByPrice(listProduct);
                    break;
                    case 4:
                        search(listProduct,scanner);
                    break;
                    case 5:
                        System.exit(0);
                    break;
                default:
                    System.out.println("Chọn không chính xác");
            }
        }
    }
    public static void createCatalog(List<Catalog> list,Scanner scanner){
        System.out.println("Nhập số danh mục cần nhập");
        int numb = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numb; i++) {
            Catalog catalog = new Catalog();
            System.out.println("Nhập danh mục thứ : " + (i + 1));
            catalog.inputData(scanner,list);
            if (list.size() == 0){
                catalog.setCatalogId(1);
            } else {
                catalog.setCatalogId(list.get(list.size() -1).getCatalogId() + 1);
            }
            list.add(catalog);
        }
        displayCatalogs(list);
    }
    public static void createProduct(List<Product> list,Scanner scanner,List<Catalog> listCata){
        System.out.println("Nhập số sản phẩm cần nhập");
        int numb = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < numb; i++) {
            Product product = new Product();
            System.out.println("Nhập sản phẩm thứ : " + (i + 1));
            product.inputData(scanner,listCata);
            if (list.size() == 0){
                product.setProductId(1);
            } else {
                product.setProductId(list.get(list.size() -1).getProductId() + 1);
            }
            list.add(product);
        }
        displayProducts(list);
    }
    public static void displayProducts(List<Product> list){
        for (Product product:list) {
            product.displayData();
        }
    }
    public static void displayCatalogs(List<Catalog> list){
        Collections.sort(list);
        for (Catalog catalog:list) {
            catalog.displayData();
        }
    }
public static void sortByPrice(List<Product> list){
List<Product> sortList = new ArrayList<>(list);
    Collections.sort(sortList);
    displayProducts(sortList);
}
public static void search(List<Product> list,Scanner scanner){
        List<Product> listSearch = new ArrayList<>();
    System.out.println("Nhâp tên danh mục của sản phẩm cần tìm");
    String searchCatalog = scanner.nextLine();
    for (Product product: list) {
        if (product.getCatalog().getCatalogName().contains(searchCatalog)){
            listSearch.add(product);
        }
    }
    displayProducts(listSearch);
}
}
