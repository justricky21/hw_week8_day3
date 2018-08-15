package models;

import javax.persistence.*;

@Entity
@Table(name = "mentors")
public class Mentor {
    private String name;
    private Student student;
    private int id;

    public Mentor(String name, Student student) {
        this.name = name;
        this.student = student;
    }

    public Mentor() {
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", nullable = false)
    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
