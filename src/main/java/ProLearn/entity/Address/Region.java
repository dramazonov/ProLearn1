package ProLearn.entity.Address;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "region")
@NoArgsConstructor
@Setter
@Getter
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany
    @JoinTable(name = "city_names",
            joinColumns = {@JoinColumn(name = "region_id")},
            inverseJoinColumns = {@JoinColumn(name = "city_id")})
    private Set<City> city;
}
