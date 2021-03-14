public class Vehicle {
    String owner;
    String loaiXe;
    double giaXe , xiLang;

    public Vehicle() {
    }

    public Vehicle(String owner, String loaiXe, double giaXe, double xiLang) {
        this.owner = owner;
        this.loaiXe = loaiXe;
        this.giaXe = giaXe;
        this.xiLang = xiLang;
    }

    public String getOnwe() {
        return owner;
    }

    public void setOnwe(String onwe) {
        this.owner = onwe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public double getGiaXe() {
        return giaXe;
    }

    public void setGiaXe(double giaXe) {
        this.giaXe = giaXe;
    }

    public double getXiLang() {
        return xiLang;
    }

    public void setXiLang(double xiLang) {
        this.xiLang = xiLang;
    }
    public double thue(){
        double answer = 0;
        if(xiLang < 100){
            answer = giaXe * 1/100;
        }
        if(xiLang >= 100 && xiLang <= 200){
            answer = giaXe * 3/100;
        }
        if(xiLang > 200){
            answer = giaXe * 5/100;
        }

        return answer;
    }
    public String inFo(){
        String a = null;
        System.out.printf(String.format("%-30s %-15s %-30s %-15s %-15s ",owner , loaiXe , giaXe , xiLang , thue()));
        System.out.println();
        return a;
    }

}
