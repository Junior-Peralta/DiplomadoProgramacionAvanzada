package edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.response.order;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.dto.OrderDTO;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.dto.PaymentMethodDTO;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class GetOrderResponse {

    private List<OrderDTO> orders;
}
