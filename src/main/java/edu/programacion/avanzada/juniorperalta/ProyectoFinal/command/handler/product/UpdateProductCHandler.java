package edu.programacion.avanzada.juniorperalta.ProyectoFinal.command.handler.product;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.command.product.UpdateProductCommand;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.domain.Product;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.response.product.UpdateProductResponse;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.patterns.command.CommandEvent;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.patterns.command.CommandHandler;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.repositories.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@CommandEvent(command = UpdateProductCommand.class)
@Slf4j
public class UpdateProductCHandler implements CommandHandler<UpdateProductResponse, UpdateProductCommand> {

    private final ProductRepository productRepository;

    @Override
    public UpdateProductResponse handle(UpdateProductCommand updateProductCommand) {
        Product product = productRepository.findById(updateProductCommand.getId()).orElseThrow();
        product.setAvailableQuantity(updateProductCommand.getAvailableQuantity());
        product.setDescription(updateProductCommand.getDescription());
        product.setPrice(updateProductCommand.getPrice());
        productRepository.save(product);
        log.info("Product {} update", updateProductCommand.getId());
        return UpdateProductResponse.builder().product(product.toDTO()).build();
    }
}

