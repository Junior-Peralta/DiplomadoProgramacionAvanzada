package edu.programacion.avanzada.juniorperalta.ProyectoFinal.command.address;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.response.address.GetAddressResponse;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.patterns.command.Command;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class GetAddressCommand extends Command<GetAddressResponse> {

    private Long id;
}

