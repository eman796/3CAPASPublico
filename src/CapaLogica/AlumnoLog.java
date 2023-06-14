/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaLogica;

import CapaDatos.AlumnoDA;
import Resources.Alumno;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tonyM
 */
public class AlumnoLog {
    AlumnoDA AlD = new AlumnoDA();
    
    public void Agregar(String carnetEstudiante, String cedula, String nombre, String apellido1, String apellido2, int edad, String nacionalidad, String correo, String direccion)
    {
        if (AlD.Agregar(new Alumno(carnetEstudiante,cedula,nombre,apellido1,apellido2,edad,nacionalidad,correo,direccion))) 
        {
            System.out.println("Dato Agregado");
        }
    
    }
    
    public void Actualizar(String carnetEstudiante, String cedula, String nombre, String apellido1, String apellido2, int edad, String nacionalidad, String correo, String direccion)
    {
        if (AlD.Agregar(new Alumno(carnetEstudiante,cedula,nombre,apellido1,apellido2,edad,nacionalidad,correo,direccion))) 
        {
            System.out.println("Dato Actualizado");
        }
    
    }
    
    public void Eliminar(int cedula)
    {
        if (AlD.Eliminar(cedula)) 
        {
            System.out.println("Dato Eliminado");
        }
    
    }
    
    public DefaultTableModel Lista()
    {
       return AlD.Lista();
    }
    
}
