package ru.otus.AleksandrYurkov.telegramBot.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import ru.otus.AleksandrYurkov.telegramBot.entity.Orders;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends ListCrudRepository<Orders, Long> {
//    List<Orders> findAvailableSlots(LocalDate date, String profession);
//
//    Optional<Orders> findAllById(Long customerId);
}