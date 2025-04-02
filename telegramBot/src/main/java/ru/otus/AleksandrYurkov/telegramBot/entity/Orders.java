package ru.otus.AleksandrYurkov.telegramBot.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "orders")
public class Orders {
    @Id
    public Long id;

    @Column(value = "customer_id")
    public Long customerId;

    @Column(value = "master_id")
    public Long masterId;

    @Column(value = "date_time")
    public String dateTime;

}