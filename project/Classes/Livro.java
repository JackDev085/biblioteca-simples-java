package project.Classes;

public class Livro {
 
  private String nome_livro;
  private String autor;
  private String ano;

  public Livro(){
    
  }
  public Livro(String nome_livro, String autor, String ano) {
    this.nome_livro = nome_livro;
    this.autor = autor;
    this.ano = ano;
  }
  public String toString(){
    return nome_livro;
  }

  
}
