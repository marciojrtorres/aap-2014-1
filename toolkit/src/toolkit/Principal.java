package toolkit;

public class Principal {
    public static void main(String[] args) {
        // orientacoesGerais();        
        String s1 = new String("Instituto Federal");
        String s2 = new String("Instituto Federal");
        System.out.println(s1 == s2); // false
        System.out.println(s1.equals(s2)); // true, mas nao podemos usar

        // igual(String,String):boolean
        System.out.println(igual(s1, s2) == true);
        System.out.println(igual("abc", "dba") == false);
        System.out.println(igual("abc", "aBc") == false);
        System.out.println(igual("abc ", "abc") == false);
        System.out.println(igual("", "") == true);


    }





    private static void orientacoesGerais() {
        // API do Java // Nao usar

        String palavra = "furg";
        System.out.println(palavra.length()); // não é permitido
        System.out.println(palavra.charAt(1)); // não é permitido

        // este método é permitido
        char[] letras = palavra.toCharArray();

        System.out.println(letras[0]);
        System.out.println(letras[1]);
        System.out.println(letras[2]);
        System.out.println(letras[3]);

        System.out.println((int)letras[0]);
        System.out.println((int)letras[1]);
        System.out.println((int)letras[2]);
        System.out.println((int)letras[3]);

        System.out.println((int)'a'); // 97 
        System.out.println((int)'z'); // 122
        System.out.println((int)'A'); // 65
        System.out.println((int)'Z'); // 90
        
        System.out.println((char)104); 

        char[] teste = new char[5];
        teste[0] = 't';
        teste[1] = 'e';
        teste[2] = 115;
        teste[3] = 't';
        teste[4] = 'e';

        String strteste = new String(teste);

        System.out.println(strteste);

        char[] exemplo = {'e', 'x', 'e', 'm', 'p', 'l', 'o'};
        System.out.println(exemplo.length);
        System.out.println(exemplo);

        for (int i = 0; i < exemplo.length; i++) {
            System.out.println((char) (exemplo[i] + 1));
        }

        for (int i = 0; i < exemplo.length; i++) {
            System.out.println((char) (exemplo[i] - 32));
        }
    }
}