package gift.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Name {

    @Column(name = "name", nullable = false)
    private String name;

    protected Name() {}

    public Name(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
