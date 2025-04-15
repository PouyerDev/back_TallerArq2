package com.example.demo.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Producto;
import com.example.demo.repository.ProductoRepository;
@Service
public class productoServiceImp implements productoService {
        @Autowired
    ProductoRepository repo;
    @Override
    public Producto guardarProducto(Producto producto) {
        return repo.save(producto);

        
    }

    @Override
    public List<Producto> listarProductos() {
        return repo.findAll();
    }

    @Override
    public void eliminarProducto(Long id) {
        repo.deleteById(id)   ;

    }

    @Override
    public Producto buscarProducto(Long id) {
        return repo.findById(id).orElse(null);
    }
    
}
