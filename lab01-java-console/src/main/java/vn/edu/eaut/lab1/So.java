package vn.edu.eaut.lab1;

public class So {

    // Bài 1
    public int tongSoChan(int n) {
        int tong = 0;

        for (int i = 2; i <= n; i += 2) {
            tong += i;
        }

        return tong;
    }

    // Bài 2
    public double tongNghichDao(int n) {
        double tong = 0;

        for (int i = 1; i <= n; i++) {
            tong += 1.0 / i;
        }

        return tong;
    }

    // Bài 3
    public boolean laSoNguyenTo(int n) {

        if (n < 2)
            return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {

            if (n % i == 0)
                return false;
        }

        return true;
    }

    // Bài 4
    public String phanLoaiTamGiac(double a, double b, double c) {

        if (a + b <= c || a + c <= b || b + c <= a)
            return "Khong phai tam giac";

        if (a == b && b == c)
            return "Tam giac deu";

        if (a * a + b * b == c * c ||
                a * a + c * c == b * b ||
                b * b + c * c == a * a)
            return "Tam giac vuong";

        if (a == b || a == c || b == c)
            return "Tam giac can";

        return "Tam giac thuong";
    }

    // Bài 5
    public void fibonacci(int n) {

        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {

            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }

        System.out.println();
    }

}