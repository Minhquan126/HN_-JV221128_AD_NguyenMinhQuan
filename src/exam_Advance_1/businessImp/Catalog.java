package exam_Advance_1.businessImp;

import exam_Advance_1.business.IShop;

import java.util.List;
import java.util.Scanner;

public class Catalog implements IShop, Comparable<Catalog> {
    private int catalogId;
    private String catalogName;
    private int priority;
    private String descriptions;
    private boolean catalogStatus;

    public Catalog() {
    }

    public int getCatalogId() {
        return catalogId;
    }

    public void setCatalogId(int catalogId) {
        this.catalogId = catalogId;
    }

    public String getCatalogName() {
        return catalogName;
    }

    public void setCatalogName(String catalogName) {
        this.catalogName = catalogName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public boolean isCatalogStatus() {
        return catalogStatus;
    }

    public void setCatalogStatus(boolean catalogStatus) {
        this.catalogStatus = catalogStatus;
    }

    @Override
    public void inputData(Scanner scanner, List<Catalog> list) {
        System.out.println("Nhập tên danh mục");
        this.catalogName = scanner.nextLine();
        System.out.println("Nhập độ ưu tiên danh mục");
        this.priority = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập mô tả danh mục");
        this.descriptions = scanner.nextLine();
        System.out.println("Nhập trạng thái danh mục");
        this.catalogStatus = Boolean.parseBoolean(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("---------------------------------------");
        System.out.printf("Mã danh mục sản phẩm : %d \n",catalogId);
        System.out.printf("tên danh mục sản phẩm : %s \n",catalogName);
        System.out.println("---------------------------------------");
    }

    @Override
    public int compareTo(Catalog catalog) {
        return this.priority - catalog.priority;
    }
}
