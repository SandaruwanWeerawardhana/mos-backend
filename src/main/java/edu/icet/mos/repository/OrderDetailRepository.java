package edu.icet.mos.repository;

import edu.icet.mos.entity.OrderDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailRepository extends JpaRepository<OrderDetailsEntity,Integer> {
}
