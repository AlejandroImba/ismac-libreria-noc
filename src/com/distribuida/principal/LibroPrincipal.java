package com.distribuida.principal;

import java.util.Date;

import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Libro;

public class LibroPrincipal {
	public static void main(String[] args) {
		Categoria categoria=new Categoria(1,"Terror","Historias de terror que transmiten todos los sentimientos");
		Autor autor=new Autor(1,"Robert de","Niro","España","Madrid","5748199932","deniro@hotmail.com");
		Libro libro=new Libro();
		libro.setIdLibro(1);
		libro.setTitulo("Alicia en el pais de las maravillas");
		libro.setEditorial("Editorial Ecuatorial");
		libro.setNumPaginas(276);
		libro.setEdicion("Edicion #1");
		libro.setIdioma("Español");
		libro.setFechaPublicacion(new Date());
		libro.setDescripcion("Una chica perdida en un lugar maravillosa");
		libro.setTipoPasta("Pasta dura");
		libro.setiSBN("97884968*");
		libro.setNumEjemplares(150);
		libro.setPortada("Colorida");
		libro.setPresentacion("Libro empastado con funda de regalo personalizada");
		libro.setPrecio(15.76);
		libro.setCategoria(categoria);
		libro.setAutor(autor);
		System.out.println(libro);
		
		
	}

}
