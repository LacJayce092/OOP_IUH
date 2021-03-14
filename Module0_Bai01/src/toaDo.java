public class toaDo {
    int x ;
    int y ;
    String name;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getName() {
        return name;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setName(String name) {
        this.name = name;
    }
    //constructor mac dinh
    public toaDo() {

    }

    public toaDo(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }
    public String toString(){
        System.out.println(name +"("+ x +"," + y +")");
        return null;
    }
}
