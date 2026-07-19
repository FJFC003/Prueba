package com.uisrael.campeonato.aplicacion.casosuso.entradas;

import java.util.List;


import com.uisrael.campeonato.dominio.entidades.Categoria;

public interface ICategoriaUseCase {

	Categoria guardar(Categoria nuevaCategoria);

	Categoria buscarPorId(int idCategoria);

	List<Categoria> listarTodos();

	void eliminar(int idCategoria);
}
