package db;

import models.Lesson;
import models.Student;

public class DBStudent {

    public static void addLessonToStudent(Student student, Lesson lesson){
        lesson.addStudent(student);
        student.addLesson(lesson);
        DBHelper.update(student);

    }
}
