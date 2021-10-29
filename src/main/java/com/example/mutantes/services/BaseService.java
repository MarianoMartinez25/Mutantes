package com.example.mutantes.services;

import com.example.mutantes.entities.Base;

import java.io.Serializable;


public interface BaseService<E extends Base, ID extends Serializable> {


     //Trae una lsita de todas las "Entidades" en la base de datos
    //public List<E> findAll() throws Exception;

    //Metodo que trae entidades pero paginado
    //public Page<E> findAll(Pageable pageable) throws Exception;

    //Trae una entidad de acuerdo a su id
    public E findById(ID id) throws Exception;

    //Crea una entidad
    public E save(E entity) throws Exception;

    //Actualiza un entidad
    public E update(ID id,E entity) throws Exception;

    //Eliminar un registro de la db
    public boolean delete(ID id) throws Exception;


}
