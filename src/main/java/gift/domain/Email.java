package gift.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Email {

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    protected Email() {}

    public Email(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
