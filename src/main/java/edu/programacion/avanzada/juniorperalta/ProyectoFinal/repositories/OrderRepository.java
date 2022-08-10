package edu.programacion.avanzada.juniorperalta.ProyectoFinal.repositories;

import edu.programacion.avanzada.juniorperalta.ProyectoFinal.domain.Order;
import edu.programacion.avanzada.juniorperalta.ProyectoFinal.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderRepository extends JpaRepository<Order, UUID> {
}
