public class Main {

    public static void main(String[] args) {
	// write your code here
        Course course1 = new Course(1,"Yazılım Geliştirici Yetiştirme Kampı (C# + Angular)","c-charpe-course-image.img",
                "Yüzde 98","Engin Demiroğ","engin-demirog.img","%98 Tamamlandı");
        Course course2 = new Course(2,"Yazılım Geliştirici Yetiştirme Kampı (Java + React)","java-course-image.img",
                "Yüzde 88","Engin Demiroğ","engin-demirog.img","%88 Tamamlandı");
        Course[] courses = {course1,course2};

        Lesson lesson1 = new Lesson(1,"Ödev 1","2. Gün");
        Lesson lesson2 = new Lesson(2,"Ödev 2","2. Gün");
        Lesson[] lessons = {lesson1,lesson2};

        LessonManager lessonManager = new LessonManager();
        lessonManager.startLesson(lesson2);

        CourseManager courseManager = new CourseManager();
        courseManager.startCourse(course2);


    }
}
