package project.Classes;

import java.util.ArrayList;

public class Biblioteca {
  private ArrayList<Livro> livros = new ArrayList<Livro>(); // Lista de livros

  public Biblioteca(){
    Livro livro1 = new Livro("1984", "George Orwell", "1949");
    Livro livro2 = new Livro("Dom Quixote", "Miguel de Cervantes", "1605");
    Livro livro3 = new Livro("Orgulho e Preconceito", "Jane Austen", "1813");
    Livro livro4 = new Livro("Moby Dick", "Herman Melville", "1851");
    Livro livro5 = new Livro("Guerra e Paz", "Liev Tolstói", "1869");
    Livro livro6 = new Livro("O Grande Gatsby", "F. Scott Fitzgerald", "1925");
    Livro livro7 = new Livro("A Metamorfose", "Franz Kafka", "1915");
    Livro livro8 = new Livro("O Apanhador no Campo de Centeio", "J.D. Salinger", "1951");
    Livro livro9 = new Livro("Cem Anos de Solidão", "Gabriel García Márquez", "1967");
    Livro livro10 = new Livro("Ulisses", "James Joyce", "1922");
    livros.add(livro1);
    livros.add(livro2);
    livros.add(livro3);
    livros.add(livro4);
    livros.add(livro5);
    livros.add(livro6);
    livros.add(livro7);
    livros.add(livro8);
    livros.add(livro9);
    livros.add(livro10);
  }

  public ArrayList<Livro> getLivros() {
    return livros;
  }
}