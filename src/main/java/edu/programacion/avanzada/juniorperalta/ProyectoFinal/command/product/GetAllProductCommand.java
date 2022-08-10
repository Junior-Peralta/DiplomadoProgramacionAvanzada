package edu.programacion.avanzada.juniorperalta.ProyectoFinal.command.product;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.response.product.GetProductResponse;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.patterns.command.Command;
import lombok.*;

@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class GetAllProductCommand extends Command<GetProductResponse> {

}

