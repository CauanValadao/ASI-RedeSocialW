
import java.util.*;

/**
 * 
 */
public class Curtida {

    /**
     * Default constructor
     */
    public Curtida() {
        this.id_curtida = proximoID++;
        this.dtCurtida = new Date().toString();
        this.autor = null;
        this.mensagem = null;
    }

    public Curtida(Usuario autor, Mensagem mensagem) {
        this.id_curtida = proximoID++;
        this.dtCurtida = new Date().toString();
        this.autor = autor;
        this.mensagem = mensagem;
    }

    private static int proximoID = 1;

    /**
     * 
     */
    private int id_curtida;

    /**
     * 
     */
    private String dtCurtida;


    private Usuario autor;
    private Mensagem mensagem;




    /**
     * @return
     */
    public int getID() {
        return this.id_curtida;
    }

    /**
     * @return
     */
    public String getDtCurtida() {
        return this.dtCurtida;
    }

    public Usuario getAutor() {
        return this.autor;
    }
    public Mensagem getMensagem() {
        return this.mensagem;
    }
}