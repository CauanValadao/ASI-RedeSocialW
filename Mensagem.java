
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Mensagem extends Publicacao {

    private List<Comentario> comentarios;
    private List<Curtida> curtidas;

    /**
     * Default constructor
     */
    public Mensagem() {
        super();
        this.comentarios = new ArrayList<>();
        this.curtidas = new ArrayList<>();
    }
    public Mensagem(String texto) {
        super(texto);
        this.comentarios = new ArrayList<>();
        this.curtidas = new ArrayList<>();
    }

    public void adicionarComentario(Comentario comentario) {
        this.comentarios.add(comentario);
    }
    public void adicionarCurtida(Curtida curtida) {
        this.curtidas.add(curtida);
    }

    public List<Comentario> getComentarios() {
        return this.comentarios;
    }
    public List<Curtida> getCurtidas() {
        return this.curtidas;
    }
}