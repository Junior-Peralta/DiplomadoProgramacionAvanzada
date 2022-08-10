package edu.programacion.avanzada.juniorperalta.ProyectoFinal.services;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.command.DemoCommand;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.response.DemoResponse;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.patterns.command.CommandBus;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DemoService {

    private final CommandBus commandBus;

    public DemoResponse get(boolean explote) {
        return commandBus.sendCommand(DemoCommand.builder().explote(explote).build());
    }
}
