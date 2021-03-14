public class sinhVien {
    int maSV;
    String name;
    double diemLT, diemTH;

    public sinhVien() {
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public void setDiemLT(double diemLT) {
        this.diemLT = diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }

    public void setDiemTH(double diemTH) {
        this.diemTH = diemTH;
    }

    public sinhVien(int maSV, String name, double diemLT, double diemTH) {
        this.maSV = maSV;
        this.name = name;
        this.diemLT = diemLT;
        this.diemTH = diemTH;

    }
    public double diemTB(){
        return (diemLT + diemTH)/2;
    }
    public String toString(){

        System.out.println(String.format("%-15s %-30s %-15s %-15s %-15s",
                maSV, name , diemLT, diemTH , diemTB()));
        return null;
    }
}
