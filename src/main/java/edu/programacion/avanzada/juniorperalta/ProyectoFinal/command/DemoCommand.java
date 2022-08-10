package edu.programacion.avanzada.juniorperalta.ProyectoFinal.command;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.response.DemoResponse;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.patterns.command.Command;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class DemoCommand extends Command<DemoResponse> {

    private boolean explote;
}
