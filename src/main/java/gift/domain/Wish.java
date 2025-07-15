package gift.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "wishlist_item")
public class Wish {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "member_id", nullable = false)
    private Long memberId;

    @Column(name = "product_id", nullable = false)
    private Long productId;

    @Column(name = "quantity", nullable = false)
    private Long quantity;

    protected Wish() {}

    public Wish(Long memberId, Long productId) {
        this(null, memberId, productId, 1L);
    }

    public Wish(Long id, Long memberId, Long productId, Long quantity) {
        this.id = id;
        this.memberId = memberId;
        this.productId = productId;
        this.quantity = quantity;
    }
}
