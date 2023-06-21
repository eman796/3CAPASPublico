/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Resources;

/**
 *
 * @author tonyM
 */
public class Profesor {
    private String gradoAcademico;

    public Profesor(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }
    Profesor()
    {
        this.gradoAcademico = "";
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }
}
