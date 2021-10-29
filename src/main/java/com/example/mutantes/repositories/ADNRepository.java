package com.example.mutantes.repositories;

import com.example.mutantes.entities.ADN;
import org.springframework.stereotype.Repository;

@Repository
public interface ADNRepository extends  BaseRepository<ADN,Long>{

    /*
    List<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido);

    //Paginada
    Page<Persona> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);

    //boolean existByDni(int dni);

    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    List<Persona> search(@Param("filtro") String filtro);

    //Paginada
    @Query(value = "SELECT p FROM Persona p WHERE p.nombre LIKE %:filtro% OR p.apellido LIKE %:filtro%")
    Page<Persona> search(@Param("filtro") String filtro, Pageable pageable);


    @Query(
            value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro% ",
            nativeQuery = true
    )
    List<Persona> searchNativo(@Param("filtro") String filtro);

    //Paginada
    @Query(
            value = "SELECT * FROM persona WHERE persona.nombre LIKE %:filtro% OR persona.apellido LIKE %:filtro% ",
            countQuery = "SELECT  count(*) FROM persona",
            nativeQuery = true
    )
    Page<Persona> searchNativo(@Param("filtro") String filtro, Pageable pageable);
     */
}
