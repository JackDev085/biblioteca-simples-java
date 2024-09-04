package project;
import java.util.Scanner;

import project.Classes.Usuario;

class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    Usuario user = new Usuario("Joao");
    char escolha;

    boolean terminou = false;
    limpa();
    while(terminou == false){
    System.out.println("===================================");
    System.out.println("O que você deseja fazer?");
    System.out.println();
    System.out.println("1 - Pegar livro emprestado");
    System.out.println("2 - Listar livros emprestados");
    System.out.println("0 - Sair");
    System.out.println("===================================");
    try {
      escolha = entrada.next().charAt(0);
      
      if (escolha == '1') user.addLivro();
      else if (escolha == '2') user.getLivros_emprestados();
      else if (escolha == '0') break;
      else {
        limpa();
      System.out.println("Opção inválida");
      }
      
      
      
    } catch (Exception e) {
      System.out.println("Opção inválida");
      continue;
    }
    
    

  }
  entrada.close();
  }

  public static void limpa(){
    for (int i = 0; i < 50; ++i) System.out.println();
  }
}	