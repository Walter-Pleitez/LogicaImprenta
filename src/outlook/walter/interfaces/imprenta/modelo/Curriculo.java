package outlook.walter.interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja implements Imprimible{
    private String persona;
    private String carrera;
    private List<String> experiencia;

    public Curriculo(String persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencia = new ArrayList<>();
    }

    public Curriculo addExperiencias(String exp){
        experiencia.add(exp);
        return this;
    }

    @Override
    public String Imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona).append("\n")
                .append("resumen: ").append(this.contenido)
                .append("\n").append("Profesion: ")
                .append(this.carrera).append("\n")
                .append("Experiencias: \n");
        for(String exp: this.experiencia){
            sb.append("- ").append(exp).append("\n");
        }

        return sb.toString();
    }
}
