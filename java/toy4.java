public class toy4 {
    void show()
    {
        System.out.println("hello");
    }
}
class abc extends toy4{ 
    void eat()
    {
        System.out.println("welcome");
    }
}
class pqr extends abc{
    void cat()
    {
        System.out.println("shailendra");
    }
    public static void main(String[] args) {
        pqr sc=new pqr();
        sc.show();
        sc.eat();
        sc.cat();
    }
}
