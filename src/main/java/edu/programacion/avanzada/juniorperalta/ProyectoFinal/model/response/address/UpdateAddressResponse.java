package edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.response.address;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.dto.AddressDTO;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.dto.PaymentMethodDTO;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UpdateAddressResponse {

    private AddressDTO address;
}
