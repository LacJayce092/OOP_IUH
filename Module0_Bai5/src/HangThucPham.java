import java.text.DecimalFormat;
import java.time.LocalDate;

public class HangThucPham {

   private int maHang;
   private String tenHang;
   private double donGia;
    private LocalDate ngaySX , ngayHH;
    private LocalDate ngayHomNay = LocalDate.now();



    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        final int n = this.maHang = maHang;

    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
        if(tenHang == null){
            this.tenHang = "xxx";
        }
    }
    public LocalDate getNgaySX(){
        return ngaySX;
    }
    public  LocalDate getNgayHH(){
       return ngayHH;
    }
    public void setngaySX(LocalDate ngaySX){
        if((ngaySX).isBefore(ngayHomNay)){
            this.ngaySX = ngaySX;
        }else
            this.ngaySX = ngayHomNay;
    }
    public void setngayHH(LocalDate ngayHH){
        if((ngayHH).isBefore(ngaySX)){
            this.ngayHH = ngaySX;
        }else
            this.ngaySX = ngayHH;
    }

    public HangThucPham() {
    }

    public HangThucPham(int maHang, String tenHang, LocalDate ngaySX, LocalDate ngayHH) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.ngaySX = ngaySX;
        this.ngayHH = ngayHH;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        DecimalFormat df  =new DecimalFormat("#, ##0.00");
        this.donGia = donGia;
    }
}
