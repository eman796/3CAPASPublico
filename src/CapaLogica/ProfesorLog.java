package CapaLogica;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import CapaDatos.ProfesorDA;
import Resources.Profesor;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author emanu
 */
public class ProfesorLog {
    ProfesorDA PDA = new ProfesorDA();
    public void add(String cedula, String nombre, String apellido1, String apellido2, int edad, String nacionalida, String correo, String direccion, String Gradoacademico){
        if(PDA.Agregar(new Profesor(cedula,nombre,apellido1,apellido2,edad,nacionalida,correo,direccion,Gradoacademico))){
            System.out.println("Dato añadido");
        }
    }
      public void Actualizar(String carnetEstudiante, String cedula, String nombre, String apellido1, String apellido2, int edad, String nacionalidad, String correo, String direccion, String gradoAcademico)
    {
        if (PDA.Agregar(new Profesor(cedula,nombre,apellido1,apellido2,edad,nacionalidad,correo,direccion, gradoAcademico))) 
        {
            System.out.println("Dato Actualizado");
        }
    
    }
       public void Eliminar(String cedula) throws SQLException
    {
        if (PDA.Eliminar(cedula)) 
        {
            System.out.println("Dato Eliminado");
        }
    
    }
       public DefaultTableModel Lista() throws SQLException
    {
       return PDA.Lista();
    }
    
}

