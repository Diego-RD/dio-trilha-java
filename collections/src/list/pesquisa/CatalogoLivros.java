package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

// atributo aqui e so uma variável que vai receber o Array
  private List<Livro> livrolist;

// Construtor que inicia o array vazio.
  public CatalogoLivros() {
    this.livrolist = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao){
    livrolist.add(new Livro(titulo, autor, anoPublicacao));
  }

  public List<Livro> pesquisarPorAutor(String autor){
    List<Livro> livrosPorAutor = new ArrayList<>();
    if(!livrolist.isEmpty()){
      for(Livro l : livrolist){
        if (l.getAutor().equalsIgnoreCase(autor)) {
          livrosPorAutor.add(l);
        }
      }
    }
    return livrosPorAutor;
  }

  public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
    List<Livro> livrosPorAIntervaloAnos = new ArrayList<>();
    if (!livrolist.isEmpty()) {
      for(Livro l : livrolist){
        if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
          livrosPorAIntervaloAnos.add(l);
        }
      }
    }
    return livrosPorAIntervaloAnos;
  }

  public Livro pesquisarPorTitulo(String titulo){
    Livro livroPorTitulo = null;
    if(!livrolist.isEmpty()){
      for(Livro l : livrolist){
        if(l.getTitulo().equalsIgnoreCase(titulo)){
          livroPorTitulo = l;
          break;
        }
      }
    }
    return livroPorTitulo;
  }

  public static void main(String[] args) {
    CatalogoLivros catalogoLivros = new CatalogoLivros();

    catalogoLivros.adicionarLivro("Livro 1","Autor 1", 1720);
    catalogoLivros.adicionarLivro("Livro 1","Autor 2", 1999);
    catalogoLivros.adicionarLivro("Livro 3","Autor 2", 1988);
    catalogoLivros.adicionarLivro("Livro 4","Autor 4", 2005);
    catalogoLivros.adicionarLivro("Livro 5","Autor 5", 2019);
    catalogoLivros.adicionarLivro("Livro 6","Autor 6", 2001);

    System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
    System.out.println("-----------------------");
    System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2000,2022));
    System.out.println("-----------------------");
    System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));

  }


}
