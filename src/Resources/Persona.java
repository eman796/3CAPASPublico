/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resources;

/**
 *
 * @author tonyM
 */
public class Persona {
    
    protected String _cedula;
    protected String _nombre;
    protected String _apellido1;
    protected String _apellido2;
    protected int _edad;
    protected String _nacionalidad;
    protected String _correo;
    protected String _direccion;

    public Persona(String _cedula, String _nombre, String _apellido1, String _apellido2, int _edad, String _nacionalidad, String _correo, String _direccion) {
        this._cedula = _cedula;
        this._nombre = _nombre;
        this._apellido1 = _apellido1;
        this._apellido2 = _apellido2;
        this._edad = _edad;
        this._nacionalidad = _nacionalidad;
        this._correo = _correo;
        this._direccion = _direccion;
    }

    public Persona() {
        this._cedula = _cedula;
        this._nombre = _nombre;
        this._apellido1 = _apellido1;
        this._apellido2 = _apellido2;
        this._edad = _edad;
        this._nacionalidad = _nacionalidad;
        this._correo = _correo;
        this._direccion = _direccion;
    }

    public String getCedula() {
        return _cedula;
    }

    public void setCedula(String _cedula) {
        this._cedula = _cedula;
    }

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String getApellido1() {
        return _apellido1;
    }

    public void setApellido1(String _apellido1) {
        this._apellido1 = _apellido1;
    }

    public String getApellido2() {
        return _apellido2;
    }

    public void setApellido2(String _apellido2) {
        this._apellido2 = _apellido2;
    }

    public int getEdad() {
        return _edad;
    }

    public void setEdad(int _edad) {
        this._edad = _edad;
    }

    public String getNacionalidad() {
        return _nacionalidad;
    }

    public void setNacionalidad(String _nacionalidad) {
        this._nacionalidad = _nacionalidad;
    }

    public String getCorreo() {
        return _correo;
    }

    public void setCorreo(String _correo) {
        this._correo = _correo;
    }

    public String getDireccion() {
        return _direccion;
    }

    public void setDireccion(String _direccion) {
        this._direccion = _direccion;
    }
    
    public int calcAnnoNacimiento()
    {
        int annoNacimiento = (2023 - this._edad );
        return annoNacimiento;
    }   
    
    
    
}

