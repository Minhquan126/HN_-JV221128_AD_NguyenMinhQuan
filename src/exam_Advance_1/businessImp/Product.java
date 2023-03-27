package exam_Advance_1.businessImp;

import exam_Advance_1.business.IShop;

import java.util.List;
import java.util.Scanner;

public class Product implements IShop,Comparable<Product> {
    private int productId;
    private String productName;
    private String title;
    private String descriptions;
    private Catalog catalog;
    private float importPrice;
    private float exportPrice;
    private boolean productStatus;

    public Product() {
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }

    public float getImportPrice() {
        return importPrice;
    }

    public void setImportPrice(float importPrice) {
        this.importPrice = importPrice;
    }

    public float getExportPrice() {
        return exportPrice;
    }

    public void setExportPrice(float exportPrice) {
        this.exportPrice = exportPrice;
    }

    public boolean isProductStatus() {
        return productStatus;
    }

    public void setProductStatus(boolean productStatus) {
        this.productStatus = productStatus;
    }

    @Override
    public void inputData(Scanner scanner, List<Catalog> list) {
        System.out.println("Nhập tên sản phẩm");
        this.productName = scanner.nextLine();
        System.out.println("Nhập tiêu đề sản phẩm");
        this.title = scanner.nextLine();
        System.out.println("Nhập mô tả sản phẩm");
        this.descriptions = scanner.nextLine();
        System.out.println("Chọn mã danh mục sản phẩm");
        int id = Integer.parseInt(scanner.nextLine());
        for (Catalog catalog : list) {
            if (catalog.getCatalogId() == id) {
                setCatalog(catalog);
                break;
            }
        }
        System.out.println("Nhập giá nhập sản phẩm");
this.importPrice = Float.parseFloat(scanner.nextLine());
        System.out.println("Nhập trạng thái sản phẩm");
        this.productStatus = Boolean.parseBoolean(scanner.nextLine());
        this.exportPrice = importPrice*RATE;
    }

    @Override
    public void displayData() {
        System.out.println("-----------------------------------------------");
        System.out.printf("Mã sản phẩm : %d \n",productId);
        System.out.printf("Tên sản phẩm : %s \n",productName);
        System.out.printf("Tên danh mục sản phẩm : %s \n",catalog.getCatalogName());
        System.out.printf("Giá bán sản phẩm : %.1f \n",exportPrice);
        System.out.println("Trạng thái sản phẩm : \n" + (productStatus?"còn bán":"hết hàng"));
        System.out.println("-----------------------------------------------");
    }

    @Override
    public int compareTo(Product product) {
        return (int) (this.importPrice - product.getImportPrice());
    }
}
