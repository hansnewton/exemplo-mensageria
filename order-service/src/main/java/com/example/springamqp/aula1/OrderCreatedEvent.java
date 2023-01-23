package com.example.springamqp.aula1;

import java.math.BigDecimal;


public class OrderCreatedEvent {
    private Long id;
    private BigDecimal value = BigDecimal.ZERO;

    public OrderCreatedEvent(Long id, BigDecimal value) {
        this.id = id;
        this.value = value;
    }

    public OrderCreatedEvent() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
