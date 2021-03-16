public class HinhTron extends ToaDo{
    private ToaDo tam ;
    private double banKinh;
    final double Pi = 3.14;

    public ToaDo getTam() {
        return tam;
    }

    public void setTam(ToaDo tam) {
        this.tam = tam;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    public HinhTron() {
    }

    public HinhTron(ToaDo tam, double banKinh) {

        this.tam = tam;
        this.banKinh = banKinh;
    }
    public double chuVi(){
        double answer = 2 * Pi * banKinh;
        return answer;
    }
    public double dienTich(){
        double result = Pi * Math.pow(banKinh, 2);
        return  result;
    }
    public String toString(){
        return "Hinh tron co tam " + tam.getName() +"(" + tam.getX() + "," + tam.getY() + ") " +
                "co ban kinh la " + banKinh + " co dien tich va chu vi lan luot la " + dienTich() + " va " + chuVi();
    }
}
