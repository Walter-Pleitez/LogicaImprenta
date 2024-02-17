package outlook.walter.interfaces.imprenta.modelo;

public class Pagina extends Hoja implements Imprimible{

    public Pagina(String contenido) {
        super(contenido);
    }

    @Override
    public String Imprimir() {
        return this.contenido;
    }
}
