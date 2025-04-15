package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.model.Producto;
import com.example.demo.repository.ProductoRepository;
import com.example.demo.Services.productoService;



@RestController
@RequestMapping("/api/productos")
@CrossOrigin(origins = "*") // Allow all origins for development
public class ProductoController {

    @Autowired
    private ProductoRepository productoRepository;
    @Autowired
    private productoService producto_Service;

    // Endpoint para obtener todos los productos en XML
    @GetMapping(produces = "application/xml")
    public List<Producto> getProductos() {
        return producto_Service.listarProductos();

    }

    // Endpoint para obtener un producto por id en XML
    @GetMapping(value = "/{id}", produces = "application/xml")
    public Producto getProductoById(@PathVariable Long id) {
        return producto_Service.buscarProducto(id);
    }

    // Endpoint para crear un nuevo producto
    @PostMapping(consumes = "application/xml", produces = "application/xml")
    public Producto createProducto(@RequestBody Producto producto) {
        return producto_Service.guardarProducto(producto);
    }
    
    // Opcional: Endpoint para borrar un producto
    @DeleteMapping("/{id}")
    public void deleteProducto(@PathVariable Long id) {
        producto_Service.eliminarProducto(id);
    }
}
