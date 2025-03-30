package ru.otus.AleksandrYurkov.telegramBot.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.otus.AleksandrYurkov.telegramBot.entity.Orders;
import ru.otus.AleksandrYurkov.telegramBot.repository.OrderRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrdersService {
    private OrderRepository orderRepository;

    public void save(Orders order) {
        orderRepository.save(order);
    }
    public Optional<Orders> findById(long id) {
        return orderRepository.findById(id);
    }
}
