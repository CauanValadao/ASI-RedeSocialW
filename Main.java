public class Main {

    public static void main(String[] args) {

        System.out.println("--- INICIO DO TESTE DA REDE SOCIAL W ---");

        // --- 1. CADASTRO DE USUÁRIO E VALIDAÇÃO ---
        
        System.out.println("\n--- 1. CADASTRO DE USUARIO E VALIDACAO ---");
        
        // Criando Usuário 1 (Felipe)
        Usuario u1 = new Usuario("Felipe Silva", "felipe@email.com", "fsilva");
        System.out.println("Usuário cadastrado com sucesso! (ID: " + u1.getID() + ", Nome: " + u1.getNome() + ")");

        // Criando Usuário 2 (Lara)
        Usuario u2 = new Usuario("Lara Souza", "lara@email.com", "larinha");
        System.out.println("Usuário cadastrado com sucesso! (ID: " + u2.getID() + ", Nome: " + u2.getNome() + ")");

        // --- 2. POSTAGEM E INTERAÇÃO SOCIAL ---
        
        System.out.println("\n--- 2. POSTAGEM E INTERAÇÃO SOCIAL ---");
        
        System.out.println(u1.getNome() + " está postando uma mensagem...");
        u1.postarMensagem("Minha primeira postagem na Rede W!");
        System.out.println("Mensagem postada.");


        Mensagem msg1 = (Mensagem) u1.getPublicacoes().get(0);

        // Lara (u2) vai interagir com a msg1
        System.out.println(u2.getNome() + " está curtindo a mensagem de " + u1.getNome() + "...");
        u2.curtirMensagem(msg1);
        System.out.println(u2.getNome() + " curtiu sua mensagem.");

        System.out.println(u2.getNome() + " está comentando na mensagem de " + u1.getNome() + "...");
        u2.comentarMensagem("Otimo post!", msg1);
        System.out.println(u2.getNome() + " comentou na sua mensagem: \"Otimo post!\"");

        // Felipe (u1) posta uma segunda mensagem
        u1.postarMensagem("Hello World!");
        System.out.println("Mensagem postada.");
        
        Mensagem msg2 = (Mensagem) u1.getPublicacoes().get(1);

        // --- 3. VISUALIZAÇÃO DE RELACIONAMENTOS ---

        System.out.println("\n--- 3. VISUALIZAÇÃO DE RELACIONAMENTOS ---");

        System.out.println("Mensagem " + msg1.getID() + " recebeu " + msg1.getComentarios().size() + " comentário.");
        System.out.println("Mensagem " + msg2.getID() + " recebeu " + msg2.getComentarios().size() + " comentário.");

        // Simula a contagem de curtidas da foto (5 e 10 curtidas)
        // adicionar mais 4 curtidas na msg1 (total 5)
        // e 9 na msg2 (total 10, a Lara já curtiu 1 vez)
        for(int i = 0; i < 4; i++) u2.curtirMensagem(msg1);
        for(int i = 0; i < 9; i++) u1.curtirMensagem(msg2);

        // Agora, lista todas as mensagens da rede
        System.out.println("\nMensagens publicadas:");

        System.out.println("---------------------------------");
        System.out.println(msg1.getTexto());
        System.out.println(msg1.getCurtidas().size() + " curtidas"); // Usando o getCurtidas()
        System.out.println(msg1.getDataPostagem());

        System.out.println("---------------------------------");
        System.out.println(msg2.getTexto());
        System.out.println(msg2.getCurtidas().size() + " curtidas"); // Usando o getCurtidas()
        System.out.println(msg2.getDataPostagem());

        // --- 4. ATUALIZAÇÃO E EXCLUSÃO ---

        System.out.println("\n--- 4. ATUALIZAÇÃO ---");
        
        // Atualização de usuário
        System.out.println("Atualizando nome de " + u2.getNome() + "...");
        u2.setNome("Ana Beatriz Silva"); // Usando o setNome()
        System.out.println("Nome de usuário atualizado para " + u2.getNome() + " com sucesso.");
        
        System.out.println("\n--- FIM DO TESTE ---");
    }
}