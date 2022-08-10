package edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.request.address;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.command.address.UpdateAddressCommand;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class UpdateAddressRequest {

    private Long id;
    private String name;
    private String description;

    public UpdateAddressCommand toCommand() {
        return UpdateAddressCommand.builder()
                .id(id)
                .name(name)
                .description(description)
                .build();
    }

}
