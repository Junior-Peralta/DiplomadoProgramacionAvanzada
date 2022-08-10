package edu.programacion.avanzada.juniorperalta.ProyectoFinal.command.product;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.response.product.DeleteProductResponse;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.patterns.command.Command;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DeleteProductCommand extends Command<DeleteProductResponse> {

    private Long id;
}

