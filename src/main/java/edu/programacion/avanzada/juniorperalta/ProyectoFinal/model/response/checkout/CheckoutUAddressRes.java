package edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.response.checkout;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.dto.CheckoutDTO;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CheckoutUAddressRes {

    private CheckoutDTO checkout;
}
