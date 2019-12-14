package com.sathya.rms.services;

import com.sathya.rms.entities.Items;

public interface ItemsService {

     public Items addItem(Items items);
     public Iterable<Items> getAllItems();
     public Items updateItem(Items items);
     public void deleteItem(Integer id);
}
