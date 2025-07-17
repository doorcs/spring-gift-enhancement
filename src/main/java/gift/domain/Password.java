package gift.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Password {

    @Column(name = "password", nullable = false)
    private String password;

    protected Password() {}

    public Password(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}
