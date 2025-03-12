package edu.icet.mos.service.impl;

import edu.icet.mos.dto.Order;
import edu.icet.mos.entity.OrderEntity;
import edu.icet.mos.repository.OrderRepository;
import edu.icet.mos.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {
    final OrderRepository repository;
    final ModelMapper mapper;

    @Override
    public void add(Order order) {
        OrderEntity orderEntity = mapper.map(order, OrderEntity.class);
        orderEntity.setTotPrice((Double.valueOf(order.getQty()) * order.getPrice()) - (Double.valueOf(order.getQty()) * order.getPrice()) * (order.getDiscount() / 100.0));

        repository.save(orderEntity);
    }

    @Override
    public List<Order> getAll() {
        List<OrderEntity> orderEntities = repository.findAll();
        List<Order> orderList = new ArrayList<>();
        orderEntities.forEach(el -> orderList.add(mapper.map(el, Order.class)));
        return orderList;
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void update(Order order) {
        repository.save(mapper.map(order, OrderEntity.class));
    }

    @Override
    public Order searchById(Integer id) {
        return mapper.map(repository.findById(id), Order.class);
    }

    @Override
    public List<Order> getAllBYId(Integer id) {
        List<OrderEntity> orderEntities = repository.findAllById(Collections.singleton(id));
        List<Order> orderList = new ArrayList<>();
        orderEntities.forEach(el -> orderList.add(mapper.map(el, Order.class)));
        return orderList;
    }
}
