package com.sathya.rms.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.data.MenuRepository;
import com.sathya.rms.entities.Menu;
@Service
public class MenuServiceImpl implements MenuService {
    
	@Autowired
	MenuRepository menuRepository;
	
	public Iterable<Menu> getAllMenus() {
	   return menuRepository.findAll();
	}

	@Transactional
	public Menu addMenu(Menu menu) {
		return menuRepository.save(menu);
	}

	@Transactional
	public Menu updateMenu(Menu menu) {
		return menuRepository.save(menu);
	}

	@Transactional
	public void deleteMenu(Integer id) {
		menuRepository.deleteById(id);
	}
}
