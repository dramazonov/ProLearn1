package ProLearn.entity.Worker;

import ProLearn.entity.Address.City;
import ProLearn.entity.Address.Country;
import ProLearn.entity.Address.Region;
import ProLearn.entity.Subject.SubjectCategory;
import ProLearn.entity.Subject.Subjects;
import ProLearn.entity.template.AbsEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Set;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "users")
public class User extends AbsEntity implements UserDetails {

    @Column(nullable = false)
    private String nickName;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    private String middleName;

    @Column(nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private LocalDateTime birthDate;

    private String password;

    @Column(name = "worker_group_number", nullable = false)
    private Integer workerGroupNumber;

    @Column(name = "definition")
    private String definition;

    @OneToMany
    @JoinTable(name = "user_country",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "country_id")})
    private Set<Country> countries;

    @OneToMany
    @JoinTable(name = "user_city",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "city_id")})
    private Set<City> cities;

    @OneToMany
    @JoinTable(name = "user_region",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "region_id")})
    private Set<Region> regions;

    @Column(name = "Address")
    private String address;

    @ManyToMany
    @JoinTable(name = "user_roles",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "role_id")})
    private Set<Role> roles;


    @ManyToMany
    @JoinTable(name = "user_subject_categories",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "subject_categories_id")})
    private Set<SubjectCategory> subjectCategories;


    @ManyToMany
    @JoinTable(name = "user_subjects",
            joinColumns = {@JoinColumn(name = "user_id")},
            inverseJoinColumns = {@JoinColumn(name = "subjects_id")})
    private Set<Subjects> subjects;

    private LocalDateTime created_date;

    private boolean enabled = true;
    private boolean accountNonExpired = true;
    private boolean accountNonLocked = true;
    private boolean credentialsNonExpired = true;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return roles;
    }


    @Override
    public String getUsername() {
        return firstName + " " + lastName + " " + middleName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return credentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return enabled;
    }
}
