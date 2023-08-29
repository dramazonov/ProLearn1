package ProLearn.entity.Student;

import ProLearn.entity.Address.City;
import ProLearn.entity.Address.Country;
import ProLearn.entity.Address.Region;
import ProLearn.entity.Payment.StudentPayment;
import ProLearn.entity.Subject.SubjectCategory;
import ProLearn.entity.Subject.Subjects;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "student")
@NoArgsConstructor
@Setter
@Getter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(name = "birth_date", nullable = false)
    private LocalDateTime birth_date;

    @Column(name = "definition")
    private String definition;

    @OneToMany
    @JoinTable(name = "student_country",
            joinColumns = {@JoinColumn(name = "student_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id")})
    private Set<Country> countries;

    @OneToMany
    @JoinTable(name = "student_city",
            joinColumns = {@JoinColumn(name = "student_id")},
            inverseJoinColumns = {@JoinColumn(name = "city_id")})
    private Set<City> cities;

    @OneToMany
    @JoinTable(name = "student_region",
            joinColumns = {@JoinColumn(name = "student_id")},
            inverseJoinColumns = {@JoinColumn(name = "region_id")})
    private Set<Region> regions;

    @Column(name = "Address")
    private String address;

    @OneToMany
    @JoinTable(name = "student_market_place",
            joinColumns = {@JoinColumn(name = "student_id")},
            inverseJoinColumns = {@JoinColumn(name = "market_place_id")})
    private Set<MarketPlace> marketPlaces;

    @OneToMany
    @JoinTable(name = "student_discount",
            joinColumns = {@JoinColumn(name = "student_id")},
            inverseJoinColumns = {@JoinColumn(name = "discount_id")})
    private Set<Discount> discounts;

    @OneToMany
    @JoinTable(name = "student_status",
            joinColumns = {@JoinColumn(name = "student_id")},
            inverseJoinColumns = {@JoinColumn(name = "student_status_id")})
    private Set<StudentStatus> studentStatuses;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "subject_category_id")
    private SubjectCategory subjectCategory;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "subjects_id")
    private Subjects subjects;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_payment_id")
    private StudentPayment studentPayment;

    @Column(name = "created_date", nullable = false)
    private LocalDateTime created_date;
}
