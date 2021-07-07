package com.solomon.javaorders.services;

import com.solomon.javaorders.models.Payment;
import com.solomon.javaorders.repositories.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(value = "paymentServices")
public class PaymentServiceImpl implements PaymentServices
{
    @Autowired
    private PaymentRepository paymentrepos;

    @Transactional
    @Override
    public Payment save(Payment payment){
        return paymentrepos.save(payment);
    }
}