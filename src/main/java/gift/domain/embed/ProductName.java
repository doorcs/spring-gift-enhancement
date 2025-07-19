package gift.domain.embed;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class ProductName {

    @Column(name = "name", nullable = false)
    private String productName;

    protected ProductName() {}

    public ProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }
}
