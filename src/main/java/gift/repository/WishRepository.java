package gift.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import gift.domain.Wish;

@Repository
public interface WishRepository extends JpaRepository<Wish, Long> {
}
