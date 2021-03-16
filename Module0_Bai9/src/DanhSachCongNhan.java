public class DanhSachCongNhan extends CongNhan{
    static CongNhan[] arr = new CongNhan[20];

    public DanhSachCongNhan(){
    }
    public void addCN(CongNhan cn1){
        for (int i = 0; i <arr.length; i++) {
            if(arr[i] == null){
               arr[i] = cn1;
                break;
            }else
                System.out.println("Danh sach day ko the them !");
        }
    }
    public String toString(){
        System.out.println("> DANH SACH CONG NHAN VIEN <");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null){
                System.out.println(super.toString());
            }
        }
        return null;
    }
    public static int soCN(){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != null)
                count++;
        }
        return count;
    }


    public String hardCN(){
        System.out.println("Nhung Cong Nhan Lam Tren 200 SP");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].getmSoSP() > 200){
              super.toString();
            }
        }
        return null;
    }

}
