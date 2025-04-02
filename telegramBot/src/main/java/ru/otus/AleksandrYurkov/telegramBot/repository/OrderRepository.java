package ru.otus.AleksandrYurkov.telegramBot.repository;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import ru.otus.AleksandrYurkov.telegramBot.entity.Orders;

@Repository
public interface OrderRepository extends ListCrudRepository<Orders, Long> {

//        String checkCustomerSql = "SELECT COUNT(*) FROM customer WHERE id = ?";
//        String checkMasterSql = "SELECT COUNT(*) FROM master WHERE id = ?";
//        String insertSql = "INSERT INTO orders (customer_id, master_id, date_time) VALUES (?, ?, ?) RETURNING id";

    @Query ("INSERT INTO orders (customer_id, master_id, date_time) VALUES (customer_id =:customer_id, master_id =:master_id, date_time =: date_time)")
    void createOrders(Long customer_id, Long master_id, String dateTime);



}