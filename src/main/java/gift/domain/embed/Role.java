package gift.domain.embed;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Role {

    @Column(name = "role", nullable = false)
    private String role;

    protected Role() {}

    public Role(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }
}
