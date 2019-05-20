package com.henrique.pontointeligente.api.services;

import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henrique.pontointeligente.api.entities.Empresa;
import com.henrique.pontointeligente.api.repositories.EmpresaRepository;

@Service
public class EmpresaServiceImpl implements EmpresaService {
	
	private static final Logger log = LoggerFactory.getLogger(EmpresaServiceImpl.class);
	
	@Autowired
	private EmpresaRepository empresaRepository;
	
	
	public Optional<Empresa> buscarPorCnpj(String cnpj) {
		log.info("Search Company by cnpj: {}", cnpj);
		return Optional.ofNullable(empresaRepository.findByCnpj(cnpj));
	}
	
	public Empresa persistir(Empresa empresa) {
		log.info("Persist a company: {}", empresa);
		return empresaRepository.save(empresa);
	}
}
