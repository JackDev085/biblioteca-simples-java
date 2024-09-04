package project.Classes;
import java.util.Scanner;

import java.util.ArrayList;

public class Usuario {
  private String nome;
  private ArrayList<Livro> livros_emprestados = new ArrayList<Livro>();
  private Biblioteca biblioteca = new Biblioteca();
  private ArrayList<Livro> livros_disponiveis = biblioteca.getLivros();


  public Usuario(String nome) {
    this.nome = nome;
  }

  public void addLivro() {
    limpa();
    Livro livro_escolhido = perguntaLivro();
    livros_emprestados.add(livro_escolhido);
    limpa();
    System.out.println("===================================");
    System.out.println(livro_escolhido+" emprestado com sucesso!");
    System.out.println("===================================");
    System.out.println();
  } 

  private Livro perguntaLivro(){

    int j = 0;
    // Mostra a lista de livros disponíveis
    System.out.println("===================================");
    System.out.println("Qual livro você deseja pegar emprestado?");
    System.out.println();
    for (Livro livro:livros_disponiveis) {
      System.out.println(j + " - " + livro);
      j++;
    }
    System.out.println("===================================");
    Scanner scanner = new Scanner(System.in);
    int escolha1 = scanner.nextInt();


    return livros_disponiveis.remove(escolha1);

  }

  public void getLivros_emprestados() {
    limpa();
    
    System.out.println("===================================");
    System.out.println("Livros emprestados por " + this.nome);
    System.out.println();
    int iterador = 0;
    for (Livro livro:livros_emprestados) {
      System.out.println(iterador + " - " + livro);
      iterador++;
    }
    System.out.println("===================================");
  }
  public String toString(){
    return "Nome do usuário: " + this.nome;
  }


public  void limpa(){
  for (int i = 0; i < 50; ++i) System.out.println();
}}
