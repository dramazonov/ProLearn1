package ProLearn.entity.Subject;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "subjects")
@NoArgsConstructor
@Setter
@Getter
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToMany
    @JoinTable(name = "subject_categories",
            joinColumns = {@JoinColumn(name = "subjects_id")},
            inverseJoinColumns = {@JoinColumn(name = "subject_categories_id")})
    private Set<SubjectCategory> subjectCategory;
}
