package gift.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import gift.domain.Wish;
import gift.dto.WishItem;

@Repository
public interface WishRepository extends JpaRepository<Wish, Long> {

    @Query("""
        SELECT new gift.dto.WishItem(w.id, p.id, p.price.price, p.name.name, p.imageUrl.imageUrl, w.quantity.quantity)
        FROM Wish AS w
        JOIN w.product AS p
        WHERE w.member.id = :memberId
        """)
    List<WishItem> findAllProductByMemberId(Long memberId, Pageable pageable);
}
