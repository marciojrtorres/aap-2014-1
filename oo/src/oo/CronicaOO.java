// estrutura de um programa orientado a objetos
// relacionada ao modo como os objetos colaboram
// duas abordagens básicas: herança, composição

class Veiculo {
    public void acelera() { // da superclasse

    }

    public int getVelocidade() {

    }

    private void trocarPneu() {

    }
}

class VeiculoTerrestre extends Veiculo {

}

class Carro extends Veiculo { // é um Veiculo

}

class Moto extends Veiculo { // é um Veiculo

}

class Barco extends Veiculo {

}

class MotoEsportiva extends Moto { // é uma Moto e Veiculo

}

class Triciclo extends Carro extends Moto { // heranca multipla (c++, python aceitam)

}

interface Voa {
    public void subir(); // assinatura API
    public void descer();
}

interface Flutua {
    public void jogarAncora();
}

class AviaoAquatico implements Voa, Flutua {
    public void subir() {

    }
    public void descer() {

    }
    public void jogarAncora() {

    }
}

// composição, para delegar responsabilidades
class Pais {
    Cidade capital;
    Estado[] estados;
}

class Cidade {
    String nome;
    int habitantes;
    double pib;
}

class Estado {
    Cidade[] cidades;
}
pais = new Pais("Brasil");
cidade = pais.getCapital().setNome("Brasilia");

pais.getCapital().getPIB();

// delete(pais);

// PROGRAMACAO ORIENTADA A OBJETOS (OOP)
// ANALISE E PROJETO ORIENTADO A OBJETOS (OOAD)
// OBJECT ORIENTED ANALYSIS AND DESIGN

// UML, CASOS DE USO, ... (ANALISE)
// DESIGN: ESTRUTURAR AS CLASSES (OBJETOS)
// PROJETO
// EXISTEM PRINCIPIOS QUE AJUDAM NAS DECISOES
// DRY: SEM REPETICAO
// SRP: RESPONSABILIDADE UNICA
// POLA: MENOR SURPRESA
// PRINCIPIOS ESPECIFICOS DA OO
// DOIS PRINCIPIOS BASICOS:
// PREFERIR INTERFACES DO QUE IMPLEMENTACAO
// PREFERIR COMPOSICAO EM VEZ DE HERANCA
// PADROES DE PROJETO ORIENTADO A OBJETOS


