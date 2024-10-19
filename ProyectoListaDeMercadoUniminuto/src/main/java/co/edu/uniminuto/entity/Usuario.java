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
public class Usuario {
    //Atributos del producto
    private int usuarioid;
    private String usuarioNombre;
    private String usuarioContraseña;
    
    //Constructores
    public Usuario() {
    }

    public Usuario(String usuarioNombre, String usuarioContraseña) {
        this.usuarioNombre = usuarioNombre;
        this.usuarioContraseña = usuarioContraseña;
    }

    public Usuario(int usuarioid, String usuarioNombre, String usuarioContraseña) {
        this.usuarioid = usuarioid;
        this.usuarioNombre = usuarioNombre;
        this.usuarioContraseña = usuarioContraseña;
    }

    //metodos getter y setter
    public int getUsuarioid() {
        return usuarioid;
    }
    public String getUsuarioNombre() {
        return usuarioNombre;
    }
    public String getUsuarioContraseña() {
        return usuarioContraseña;
    }

    public void setUsuarioid(int usuarioid) {
        this.usuarioid = usuarioid;
    }
    public void setUsuarioNombre(String usuarioNombre) {
        this.usuarioNombre = usuarioNombre;
    }
    public void setUsuarioContraseña(String usuarioContraseña) {
        this.usuarioContraseña = usuarioContraseña;
    }
    
    
}
