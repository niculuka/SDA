package com.advance.adv9_ShopApp.repository;
import com.advance.adv9_ShopApp.model.Sellable;

import java.util.Optional;

public interface SellableRepository<T extends Sellable> {

    void add(T item);

    Optional<T> search(String id);

    void remove(String id);

    Optional<T> findByName(String name);

}
