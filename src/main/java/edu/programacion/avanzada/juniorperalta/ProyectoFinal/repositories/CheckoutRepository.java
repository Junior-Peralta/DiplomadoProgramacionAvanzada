package edu.programacion.avanzada.juniorperalta.ProyectoFinal.repositories;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.domain.Checkout;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CheckoutRepository extends JpaRepository<Checkout, UUID> {
}
