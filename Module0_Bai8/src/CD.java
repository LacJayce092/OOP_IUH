public class CD {
    private String tuaCD;
    private int maCD ,soBH ;
    private double giaThanh;

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        if(maCD <= 0)
            this.maCD = 999999;
        else
            this.maCD = maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        if(tuaCD == null){
            this.tuaCD = "Chua xac dinh !";
        }else
            this.tuaCD = tuaCD;
    }



    public int getSoBH() {
        return soBH;
    }

    public void setSoBH(int soBH) {
        if(soBH > 0)
            this.soBH = soBH;
    }

    public double getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(double giaThanh) {
        if(giaThanh > 0)
            this.giaThanh = giaThanh;
    }

    public CD() {
    }

    public CD(int maCD, String tuaCD, int soBH, double giaThanh) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.soBH = soBH;
        this.giaThanh = giaThanh;
    }
    public String toString(){
        return String.format("%-15s %-15s %-25s %-15s ",maCD ,tuaCD,soBH,giaThanh) ;
    }
}
