package edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.response.payment;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.dto.PaymentMethodDTO;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.dto.ProductDTO;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class GetPaymentMResponse {

    private List<PaymentMethodDTO> paymentMethods;
}
