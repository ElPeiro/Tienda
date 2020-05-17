package com.uabc.edu.mx.Service;


import com.uabc.edu.mx.modelo.articulo;
import com.uabc.edu.mx.repository.articuloRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class articuloService implements interArticuloService {


    @Autowired
    articuloRepo repositorio;

    @Override
    public List<articulo> listar(){

        List<articulo> result = (List<articulo>) repositorio.findAll();
        if(result.size() > 0) {
            return result;
        } else {
            return new ArrayList<articulo>();
        }
    }

    @Override
    public articulo listarId(int id){
        Optional<articulo> arti = repositorio.findById((long) id);
        return arti.get();
    }



    @Override
    public int save(articulo u) {
        int res=0;

        articulo us =  repositorio.save(u);
        if (!us.equals(null)){
            res=1;
        }
        return res;

    }


    @Override
    public void delete(int id) {
        repositorio.deleteById((long) id);
    }



}
