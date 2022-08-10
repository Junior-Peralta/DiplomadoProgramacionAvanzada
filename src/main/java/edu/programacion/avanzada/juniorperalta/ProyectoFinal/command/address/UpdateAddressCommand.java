package edu.programacion.avanzada.juniorperalta.ProyectoFinal.command.address;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.response.address.UpdateAddressResponse;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.patterns.command.Command;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UpdateAddressCommand extends Command<UpdateAddressResponse> {

    private Long id;
    private String name;
    private String description;
}

