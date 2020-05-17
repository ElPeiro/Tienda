package com.uabc.edu.mx.repository;

import com.uabc.edu.mx.modelo.caja;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface cajaRepo extends CrudRepository<caja,Long> {
}
