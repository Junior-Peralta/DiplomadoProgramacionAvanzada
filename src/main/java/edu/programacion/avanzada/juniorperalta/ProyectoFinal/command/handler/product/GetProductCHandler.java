package edu.programacion.avanzada.juniorperalta.ProyectoFinal.command.handler.product;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.command.product.GetProductCommand;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.dto.ProductDTO;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.response.product.GetProductResponse;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.patterns.command.CommandEvent;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.patterns.command.CommandHandler;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@CommandEvent(command = GetProductCommand.class)
@Slf4j
public class GetProductCHandler implements CommandHandler<GetProductResponse, GetProductCommand> {

    private final ProductRepository productRepository;

    @Override
    public GetProductResponse handle(GetProductCommand getProductCommand) {
        log.debug("Get Product {}", getProductCommand.getId());
        ProductDTO productDTO = productRepository.findById(getProductCommand.getId()).orElseThrow().toDTO();
        return GetProductResponse.builder()
                .products(List.of(productDTO))
                .build();
    }
}

