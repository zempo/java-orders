package com.solomon.javaorders.services;

import com.solomon.javaorders.models.Order;
import com.solomon.javaorders.repositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "orderServices")
public class OrderServiceImpl implements OrderServices
{
    @Autowired
    private OrdersRepository ordersrepos;

    @Transactional
    @Override
    public Order save(Order order)
    {
        return ordersrepos.save(order);
    }
}