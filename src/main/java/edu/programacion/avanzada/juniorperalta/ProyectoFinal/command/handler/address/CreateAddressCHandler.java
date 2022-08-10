package edu.programacion.avanzada.juniorperalta.ProyectoFinal.command.handler.address;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.command.address.CreateAddressCommand;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.domain.Address;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.response.address.CreateAddressResponse;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.patterns.command.CommandEvent;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.patterns.command.CommandHandler;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.repositories.AddressRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@CommandEvent(command = CreateAddressCommand.class)
@Slf4j
public class CreateAddressCHandler implements CommandHandler<CreateAddressResponse, CreateAddressCommand> {

    private final AddressRepository addressRepository;

    @Override
    public CreateAddressResponse handle(CreateAddressCommand createAddressCommand) {
        Address address = addressRepository.save(createAddressCommand.toPaymentMethod());
        log.info("Address {} created", address.getId());
        return CreateAddressResponse.builder()
                .address(address.toDTO())
                .build();
    }
}

