import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        sinhVien sv1 = new sinhVien(123, "Phan Lu Quang Thong" , 8.4, 8.5);
        sinhVien sv2 = new sinhVien(234, "Luu Minh Tai", 5.7,7.6);
        sinhVien sv3 = new sinhVien();

        sv3.setMaSV(345);
        sv3.setName("Tran Van Cuong");
        sv3.setDiemLT(4.6);
        sv3.setDiemTH(8.6);

        System.out.print("Nhap ma so sinh vien cua sv3 : ");
        int n = sc.nextInt();sc.nextLine();
        System.out.print("Nhap ho va ten cua sv3 : ");
        String name = sc.nextLine();
        System.out.print("Nhap diem li thuyet cua sv3 : ");
        int lt = sc.nextInt();
        System.out.print("Nhap diem thuc hanh cua sv3 : ");
        int th = sc.nextInt();
        sv3 = new sinhVien(n, name, lt, th);



        System.out.println(String.format("%-15s %-30s %-15s %-15s %-15s",
                "Ma SV", "HoTen", "DiemLT","DiemTH","DiemTB"));
        sv1.toString();
        sv2.toString();
        sv3.toString();
    }
}
