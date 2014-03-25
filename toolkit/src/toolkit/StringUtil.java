package toolkit;

public class StringUtil {

    // CONSTANTE
    private static final int ESPACO = 32;
    
    public static boolean eq(String s1, String s2) {
        
        char[] l1 = s1.toCharArray();
        char[] l2 = s2.toCharArray();

        if (l1.length != l2.length) return false;

        for (int i = 0; i < l1.length; i++) if (l1[i] != l2[i]) return false;

        return true;
    }

    public static String trimLeftBad(String s) {

        char[] l = s.toCharArray();

        int c = 0;

        for (int i = 0; i < l.length; i++) {
            if (l[i] == 32) {
                c++;
            } else {
                break;
            }
        }

        char[] r = new char[l.length - c];

        for (int i = 0; i < r.length; i++) {
            r[i] = l[i + c];
        }

        return new String(r);
    }


    public static String trimLeft(String frase) {
        // refatoração: pegar um codigo que ja funciona
        // e altera-lo para melhorar a leitura e entendimento
        // prática de refatoração, por exemplo:
        // - renomear (mais legivel, facil de entender)
        // - introduzir constante (eliminar numeros magicos)
        // o que eh um numero magico? MAU CHEIRO (CODE SMELL)

        char[] letras = frase.toCharArray();

        int nroEspacos = 0;

        for (int i = 0; i < letras.length; i++) {
            if (letras[i] == ESPACO) {
                nroEspacos = nroEspacos + 1;
            } else {
                break;
            }
        }

        char[] resultado = new char[letras.length - nroEspacos];

        for (int i = 0; i < resultado.length; i++) {
            resultado[i] = letras[i + nroEspacos];
        }

        return new String(resultado);
    }

}