package jogotenis;

public class JogoTenis3 implements JogoTenis {
    
    private int p2;
    private int p1;
    private String p1N = "jogador1";
    private String p2N = "jogador2";

    public String getScore() {
        String s;
        if (p1 < 4 && p2 < 4 && !(p1 + p2 == 6)) {
            String[] p = new String[]{"Love", "Fifteen", "Thirty", "Forty"}; 
            s = p[p1];
            return (p1 == p2) ? s + "-All" : s + "-" + p[p2];
        } else {
            if (p1 == p2)
                return "Deuce";
            s = p1 > p2 ? p1N : p2N;
            return ((p1-p2)*(p1-p2) == 1) ? "Vantagem de " + s : "Vitoria de " + s;
        }
    }
    
    public void pontoPara(String playerName) {
        if (playerName == "jogador1") this.p1 += 1;
        else this.p2 += 1;        
    }

}
