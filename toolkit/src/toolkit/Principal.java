package toolkit;


public class Principal {
    public static void main(String[] args) {
    	IList lista = new List();
    	
    	System.out.println(lista.length() == 0);

    	lista.append("a");

    	System.out.println(lista.length() == 1);

    	
    	lista.append("b");
    	lista.append("c");
    	lista.append("d");
    	lista.append("e");

    	System.out.println(lista.length() == 5);
    	
    	
    	lista.append(null);

    	System.out.println(lista.length() == 5);

    	
    	System.out.println(lista.get(0).equals("a"));
    	System.out.println(lista.get(4).equals("e"));    	
    	
    	System.out.println(lista.get(5) == null);
    	System.out.println(lista.get(-8) == null);
    	
    	

    	System.out.println(lista.drop(1) == true); 

    	System.out.println(lista.length() == 4);
    	
    	// while (lista.drop(0)); 

    	// System.out.println(lista.length() == 0);
    	
    	System.out.println(lista.get(0).equals("a"));
    	System.out.println(lista.get(1).equals("c"));
    	System.out.println(lista.get(2).equals("d"));
    	System.out.println(lista.get(3).equals("e"));

    	System.out.println(lista.drop(7) == false);

    	System.out.println(lista.length() == 4);

    	for (int i = 0; i < 1000; i++) lista.append("teste");

    	System.out.println(lista.length() == 1004);
        
    	
    	
    }


    private static void orientacoesGerais() {
        // API do Java // Nao usar

        String palavra = "furg";
        System.out.println(palavra.length()); // não é permitido
        System.out.println(palavra.charAt(1)); // não é permitido

        // este método é permitido
        char[] letras = palavra.toCharArray();

        // consultando o tamanho
        System.out.println(letras.length);

        // lendo cada caractere no array
        System.out.println(letras[0]);
        System.out.println(letras[1]);
        System.out.println(letras[2]);
        System.out.println(letras[3]);

        // lendo o código numérico cada caractere
        System.out.println((int)letras[0]);
        System.out.println((int)letras[1]);
        System.out.println((int)letras[2]);
        System.out.println((int)letras[3]);

        // o código das letras minúsculas e maiúsculas
        System.out.println((int)'a'); // 97 
        System.out.println((int)'z'); // 122
        System.out.println((int)'A'); // 65
        System.out.println((int)'Z'); // 90
        
        // lendo o caractere a partir de um código
        System.out.println((char)104); 

        // criando um array de caracteres e inicializando
        char[] teste = new char[5];
        teste[0] = 't';
        teste[1] = 'e';
        teste[2] = 115;
        teste[3] = 't';
        teste[4] = 'e';

        // criando uma string a partir deste array
        String strteste = new String(teste);

        System.out.println(strteste);

        // declarando e inicializando um array de caracteres
        char[] exemplo = {'e', 'x', 'e', 'm', 'p', 'l', 'o'};
        System.out.println(exemplo.length);
        System.out.println(exemplo);

        // percorrendo (iterando) o array de caracteres
        for (int i = 0; i < exemplo.length; i++) {
            System.out.println(exemplo[i]);
        }

        // percorrendo e modificando o caractere
        for (int i = 0; i < exemplo.length; i++) {
            System.out.println((char) (exemplo[i] + 1));
        }

        for (int i = 0; i < exemplo.length; i++) {
            System.out.println((char) (exemplo[i] - 32));
        }
    }
}