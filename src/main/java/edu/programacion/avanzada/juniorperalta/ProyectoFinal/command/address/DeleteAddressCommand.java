package edu.programacion.avanzada.juniorperalta.ProyectoFinal.command.address;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.response.address.DeleteAddressResponse;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.patterns.command.Command;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DeleteAddressCommand extends Command<DeleteAddressResponse> {

    private Long id;
}

