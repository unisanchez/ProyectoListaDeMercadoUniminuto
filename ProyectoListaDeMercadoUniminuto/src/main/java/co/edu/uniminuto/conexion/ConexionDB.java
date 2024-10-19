/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Victor Manuel Sanchez Narvaez
 *         NRC 50 - 55257
 *         ID 001000940
 *         Arli Jaidybe Gaita Jara
 *         NRC 50 - 55257
 *         ID 981058
 */
public class ConexionDB {

    //1. Atributos de la clase que se conecta a la base de datos
    private String user;//usuario de conexión a la BD
    private String password;//contraseña de conexión a la BD
    private String nameDataBase; //nombre de la BD
    private String portMotor;
    private String servidor;
    private String cadUrl;
    private Connection con;

    public ConexionDB() {
        this.user = "root";
        this.password = "";
        this.nameDataBase = "lista_mercado";
        this.portMotor = "3306";
        this.servidor = "localhost";
        this.cadUrl = "jdbc:mysql: //" + this.servidor + ":" + this.portMotor + "/" + this.nameDataBase;
        this.con = null;
    }
    
    private Connection conexionLista() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.con = DriverManager.getConnection(this.cadUrl, this.user, this.password);
        } catch (Exception e) {
            System.out.println("*****Exception*****" + e.getMessage());
            this.con = null;
        }
        return this.con;
    }

    public Connection getConexionDB() {
        return this.conexionLista();
    }

}
