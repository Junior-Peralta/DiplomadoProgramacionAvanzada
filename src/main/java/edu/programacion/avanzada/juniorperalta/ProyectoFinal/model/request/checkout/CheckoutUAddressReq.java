package edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.request.checkout;

import lombok.*;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CheckoutUAddressReq {

    private UUID id;

    private Long address;
}
