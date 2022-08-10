package edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.request.address;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.command.address.CreateAddressCommand;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CreateAddressRequest {

    private String name;
    private String description;

    public CreateAddressCommand toCommand() {
        return CreateAddressCommand.builder()
                .name(name)
                .description(description)
                .build();
    }
}
