package gift.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import gift.domain.embed.OptionName;
import gift.domain.embed.Quantity;

@Entity
public class Option {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Embedded
    private OptionName optionName;

    @Embedded
    private Quantity quantity;

    protected Option() {}

    public Option(Product product, String name, Long quantity) {
        this(null, product, name, quantity);
    }

    public Option(Long id, Product product, String name, Long quantity) {
        this.id = id;
        this.product = product;
        this.optionName = new OptionName(name);
        this.quantity = new Quantity(quantity);
    }

    public Long getId() {
        return id;
    }

    public OptionName getOptionName() {
        return optionName;
    }

    public Quantity getQuantity() {
        return quantity;
    }
}
