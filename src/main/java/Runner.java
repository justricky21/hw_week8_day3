import db.DBHelper;
import db.DBStudent;
import models.Course;
import models.Lesson;
import models.Mentor;
import models.Student;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Course course1 = new Course("Advanced Shenanigans", "pHD");
        DBHelper.save(course1);
        Course course2 = new Course("Prime Ministering", "HND");
        DBHelper.save(course2);

        Lesson lesson1 = new Lesson("Bickering over taxation", 10, course2);
        DBHelper.save(lesson1);
        Lesson lesson2 = new Lesson("Writing on walls", 9, course1);
        DBHelper.save(lesson2);
        Lesson lesson3 = new Lesson("Constituency allocation", 8, course2);
        DBHelper.save(lesson3);
        Lesson lesson4 = new Lesson("Using Facebook without anyone noticing", 7, course1);
        DBHelper.save(lesson4);

        Student student1 = new Student("Mrs Tate", 230123, 67, course1);
        DBHelper.save(student1);
        Student student2 = new Student("An Absolute Madlad", 123231, 22, course2);
        DBHelper.save(student2);

        Mentor mentor1 = new Mentor("Mr Jefferson", student1);
        DBHelper.save(mentor1);

        Mentor mentor2 = new Mentor("A pure legend", student2);
        DBHelper.save(mentor2);

        DBStudent.addLessonToStudent(student1, lesson1);
        DBStudent.addLessonToStudent(student1, lesson3);
        DBStudent.addLessonToStudent(student2, lesson2);
        DBStudent.addLessonToStudent(student1, lesson4);

        List<Course> courses = DBHelper.getAll(Course.class);
        List<Lesson> lessons = DBHelper.getAll(Lesson.class);
        List<Student> students = DBHelper.getAll(Student.class);
        List<Mentor> mentors = DBHelper.getAll(Mentor.class);

    }
}
