/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.dao;

import co.edu.uniminuto.conexion.ConexionDB;
import co.edu.uniminuto.entity.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Victor Manuel Sanchez Narvaez
 *         NRC 50 - 55257
 *         ID 001000940
 *         Arli Jaidybe Gaita Jara
 *         NRC 50 - 55257
 *         ID 981058
 */
public class ProductoDao {
    //Atributos
    private final ConexionDB conexionDB;
    private PreparedStatement statement;
    private ResultSet resultSet;
    
    //Constructor
    public ProductoDao() {
        this.conexionDB = new ConexionDB();
        this.statement = null;
        this.resultSet = null;
    }
    
    public ResultSet queryProducto(){
        Connection myCon = this.conexionDB.getConexionDB();
        String query = "SELECT * FROM productos WHERE pro_estado = 1; ";
        try {
            this.statement = myCon.prepareStatement(query);
            this.resultSet = this.statement.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return this.resultSet;
    }
    
    public void registrarProducto (Producto producto){
        Connection myCon = this.conexionDB.getConexionDB();
        String query = "INSERT INTO productos VALUES (NULL, ?, ?, ?, ?);";
        try {
            if(this.statement==null){
                this.statement = myCon.prepareStatement(query);
                this.statement.setString(1, producto.getProductoNombre());
                this.statement.setString(2, producto.getProductoCantidad());
                this.statement.setString(3, producto.getProductoPrecio());
                this.statement.setInt(4, producto.getProductoEstatus());
                int response = this.statement.executeUpdate();
                if(response > 0){
                    JOptionPane.showMessageDialog(null, "OK-200");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no se pudo registrar producto");
            System.out.println("" + e.getLocalizedMessage());
        } finally {
            if(myCon != null){
                try {
                    this.statement.close();
                    myCon.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
            
    public void ActualizarProducto (Producto producto){
        Connection myCon = this.conexionDB.getConexionDB();
        String checkQuery = "SELECT COUNT(*) FROM productos WHERE pro_id = ?;";
        String updateQuery = "UPDATE productos SET pro_nombre = ?, pro_cantidad = ?, pro_precio = ?, pro_estado = ? WHERE pro_id = ?;";
        try {
            // Verificamos si el id del producto existe
            this.statement = myCon.prepareStatement(checkQuery);
            this.statement.setInt(1, producto.getProductoid());
            this.resultSet = this.statement.executeQuery();
            if (this.resultSet.next() && this.resultSet.getInt(1) == 0) {
                JOptionPane.showMessageDialog(null, "El ID del producto no existe. Intente con otro.");
                return;
            }
            
            // Actualizamos los datos del producto
            this.statement = myCon.prepareStatement(updateQuery);
            this.statement.setString(1, producto.getProductoNombre());
            this.statement.setString(2, producto.getProductoCantidad());
            this.statement.setString(3, producto.getProductoPrecio());
            this.statement.setInt(4, producto.getProductoEstatus());
            this.statement.setInt(5, producto.getProductoid());
            int response = this.statement.executeUpdate();
            if(response > 0){
                JOptionPane.showMessageDialog(null, "OK-200");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no se pudo Actualizar producto, revise que los datos del producto sean correctos");
            System.out.println("" + e.getLocalizedMessage());
        } finally {
            if(myCon != null){
                try {
                    this.statement.close();
                    myCon.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProductoDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
    }
}
