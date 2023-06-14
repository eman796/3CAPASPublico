/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resources;

/**
 *
 * @author tonyM
 */
public class Alumno extends Persona
{
    private String _carnetEstudiante;

    public Alumno(String _carnetEstudiante, String _cedula, String _nombre, String _apellido1, String _apellido2, int _edad, String _nacionalidad, String _correo, String _direccion) {
        super(_cedula, _nombre, _apellido1, _apellido2, _edad, _nacionalidad, _correo, _direccion);
        this._carnetEstudiante = _carnetEstudiante;
    }
    
    public Alumno()
    {
        this._carnetEstudiante = "";
    }

    public String getCarnetEstudiante() {
        return _carnetEstudiante;
    }

    public void setCarnetEstudiante(String _carnetEstudiante) {
        this._carnetEstudiante = _carnetEstudiante;
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
    
    
    
}
