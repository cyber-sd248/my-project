package com.sathya.rms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.entities.Menu;
import com.sathya.rms.services.MenuService;

@RestController
@RequestMapping(path="/menus")
public class MenuController {
	
	@Autowired
	MenuService menuService;
    
	@PostMapping(path="/addMenu")
	public Menu addMenu(@RequestBody Menu menu) {
		return menuService.addMenu(menu);
	}
	@GetMapping(path="/getAllMenus")
	public Iterable<Menu> getAllMenus(){
		return menuService.getAllMenus();
	}
	
	@PutMapping(path="/updateMenu")
	public Menu updateMenu(@RequestBody Menu menu) {
		return menuService.updateMenu(menu);
	}
	@DeleteMapping(path="/deleteMenu/{id}")
	public void deleteMenu(@PathVariable("id") Integer id) {
		menuService.deleteMenu(id);
	}
}
