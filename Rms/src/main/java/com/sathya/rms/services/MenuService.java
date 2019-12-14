package com.sathya.rms.services;

import com.sathya.rms.entities.Menu;

public interface MenuService {
	
   public Iterable<Menu> getAllMenus();
   public Menu addMenu(Menu menu);
   public Menu updateMenu(Menu menu);
   public void deleteMenu(Integer id);
}
