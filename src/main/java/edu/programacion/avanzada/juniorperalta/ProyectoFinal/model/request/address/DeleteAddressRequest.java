package edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.request.address;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.command.address.DeleteAddressCommand;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DeleteAddressRequest {

    private Long id;

    public DeleteAddressCommand toCommand() {
        return DeleteAddressCommand.builder()
                .id(id)
                .build();
    }
}
