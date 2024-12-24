/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Conexion {
    String bd = "biblioteca";
    String url= "jdbc:mysql://localhost:3306/";
    String user="root";
    String password="";
    String driver="com.mysql.cj.jdbc.Driver";
    Connection cn;
    public Conexion() {
    }
    public Connection conectar(){
        try {
            Class.forName(driver);
            cn=DriverManager.getConnection(url+bd, user, password);
            System.out.println("se conecto: "+bd);
        } catch (ClassNotFoundException |SQLException ex) {
            System.out.println("no se conecto: "+bd);
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cn;
    }
   public void desconectar(){
        try {
            cn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
   public static void main(String[] args){
       Conexion conexion = new Conexion();
       conexion.conectar();
   }
}