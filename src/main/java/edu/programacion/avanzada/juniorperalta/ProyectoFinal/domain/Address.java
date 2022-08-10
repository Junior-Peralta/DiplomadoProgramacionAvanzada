package edu.programacion.avanzada.juniorperalta.ProyectoFinal.domain;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.dto.AddressDTO;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.dto.PaymentMethodDTO;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.request.address.UpdateAddressRequest;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.request.payment.UpdatePaymentMRequest;
import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Entity
@Table(name = "addresses")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    public AddressDTO toDTO() {
        return AddressDTO.builder()
                .id(id)
                .name(name)
                .description(description)
                .build();
    }

}
