package gift.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "member")
public class Member {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private Email email;

    @Embedded
    private Password password;

    @Embedded
    private Role role;

    protected Member() {}

    public Member(String email, String password) {
        this(null, email, password, "ROLE_USER");
    }

    public Member(Long id, String email, String password, String role) {
        this.id = id;
        this.email = new Email(email);
        this.password = new Password(password);
        this.role = new Role(role);
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return this.email.getEmail();
    }

    public String getPassword() {
        return this.password.getPassword();
    }

    public String getRole() {
        return this.role.getRole();
    }
}
