package edu.icet.mos.service.impl;

import edu.icet.mos.dto.OrderDetails;
import edu.icet.mos.entity.OrderDetailsEntity;
import edu.icet.mos.repository.OrderDetailRepository;
import edu.icet.mos.service.OrderDetailService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderDetailServiceImpl implements OrderDetailService {
    final OrderDetailRepository repository;
    final ModelMapper mapper;

    @Override
    public List<OrderDetails> getAllBYId(Integer id) {
        List<OrderDetailsEntity> orderEntities = repository.findAllById(Collections.singleton(id));
        List<OrderDetails> orderList = new ArrayList<>();
        orderEntities.forEach(el -> orderList.add(mapper.map(el, OrderDetails.class)));
        return orderList;
    }
}
