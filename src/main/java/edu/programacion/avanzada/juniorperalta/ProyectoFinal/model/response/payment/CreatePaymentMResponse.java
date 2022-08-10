package edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.response.payment;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.dto.PaymentMethodDTO;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.dto.ProductDTO;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CreatePaymentMResponse {

    private PaymentMethodDTO paymentMethod;
}
