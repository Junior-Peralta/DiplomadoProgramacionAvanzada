package edu.programacion.avanzada.juniorperalta.ProyectoFinal.command.handler;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.command.DemoCommand;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.response.DemoResponse;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.patterns.command.CommandEvent;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.patterns.command.CommandHandler;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.saga.SagaFactory;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.patterns.saga.SagaOrchestrator;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.patterns.saga.model.Saga;
import lombok.RequiredArgsConstructor;
import lombok.Value;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
@CommandEvent(command = DemoCommand.class)
@Slf4j
public class DemoCHandler implements CommandHandler<DemoResponse, DemoCommand> {

    private final SagaOrchestrator sagaOrchestrator;
    @Value("60")
    private int timeout;

    @Override
    public DemoResponse handle(DemoCommand demoCommand) {
        Saga<DemoResponse> saga = SagaFactory.createDemoSaga(UUID.randomUUID().toString(), command);
        return SagaOrchestrator.orchestrate(saga, timeout);
    }
}

