package edu.programacion.avanzada.juniorperalta.ProyectoFinal.services;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.domain.PaymentMethod;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.dto.OrderDTO;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.dto.PaymentMethodDTO;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.request.payment.CreatePaymentMRequest;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.request.payment.DeletePaymentMRequest;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.model.request.payment.UpdatePaymentMRequest;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.repositories.PaymentMethodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PaymentMethodService {

    private final PaymentMethodRepository paymentMethodRepository;

    public List<PaymentMethodDTO> getAll() {
        return paymentMethodRepository.findAll().stream().map(PaymentMethod::toDTO).collect(Collectors.toList());
    }

    public PaymentMethodDTO get(Long id) {
        return paymentMethodRepository.findById(id).orElseThrow().toDTO();
    }

    public PaymentMethodDTO create(CreatePaymentMRequest createPaymentMRequest) {
        PaymentMethod paymentMethod = paymentMethodRepository.save(createPaymentMRequest.toPaymentMethod());
        return paymentMethod.toDTO();
    }

    public PaymentMethodDTO update(UpdatePaymentMRequest updatePaymentMRequest) {
        PaymentMethod paymentMethod = paymentMethodRepository.findById(updatePaymentMRequest.getId()).orElseThrow();
        paymentMethod.applyChanges(updatePaymentMRequest);
        paymentMethodRepository.save(paymentMethod);
        return paymentMethod.toDTO();
    }

    public void delete(DeletePaymentMRequest deletePaymentMRequest) {
        paymentMethodRepository.deleteById(deletePaymentMRequest.getId());
    }
}
