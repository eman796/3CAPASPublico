/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CapaDatos;

import Resources.Alumno;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.*;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tonyM
 */
public class AlumnoDA implements IPersona<Alumno>
{
   Connection cn = new ConnectionBD().getConn();

    @Override
    public boolean Agregar(Alumno obj) 
    {
        boolean band = false;
        try {
           
            CallableStatement cs = cn.prepareCall("{Call PA_AGREGAR_ALUMN(?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, obj.getCedula());
            cs.setString(2, obj.getNombre());
            cs.setString(3, obj.getApellido1());
            cs.setString(4, obj.getApellido2()); 
            cs.setInt(5, obj.getEdad());
            cs.setString(6, obj.getNacionalidad());
            cs.setString(7, obj.getCorreo());
            cs.setString(8, obj.getDireccion());
            cs.setString(9, obj.getCarnetEstudiante());
            
            if (cs.executeUpdate()>0){
                band = true;
            }
            
              
              
        } catch (Exception e) {
            System.out.println("Error al insertar Alumno");
        }
            
      
    return band;
    }

    @Override
    public boolean Actualizar(Alumno obj) {
        
     boolean band = false;
        try {
           
            CallableStatement cs = cn.prepareCall("CALL PA_ACTUALIZAR_ALUMN(?,?,?,?,?,?,?,?,?)}");
            cs.setString(1, obj.getCedula());
            cs.setString(2, obj.getNombre());
            cs.setString(3, obj.getApellido1());
            cs.setString(4, obj.getApellido2()); 
            cs.setInt(5, obj.getEdad());
            cs.setString(6, obj.getNacionalidad());
            cs.setString(7, obj.getCorreo());
            cs.setString(8, obj.getDireccion());
            cs.setString(9, obj.getCarnetEstudiante());
            
            if (cs.executeUpdate()>0){
                band = true;
            }
            
              
              
        } catch (Exception e) {
            System.out.println("Error al actualizar Alumno");
        }
            
      
    return band;
    
    }

    @Override
    public boolean Eliminar(String codigo) {
      
     boolean band = false;
        try {
           
            CallableStatement cs = cn.prepareCall("{Call PA_ELIMINAR_ALUMN(?)}");
            cs.setString(1, codigo);
            
            
            if (cs.executeUpdate()>0){
                band = true;
            }
              
        } catch (Exception e) {
            System.out.println("Error al eliminar Alumno");
        }
            
      
    return band;
    
    }

    @Override
    public DefaultTableModel Lista() {
    DefaultTableModel mdl= new DefaultTableModel();
    mdl.addColumn("Cedula");
    mdl.addColumn("Nombre");
    mdl.addColumn("Primer Apellido");
    mdl.addColumn("Segundo Apellido");
    mdl.addColumn("Edad");
    mdl.addColumn("Nacionalidad");
    mdl.addColumn("Correo");
    mdl.addColumn("Direccion");
    mdl.addColumn("Carnet");
        try {
            CallableStatement cs = cn.prepareCall("{CALL PA_LISTAR_TODOS_ALUMN ()}");
            ResultSet rst =cs.executeQuery();
            
            while (rst.next()) {
                Object data[] = { 
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getInt(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getString(9),
                };
                
                mdl.addRow(data);
                
            }
        } catch (Exception e) {
            System.out.println("Error al traer la lista de alumnos");
        }
    
    
    
    return mdl;
    }
    
}
