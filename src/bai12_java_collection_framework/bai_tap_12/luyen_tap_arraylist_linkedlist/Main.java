package bai12_java_collection_framework.bai_tap_12.luyen_tap_arraylist_linkedlist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "iPhone 12", 20000);
        Product product2 = new Product(2, "iPhone 11", 15000);
        Product product3 = new Product(3, "iPhone 12 pro max", 35000);
        Product product4 = new Product(4, "iPhone 8 plus", 9000);
        Product product5 = new Product(5, "iPhone 7 plus", 5000);
        ProductManager productManager = new ProductManager();
        productManager.add(product1);
        productManager.add(product2);
        productManager.add(product3);
        productManager.add(product4);
        productManager.add(product5);
        System.out.println("Chọn chức năng: \n" +
                "1/ Thêm sản phẩm \n" +
                "2/ Sửa tên sản phẩm theo id \n" +
                "3/ Sửa giá sản phẩm theo id \n" +
                "4/ Xóa sản phẩm theo id \n" +
                "5/ Hiển thị danh sách sản phẩm \n" +
                "6/ Tìm kiếm sản phẩm theo tên \n" +
                "7/ Sắp xếp sản phẩm theo giá tăng dần \n" +
                "8/ Sắp xếp sản phẩm theo giá giảm dần \n" +
                "9/ Thoát chương trình.");
        boolean checkLoop = true;
        while (checkLoop) {
            Scanner scanner = new Scanner(System.in);
            int luaChon = scanner.nextInt();
            switch (luaChon) {
                case 1:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("Nhập id:");
                    int id = scanner1.nextInt();
                    if(productManager.searchId(id).equals("Không tìm thấy id "+id)){
                        System.out.println("Nhập tên sản phẩm:");
                        String name = scanner1.next();
                        System.out.println("Nhập giá sản phẩm:");
                        int price = scanner1.nextInt();
                        Product product = new Product(id, name, price);
                        productManager.add(product);
                        productManager.display();
                        break;
                    }else{
                        System.out.println("id "+id+" đã tồn tại");
                        break;
                    }

                case 2:
                    System.out.println("Nhập id cần chỉnh sửa tên");
                    Scanner scanner2 = new Scanner(System.in);
                    int idEditName = scanner2.nextInt();
                    if (productManager.searchId(idEditName).equals("Không tìm thấy id " + idEditName)) {
                        System.out.println("Không tìm thấy id " + idEditName);
                        break;
                    } else {
                        System.out.println("Nhập tên mới");
                        Scanner scanner3 = new Scanner(System.in);
                        String nameNew = scanner3.nextLine();
                        productManager.editName(idEditName, nameNew);
                        productManager.display();
                        break;
                    }
                case 3:
                    System.out.println("Nhập id cần chỉnh sửa giá");
                    Scanner scanner4 = new Scanner(System.in);
                    int idEditPrice = scanner4.nextInt();
                    if (productManager.searchId(idEditPrice).equals("Không tìm thấy id " + idEditPrice)) {
                        System.out.println("Không tìm thấy id " + idEditPrice);
                        break;
                    } else {
                        System.out.println("Nhập giá mới");
                        int newPrice = scanner4.nextInt();
                        productManager.editPrice(idEditPrice, newPrice);
                        productManager.display();
                        break;
                    }
                case 4:
                    System.out.println("Nhập id cần xóa:");
                    Scanner scanner5 = new Scanner(System.in);
                    int idRemove = scanner5.nextInt();
                    if (productManager.searchId(idRemove).equals("Không tìm thấy id " + idRemove)) {
                        System.out.println("Không tìm thấy id " + idRemove);
                        break;
                    } else {
                        System.out.println(productManager.remove(idRemove));
                        productManager.display();
                        break;
                    }
                case 5:
                    System.out.println("Hiển thị danh sách sản phẩm:");
                    productManager.display();
                    break;
                case 6:
                    System.out.println("Nhập tên sản phẩm cần tìm kiếm");
                    Scanner scanner6 = new Scanner(System.in);
                    String nameSearch = scanner6.nextLine();
                    System.out.println(productManager.searchName(nameSearch));
                    break;
                case 7:
                    System.out.println("Sắp xếp theo giá sản phẩm tăng dần:");
                    productManager.sortByPriceIncrease();
                    productManager.display();
                    break;
                case 8:
                    System.out.println("Sắp xếp theo giá sản phẩm giảm dần");
                    productManager.sortByPriceDecrease();
                    productManager.display();
                    break;
                case 9:
                    checkLoop = false;
                    break;
                default:
                    System.out.println("Nhập lại 1-9");
            }
        }
    }
}
