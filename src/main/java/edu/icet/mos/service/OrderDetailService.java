package edu.icet.mos.service;

import edu.icet.mos.dto.OrderDetails;

import java.util.List;

public interface OrderDetailService {
    List<OrderDetails> getAllBYId(Integer id);
}
