package ecom.spring.library.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ecom.spring.library.model.Category;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private Long id;
    private String name;
    private String description;
    private int currentQuantity;
    private double costPrice;
    private double salePrice;
    private String image;
    private Category category;
    private boolean activated;
    private boolean deleted;
    private String currentPage;
}
