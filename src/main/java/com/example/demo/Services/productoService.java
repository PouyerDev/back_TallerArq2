package com.example.demo.Services;

import java.util.List;

import com.example.demo.model.Producto;

public interface productoService {
    public Producto guardarProducto(Producto producto);
    public List<Producto> listarProductos();
    public void eliminarProducto(Long id);
    public Producto buscarProducto(Long id);
    public Producto actualizarProducto(Producto producto, Long id);

    

    
}
