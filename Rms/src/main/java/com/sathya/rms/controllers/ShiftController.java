package com.sathya.rms.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sathya.rms.entities.Shifttype;
import com.sathya.rms.services.ShifttypeService;

@RestController
@RequestMapping(path="/shifts")
@CrossOrigin
public class ShiftController {

	@Autowired
	ShifttypeService shifttypeService;

	@GetMapping(path="/getAllShifts")
	public Iterable<Shifttype> getAllShifts() {
		return shifttypeService.findAll();
	}

	@PostMapping(path="/addShift")
	public Shifttype addShifttype(@RequestBody Shifttype shift) {
		return shifttypeService.addShifttype(shift);
	}

	@PutMapping(path="/updateShift")
	public Shifttype updateShift(@RequestBody Shifttype shift) {
		return shifttypeService.updateShift(shift);
	}

	@DeleteMapping(path="/deleteShift/{id}")
	public void deleteShift(@PathVariable("id") Integer id) {
		shifttypeService.deleteShift(id);
	}
}
