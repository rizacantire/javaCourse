public class Course {
    public  Course() {
        System.out.println("Çalıştı");
    }
    public Course( int id,String name, String image, String processBar, String teacher,String teacherImage,String completion){
        this.id = id;
        this.teacher = teacher;
        this.image = image;
        this.name = name;
        this.teacherImage= teacherImage;
        this.completion = completion;
        this.processBar = processBar;

    }
    int id;
    String name;
    String image;
    String processBar;
    String teacher;
    String teacherImage;
    String completion;
}
