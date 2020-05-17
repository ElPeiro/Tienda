package com.uabc.edu.mx.repository;

import com.uabc.edu.mx.modelo.cajero;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface cajeroRepo extends CrudRepository<cajero,Long> {
}
