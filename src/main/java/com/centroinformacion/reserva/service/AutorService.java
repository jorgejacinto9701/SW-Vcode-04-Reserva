package com.centroinformacion.reserva.service;

import java.util.List;

import com.centroinformacion.reserva.entity.Autor;

public interface AutorService {
	
	public abstract Autor insertaActualizaAutor(Autor obj);
	public abstract List<Autor> listaAutor();
}
