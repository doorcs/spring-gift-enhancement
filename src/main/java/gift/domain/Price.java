package gift.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class Price {

    @Column(name = "price", nullable = false)
    private Long price;

    protected Price() {}

    public Price(Long price) {
        this.price = price;
    }

    public Long getPrice() {
        return price;
    }
}
