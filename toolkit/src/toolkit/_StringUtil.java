package toolkit;

// para gerar o javadoc: 
// javadoc -d doc -sourcepath src toolkit
//         destino        pasta dos fontes e pacote

/**
 * Esta classe tem metodos utilitarios
 * para <b>trabalhar com strings</b> e textos em geral
 */
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

    /**
     * Retorna uma string sem os espacos a esquerda,
     * sendo espacos considerados o caractere ' ' 
     * ASC-II 32. Se a string nao tiver espacos
     * a esquerda a mesma string eh retornada.
     *
     * @param frase A string com espacos (ou nao) a esquerda
     * @return A string sem os espacos a esquerda
     * @throws NullPointerExpcetion se o parametro for nulo
     */
    public static String trimLeft(String frase) {
        if (frase == null) throw new NullPointerExpcetion("frase nula");
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