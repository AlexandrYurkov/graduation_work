package ru.otus.AleksandrYurkov.telegramBot.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import ru.otus.AleksandrYurkov.telegramBot.entity.Customer;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends ListCrudRepository<Customer, Long> {

    //TODO добавить к таблице поле telegram_id
//    Customer findByTelegramId(Long telegramId);
}