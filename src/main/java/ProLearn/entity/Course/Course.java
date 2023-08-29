//package ProLearn.entity.Course;
//
//import ProLearn.entity.Subject.Subjects;
//import ProLearn.entity.Worker.Worker;
//import lombok.Getter;
//import lombok.Setter;
//
//import javax.persistence.*;
//import java.time.LocalDateTime;
//
//@Entity
//@Table(name = "course")
//@Setter
//@Getter
//public class Course {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    @OneToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name = "subjects_id")
//    private Subjects subjects;
//
//    @ManyToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name = "workers_id")
//    private Worker worker;
//
//    @Column(name = "course_date", nullable = false)
//    private String course_date;
//
//    @Column(name = "course_time", nullable = false)
//    private LocalDateTime course_time;
//
//    @Column(name = "course_price", nullable = false)
//    private String course_price;
//
//    @Column(name = "course_room", nullable = false)
//    private String course_room;
//
//    //studentlar soni
//    @Column(name = "students_number", nullable = false)
//    private Integer students_number;
//
//    //shu kurs bo`yicha kiradigan o`qituvchilar
//    @Column(name = "teachers_number", nullable = false)
//    private Integer teachers_number;
//
//    @Column(name = "definition")
//    private String definition;
//
//    //darslar soni
//    @Column(name = "lessons_number", nullable = false)
//    private Integer lessons_number;
//
//    @Column(name = "created_date", nullable = false)
//    private LocalDateTime createdDate;
//}
