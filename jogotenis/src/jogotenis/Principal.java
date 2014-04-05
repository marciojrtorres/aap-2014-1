package jogotenis;

public class Principal {
    public static void main(String[] args) {

        vitoriaDeJogador2();
        empateComVitoriaDeJogador2();

    }

    private static void vitoriaDeJogador2() {
        JogoTenis3 jogo = new JogoTenis3();

        System.out.println(jogo.getScore());
        System.out.println(jogo.getScore().equals("Love-All"));

        jogo.pontoPara("jogador1");

        System.out.println(jogo.getScore());
        System.out.println(jogo.getScore().equals("Fifteen-Love"));

        jogo.pontoPara("jogador2");

        System.out.println(jogo.getScore());
        System.out.println(jogo.getScore().equals("Fifteen-All"));

        jogo.pontoPara("jogador2");

        System.out.println(jogo.getScore());
        System.out.println(jogo.getScore().equals("Fifteen-Thirty"));

        jogo.pontoPara("jogador2");

        System.out.println(jogo.getScore());
        System.out.println(jogo.getScore().equals("Fifteen-Forty"));

        jogo.pontoPara("jogador2");

        System.out.println(jogo.getScore());
        System.out.println(jogo.getScore().equals("Vitoria de jogador2"));
    }

    private static void empateComVitoriaDeJogador2() {
        JogoTenis3 jogo = new JogoTenis3();

        System.out.println(jogo.getScore());
        System.out.println(jogo.getScore().equals("Love-All"));

        jogo.pontoPara("jogador1");

        System.out.println(jogo.getScore());
        System.out.println(jogo.getScore().equals("Fifteen-Love"));

        jogo.pontoPara("jogador2");

        System.out.println(jogo.getScore());
        System.out.println(jogo.getScore().equals("Fifteen-All"));

        jogo.pontoPara("jogador1");
        jogo.pontoPara("jogador2");

        System.out.println(jogo.getScore());
        System.out.println(jogo.getScore().equals("Thirty-All"));

        jogo.pontoPara("jogador1");
        jogo.pontoPara("jogador2");

        System.out.println(jogo.getScore());
        System.out.println(jogo.getScore().equals("Deuce"));

        jogo.pontoPara("jogador1");

        System.out.println(jogo.getScore());
        System.out.println(jogo.getScore().equals("Vantagem de jogador1"));

        jogo.pontoPara("jogador2");
        
        System.out.println(jogo.getScore());
        System.out.println(jogo.getScore().equals("Deuce"));

        jogo.pontoPara("jogador2");
        
        System.out.println(jogo.getScore());
        System.out.println(jogo.getScore().equals("Vantagem de jogador2"));

        jogo.pontoPara("jogador2");
        
        System.out.println(jogo.getScore());
        System.out.println(jogo.getScore().equals("Vitoria de jogador2"));

    }
}