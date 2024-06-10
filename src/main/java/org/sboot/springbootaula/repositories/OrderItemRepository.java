package org.sboot.springbootaula.repositories;


import org.sboot.springbootaula.entities.Order;
import org.sboot.springbootaula.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
