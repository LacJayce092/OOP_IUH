public class Main {
    public static void main(String[] args){
        Vehicle xe1 = new Vehicle("Nguyen Van An" , "Wave", 230000000,150);
        Vehicle xe2 = new Vehicle("Tran Thi Thu Trang" , "Future" , 45000000,230);
        Vehicle xe3 = new Vehicle("Le Hoai Bao" , "Honda" , 12000000, 50);

        System.out.println(String.format("%-30s %-15s %-30s %-15s %-15s" ,
                "Chu xe", "Loai xe", "Gia tri xe" , "Dung tich xe", "Thue"));
        xe1.inFo();
        xe2.inFo();
        xe3.inFo();
    }

}
