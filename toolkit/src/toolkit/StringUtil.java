package toolkit;

public class StringUtil {

    public static boolean eq (String string1, String string2) {

        char [] frase1 = string1.toCharArray();
        char [] frase2 = string2.toCharArray();
        
        if (frase1.length != frase2.length) return false;

        // TODO refatorar esse "for"
        for (int i = 0; i < frase1.length; i++) {
            if (frase1[i] != frase2[i]) {
                return false;
            }
        }
        return true;
    }


    public static String substr (String str, int posicaoInicial) {
        // System.out.println("Método Reduzido");
        return substr(str, posicaoInicial, str.length());
    }

    public static String substr (String str, int posicaoInicial, int posicaoFinal) {

        char [] frase = str.toCharArray();

        if (posicaoInicial < 0) posicaoInicial = posicaoInicial + frase.length;

        if (posicaoInicial < 0) return new String(frase);

        if (posicaoFinal < 0) posicaoFinal = posicaoFinal + frase.length;

        if (posicaoFinal > frase.length) posicaoFinal = frase.length;

        int tamanho = posicaoFinal - posicaoInicial;

        if ((tamanho > frase.length) || (tamanho < 0)) return ""; //tamanho = 0; //frase.length;
            
        char [] novoString = new char [tamanho];

        for (int i = 0; i < novoString.length; i++) novoString[i] = frase[posicaoInicial + i];

        return new String(novoString);

    }
}





    









