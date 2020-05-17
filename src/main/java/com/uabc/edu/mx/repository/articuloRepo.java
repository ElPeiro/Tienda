package com.uabc.edu.mx.repository;

import com.uabc.edu.mx.modelo.articulo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface articuloRepo extends CrudRepository<articulo,Long> {
}
