
import java.util.*;

/**
 * 
 */
public class Publicacao {

    /**
     * Default constructor
     */
    public Publicacao() {
        this.id_publicacao = proximoID++;
        this.dataPostagem = new Date().toString();
        this.texto = "";
    }
    public Publicacao(String texto) {
        this.id_publicacao = proximoID++;
        this.dataPostagem = new Date().toString();
        this.texto = texto;
    }

    private static int proximoID = 1;

    /**
     * 
     */
    private int id_publicacao;

    /**
     * 
     */
    private String texto;

    /**
     * 
     */
    private String dataPostagem;




    /**
     * @return
     */
    public int getID() {
        return this.id_publicacao;
    }

    /**
     * @return
     */
    public String getTexto() {
        return this.texto;
    }

    /**
     * @return
     */
    public String getDataPostagem() {
        return this.dataPostagem;
    }

}