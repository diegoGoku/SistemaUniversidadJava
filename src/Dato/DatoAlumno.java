/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dato;

import java.sql.ResultSet;
import javax.naming.spi.DirStateFactory;

public class DatoAlumno {

    private String nombre ="";
    private String apellido="";
    private char sexo;
    private int id = 0;
    private final DConexion conn;
        public DatoAlumno() {
            conn=new DConexion();

        }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public int getId() {
        return id;
    }

    public DConexion getConn() {
        return conn;
    }
    
   public void DIsertarAlumno() throws Exception{
       String sql= "insert into alumno values(null,'"+this.nombre+"','"+this.apellido+"','"+this.sexo+"')";
      System.out.println("Dato"+this.nombre+this.apellido+this.sexo);
       conn.insertDate(sql);
   }
   public void DModificarAlumno() throws Exception{
       String sql= "update alumno set nombre ='"+this.nombre+"',apellido ='"+this.apellido+"',sexo ='"+this.sexo+"' where id='"+this.id+"'";
       System.out.println(sql);
       conn.updateDate(sql);
   }
    public void DEliminarAlumno() throws Exception{
       String sql= "delete from alumno where id="+this.id+";";
       System.out.println(sql);
       conn.updateDate(sql);
   }
    
    public ResultSet DMostrarAlumno() throws Exception{
        String sql= "select * from alumno";
        return conn.showDate(sql);
    }
}
