package com.uabc.edu.mx.Service;

import com.uabc.edu.mx.modelo.caja;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface interCajaService {
    public List<caja> listar();
    public caja listarId(int id);
    public int save(caja u);
    public void delete(int id);
}
