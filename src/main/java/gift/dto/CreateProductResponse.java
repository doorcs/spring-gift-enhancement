package gift.dto;

import gift.domain.Product;

public record CreateProductResponse(Long id, String name, Long price, String imageUrl) {

    public static CreateProductResponse from(Product product) {
        return new CreateProductResponse(
            product.getId(),
            product.getProductName(),
            product.getPrice(),
            product.getImageUrl()
        );
    }
}
