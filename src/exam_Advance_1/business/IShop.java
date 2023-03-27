package exam_Advance_1.business;

import exam_Advance_1.businessImp.Catalog;

import java.util.List;
import java.util.Scanner;

public interface IShop {
    float RATE = 1.3F;
    void inputData(Scanner scanner, List<Catalog> list);
    void displayData();
}
