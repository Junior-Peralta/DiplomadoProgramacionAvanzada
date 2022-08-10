package edu.programacion.avanzada.juniorperalta.ProyectoFinal.command.handler.address;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.command.address.GetAllAddressCommand;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.domain.Address;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.dto.AddressDTO;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.response.address.GetAddressResponse;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.patterns.command.CommandEvent;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.patterns.command.CommandHandler;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.repositories.AddressRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
@CommandEvent(command = GetAllAddressCommand.class)
@Slf4j
public class GetAllAddressCHandler implements CommandHandler<GetAddressResponse, GetAllAddressCommand> {

    private final AddressRepository addressRepository;

    @Override
    public GetAddressResponse handle(GetAllAddressCommand getAllAddressCommand) {
        log.debug("Get Addresses {}", getAllAddressCommand.toString());
        List<AddressDTO> addressDTOS = addressRepository.findAllByNameContainingIgnoreCase(
                getAllAddressCommand.getName(),
                PageRequest.of(getAllAddressCommand.getPage(), getAllAddressCommand.getPageSize()))
                .stream()
                .map(Address::toDTO)
                .collect(Collectors.toList());
        return GetAddressResponse.builder()
                .addresses(addressDTOS)
                .build();
    }
}

