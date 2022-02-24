package com.tienda_M.dao;

import org.springframework.data.repository.CrudRepository;
import com.tienda_M.domain.Cliente;

public interface ClienteDao extends CrudRepository<Cliente, Long> {
    
}
