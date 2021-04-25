import java.util.Date;

public class Lesson {
    public  Lesson() {
        System.out.println("Çalıştı");
    }

    public Lesson(int id, String name, String day){
        this.id = id;
        this.name = name;
        this.day = day;
    }
    int id;
    String name;
    String day;
}
