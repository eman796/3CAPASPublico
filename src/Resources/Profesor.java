/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resources;

/**
 *
 * @author tonyM
 */
public class Profesor extends Persona {
    private String gradoAcademico;

        
    

    public Profesor(String gradoAcademico, String _cedula, String _nombre, String _apellido1, int _edad, String _apellido2, String _nacionalidad, String _correo, String _direccion) {
        super(_cedula, _nombre, _apellido1, _apellido2, _edad, _nacionalidad, _correo, _direccion);
        this.gradoAcademico = gradoAcademico;
    }

    public Profesor(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }
    

    
}
