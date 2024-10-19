/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.uniminuto.dao;

import co.edu.uniminuto.conexion.ConexionDB;
import co.edu.uniminuto.entity.Usuario;

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
public class UsuarioDao {
    //Atributos
    private final ConexionDB conexionDB;
    private PreparedStatement statement;

    //Constructor
    public UsuarioDao() {
        this.conexionDB = new ConexionDB();
    }

    //metodo para comprovar usuario y contraseña
    public boolean verificarUsuario(String usuario, String contraseña) {
        Connection myCon = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean usuarioValidado = false;

        try {
            myCon = this.conexionDB.getConexionDB();
            String sql = "SELECT COUNT(*) FROM usuarios WHERE us_username = ? AND us_password = ?";
            stmt = myCon.prepareStatement(sql);
            stmt.setString(1, usuario);
            stmt.setString(2, contraseña);
            rs = stmt.executeQuery();

            if (rs.next() && rs.getInt(1) > 0) {
                usuarioValidado = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (myCon != null) myCon.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        return usuarioValidado;
    }

    public void RegistrarUsuario(Usuario usuario) {
        Connection myCon = this.conexionDB.getConexionDB();
        String query = "INSERT INTO usuarios (us_username, us_password) VALUES (?, ?);";
        try {
            if (this.statement == null) {
                this.statement = myCon.prepareStatement(query);
                this.statement.setString(1, usuario.getUsuarioNombre());
                this.statement.setString(2, usuario.getUsuarioContraseña());
                int response = this.statement.executeUpdate();
                if (response > 0) {
                    JOptionPane.showMessageDialog(null, "Usuario registrado correctamente");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error, no se pudo registrar el usuario");
            System.out.println("" + e.getLocalizedMessage());
        } finally {
            if (myCon != null) {
                try {
                    this.statement.close();
                    myCon.close();
                } catch (SQLException ex) {
                    Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
}
