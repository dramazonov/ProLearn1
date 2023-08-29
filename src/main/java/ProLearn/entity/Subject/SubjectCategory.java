package ProLearn.entity.Subject;

//fanlar categoriyasi(aniq, ijtimoiy....)

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "subject_category")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class SubjectCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;
}
