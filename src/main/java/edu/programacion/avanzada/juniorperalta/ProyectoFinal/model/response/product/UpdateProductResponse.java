package edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.response.product;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.dto.ProductDTO;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UpdateProductResponse {

    private ProductDTO product;
}
