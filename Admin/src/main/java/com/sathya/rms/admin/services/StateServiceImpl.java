package com.sathya.rms.admin.services;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sathya.rms.admin.data.StateRepository;
import com.sathya.rms.admin.entities.State;

@Service
public class StateServiceImpl implements StateService {
	@Autowired
	public StateRepository stateRepository;

	@Override
	public Iterable<State> getAllStates() {

		return stateRepository.findAll();
	}
	

	@Transactional
	@Override
	public State insertState(State state) {
		return stateRepository.save(state);
	}
    @Transactional
    @Override
	public State updateState(State state) {
		return stateRepository.save(state);
	}
    @Transactional
    @Override
    public void deleteState(Integer id) {
    	 stateRepository.deleteById(id);
    }

    @Transactional
    @Override
	public Optional<State> findByStId(String stId) {
		return stateRepository.findByStId(stId);
	}
}
