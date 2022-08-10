package edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.request.payment;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.domain.PaymentMethod;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CreatePaymentMRequest {

    private String name;
    private String description;

    public PaymentMethod toPaymentMethod() {
        return PaymentMethod.builder()
                .name(name)
                .description(description)
                .build();
    }
}
