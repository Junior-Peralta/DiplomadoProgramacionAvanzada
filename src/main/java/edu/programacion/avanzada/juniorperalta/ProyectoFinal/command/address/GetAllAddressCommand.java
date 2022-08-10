package edu.programacion.avanzada.juniorperalta.ProyectoFinal.command.address;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.response.address.GetAddressResponse;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.patterns.command.Command;
import lombok.*;

@AllArgsConstructor
@Builder
@Getter
@Setter
@ToString
public class GetAllAddressCommand extends Command<GetAddressResponse> {

    private int pageSize;
    private int page;
    private String name;
}

