
import java.io.*;
import java.util.*;

/**
 * 
 */
public class Usuario {

    private List<Publicacao> publicacoes; // Agregação (Usuário "tem" publicações)
    private List<Curtida> curtidas; // Agregação (Usuário "tem" curtidas)
    private static int proximoId = 1;

    /**
     * Default constructor
     */
    public Usuario() {
        this.id_usuario = proximoId++;
        this.nome = "";
        this.email = "";
        this.nickname = "";
        this.dtCriacao = new Date().toString();
        this.publicacoes = new ArrayList<>();
        this.curtidas = new ArrayList<>();
    }
    public Usuario(String nome, String email, String nickname) {
        this.id_usuario = proximoId++;
        this.nome = nome;
        this.email = email;
        this.nickname = nickname;
        this.dtCriacao = new Date().toString();
        this.publicacoes = new ArrayList<>();
        this.curtidas = new ArrayList<>();
    }

    /**
     * 
     */
    private int id_usuario;

    /**
     * 
     */
    private String nome;

    /**
     * 
     */
    private String email;

    /**
     * 
     */
    private String nickname;

    /**
     * 
     */
    private String dtCriacao;






    /**
     * 
     */
    public void postarMensagem(String texto) {
        Mensagem mensagem = new Mensagem(texto);
        this.publicacoes.add(mensagem);
    }

    /**
     * 
     */
    public void curtirMensagem(Mensagem mensagem) {
        Curtida curtida = new Curtida(this, mensagem);
        this.curtidas.add(curtida);
        mensagem.adicionarCurtida(curtida);
    }

    /**
     * 
     */
    public void comentarMensagem(String Texto, Mensagem mensagem) {
        Comentario comentario = new Comentario(Texto);
        mensagem.adicionarComentario(comentario);
        this.publicacoes.add(comentario);
    }

    /**
     * 
     */
    public void login() {
        System.out.println("Usuário " + this.nome + " logado com sucesso.");
    }

    /**
     * @return
     */
    public int getID() {
        return this.id_usuario;
    }

    /**
     * @return
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return
     */
    public String getNick() {
        return this.nickname;   
    }

    /**
     * @param nickname
     */
    public void setNick(String nickname) {
        this.nickname = nickname;
    }

    /**
     * @return
     */
    public String getDt() {
        return this.dtCriacao;
    }

    public List<Publicacao> getPublicacoes() {
        return this.publicacoes;
    }
    public List<Curtida> getCurtidas() {
        return this.curtidas;
    }
}