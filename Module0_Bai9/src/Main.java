public class Main {
    public static void main(String[] args) {
        CongNhan cn = new CongNhan();
        CongNhan cn1 = new CongNhan(001 ,"Tran" , "The" ,150);
        CongNhan cn2 = new CongNhan(002 ,"Le" , "Ki" ,120);
        CongNhan cn3 = new CongNhan(003 ,"Phan" , "Tinh" ,230);
        CongNhan cn4 = new CongNhan(004 ,"Pham" , "Tran" ,180);
        CongNhan cn5= new CongNhan(005 ,"Nguyen" , "Dung" ,620);
        System.out.println(cn.toString());

    }
}
