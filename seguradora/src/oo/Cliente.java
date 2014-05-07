package oo;

import java.util.ArrayList;

// Eclipse:
// CTRL + ESPACO = Autocompletar
// CTRL + 1 = Assistente de código
// CTRL + 3 = Buscar comandos do menu
// Outras: CTRL + SHIFT + F = Indentar

// new Cliente() (acontece também um new Endereco())

public class Cliente {

	public enum Genero {
		// 0, 1 // ordinal
		Masculino, Feminino;
	}
	
	private int numero;
	private String nome;
	private Conta conta;
	private int idade;
	// smell: grupo de dados solução: mover os dados para uma nova classe
	private Endereco endereco = new Endereco(); // contruindo
	// coleção
	private Telefone[] telefones = new Telefone[3];
	// private char genero; // 'M', 'F', se é finito use enum
	
	private Genero genero;
	
	public Cliente(String nome, Conta conta, int idade) {
		super();
		this.nome = nome;
		this.conta = conta;
		this.idade = idade;
		for (int i = 0; i < telefones.length; i++) {
			telefones[i] = new Telefone();
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}


	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone[] getTelefones() {
		return telefones;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	/*
	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		if (genero != 'M' && genero != 'F') {
			throw new IllegalArgumentException("genero M ou F, recebido " + genero);
		}
		this.genero = genero;
	}
	*/



}