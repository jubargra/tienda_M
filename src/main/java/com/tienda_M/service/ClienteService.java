
package com.tienda_M.service;

import com.tienda_M.domain.Cliente;
import java.util.List;


public interface ClienteService {
    
    public List<Cliente> getClientes();
    
    public void save(Cliente cliente);
    
    public void delete(Cliente cliente);
    
    public Cliente getCliente(Cliente cliente);
    
}
