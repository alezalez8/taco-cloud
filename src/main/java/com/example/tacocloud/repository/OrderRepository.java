package com.example.tacocloud.repository;

import com.example.tacocloud.model.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
