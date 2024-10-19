/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.entity;

/**
 *
 * @author Victor Manuel Sanchez Narvaez
 *         NRC 50 - 55257
 *         ID 001000940
 *         Arli Jaidybe Gaita Jara
 *         NRC 50 - 55257
 *         ID 981058
 */
public class Producto {
    //Atributos del producto
    private int productoid;
    private String productoNombre;
    private String productoCantidad;
    private String productoPrecio;
    private int productoEstatus;

    //Constructores
    public Producto() {
    }

    public Producto(String productoNombre, String productoCantidad, String productoPrecio, int productoEstatus) {
        this.productoNombre = productoNombre;
        this.productoCantidad = productoCantidad;
        this.productoPrecio = productoPrecio;
        this.productoEstatus = productoEstatus;
    }

    public Producto(int productoid, String productoNombre, String productoCantidad, String productoPrecio, int productoEstatus) {
        this.productoid = productoid;
        this.productoNombre = productoNombre;
        this.productoCantidad = productoCantidad;
        this.productoPrecio = productoPrecio;
        this.productoEstatus = productoEstatus;
    }
    
    //metodos getter y setter
    public int getProductoid() {
        return productoid;
    }
    public String getProductoNombre() {
        return productoNombre;
    }
    public String getProductoCantidad() {
        return productoCantidad;
    }
    public String getProductoPrecio() {
        return productoPrecio;
    }
    public int getProductoEstatus() {
        return productoEstatus;
    }

    public void setProductoid(int productoid) {
        this.productoid = productoid;
    }
    public void setProductoNombre(String productoNombre) {
        this.productoNombre = productoNombre;
    }
    public void setProductoCantidad(String productoCantidad) {
        this.productoCantidad = productoCantidad;
    }
    public void setProductoPrecio(String productoPrecio) {
        this.productoPrecio = productoPrecio;
    }
    public void setProductoEstatus(int productoEstatus) {
        this.productoEstatus = productoEstatus;
    }
}
