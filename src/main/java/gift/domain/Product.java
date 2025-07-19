package gift.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import gift.domain.embed.ImageUrl;
import gift.domain.embed.ProductName;
import gift.domain.embed.Price;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private ProductName productName;

    @Embedded
    private Price price;

    @Embedded
    private ImageUrl imageUrl;

    protected Product() {}

    public Product(String name, Long price, String imageUrl) {
        this(null, name, price, imageUrl);
    }

    public Product(Long id, String name, Long price, String imageUrl) {
        this.id = id;
        this.productName = new ProductName(name);
        this.price = new Price(price);
        this.imageUrl = new ImageUrl(imageUrl);
    }

    public Long getId() {
        return id;
    }

    public String getProductName() {
        return productName.getProductName();
    }

    public Long getPrice() {
        return price.getPrice();
    }

    public String getImageUrl() {
        return imageUrl.getImageUrl();
    }
}
