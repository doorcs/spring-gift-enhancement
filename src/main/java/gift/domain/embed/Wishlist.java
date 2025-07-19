package gift.domain.embed;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.OneToMany;

import gift.domain.Wish;

@Embeddable
public class Wishlist {

    @OneToMany(mappedBy = "member", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Wish> wishes;

    public Wishlist() {
        this.wishes = new ArrayList<>();
    }

    public void add(Wish wish) {
        this.wishes.add(wish);
    }

    public void remove(Wish wish) {
        this.wishes.removeIf(elem -> elem.getProduct().getId().equals(wish.getProduct().getId()));
    }
}
