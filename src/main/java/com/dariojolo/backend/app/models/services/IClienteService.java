package com.dariojolo.backend.app.models.services;

import java.util.List;

import com.dariojolo.backend.app.models.entity.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();
}
