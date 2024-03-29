package edu.programacion.avanzada.juniorperalta.ProyectoFinal.domain;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.dto.ProductDTO;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.request.product.UpdateProductRequest;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @Column
    private long availableQuantity;

    @Column
    private BigDecimal price;

    public ProductDTO toDTO() {
        return ProductDTO.builder()
                .id(id)
                .name(name)
                .description(description)
                .availableQuantity(availableQuantity)
                .price(price)
                .build();
    }

}
