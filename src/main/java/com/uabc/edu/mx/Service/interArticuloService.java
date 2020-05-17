package com.uabc.edu.mx.Service;


import com.uabc.edu.mx.modelo.articulo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface interArticuloService {


    public List<articulo> listar();
    public articulo listarId(int id);
    public int save(articulo u);
    public void delete(int id);


}
