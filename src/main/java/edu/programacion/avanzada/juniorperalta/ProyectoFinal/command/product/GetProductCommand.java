package edu.programacion.avanzada.juniorperalta.ProyectoFinal.command.product;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.response.product.GetProductResponse;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.patterns.command.Command;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class GetProductCommand extends Command<GetProductResponse> {

    private Long id;
}

