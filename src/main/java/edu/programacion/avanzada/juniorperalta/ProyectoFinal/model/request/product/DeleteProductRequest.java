package edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.request.product;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.command.product.DeleteProductCommand;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DeleteProductRequest {

    private Long id;

    public DeleteProductCommand toCommand() {
        return DeleteProductCommand.builder()
                .id(id)
                .build();
    }
}
