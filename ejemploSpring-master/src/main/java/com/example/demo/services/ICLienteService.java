package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Cliente;

public interface ICLienteService {
	
	public List<Cliente> findAll();
	public Cliente save(Cliente cliente);
	public void delete(Long id);
	public Cliente findById(Long id);

}
