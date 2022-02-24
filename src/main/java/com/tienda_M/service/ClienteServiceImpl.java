
package com.tienda_M.service;

import com.tienda_M.dao.ClienteDao;
import com.tienda_M.domain.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceImpl implements ClienteService {
    
    @Autowired
    private ClienteDao clienteDao;

    @Override
    @Transactional (readOnly = true) //Para manejar transacciones solo de lectura
    public List<Cliente> getClientes() {
        return (List<Cliente>)clienteDao.findAll();
    }

    @Override
    @Transactional //Para manejar transacciones de escritura
    public void save(Cliente cliente) {
        clienteDao.save(cliente);
    }

    @Override
    @Transactional //Para manejar transacciones de escritura
    public void delete(Cliente cliente) {
        clienteDao.delete(cliente);
    }

    @Override
    @Transactional (readOnly = true) //Para manejar transacciones solo de lectura
    public Cliente getCliente(Cliente cliente) {
        return clienteDao.findById(cliente.getIdcliente()).orElse(null);
    }
    
}
