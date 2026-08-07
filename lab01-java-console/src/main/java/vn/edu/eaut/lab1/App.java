package vn.edu.eaut.lab1;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        So so = new So();

        int chon;

        do {

            System.out.println("\n========== MENU ==========");
            System.out.println("1. Tinh tong so chan");
            System.out.println("2. Tinh tong nghich dao");
            System.out.println("3. Kiem tra so nguyen to");
            System.out.println("4. Kiem tra va phan loai tam giac");
            System.out.println("5. Hien thi day Fibonacci");
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");

            chon = sc.nextInt();

            switch (chon) {

                case 1:
                    System.out.print("Nhap n: ");
                    int n1 = sc.nextInt();
                    System.out.println("Tong = " + so.tongSoChan(n1));
                    break;

                case 2:
                    System.out.print("Nhap n: ");
                    int n2 = sc.nextInt();
                    System.out.println("Tong = " + so.tongNghichDao(n2));
                    break;

                case 3:
                    System.out.print("Nhap n: ");
                    int n3 = sc.nextInt();

                    if (so.laSoNguyenTo(n3))
                        System.out.println(n3 + " la so nguyen to");
                    else
                        System.out.println(n3 + " khong la so nguyen to");

                    break;

                case 4:

                    System.out.print("Nhap a: ");
                    double a = sc.nextDouble();

                    System.out.print("Nhap b: ");
                    double b = sc.nextDouble();

                    System.out.print("Nhap c: ");
                    double c = sc.nextDouble();

                    System.out.println(so.phanLoaiTamGiac(a, b, c));

                    break;

                case 5:

                    System.out.print("Nhap n: ");
                    int n5 = sc.nextInt();

                    so.fibonacci(n5);

                    break;

                case 0:
                    System.out.println("Tam biet!");
                    break;

                default:
                    System.out.println("Lua chon khong hop le!");
            }

        } while (chon != 0);

        sc.close();
    }
}