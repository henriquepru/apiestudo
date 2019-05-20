package com.henrique.pontointeligente.api.services;

import java.util.Optional;

import com.henrique.pontointeligente.api.entities.Empresa;

public interface EmpresaService {
	
	Optional<Empresa> buscarPorCnpj(String cnpj);
	Empresa persistir(Empresa empresa);
	

}
