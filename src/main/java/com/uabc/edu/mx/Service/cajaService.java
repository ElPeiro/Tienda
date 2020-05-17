package com.uabc.edu.mx.Service;

import com.uabc.edu.mx.modelo.caja;
import com.uabc.edu.mx.repository.cajaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class cajaService implements interCajaService{

    @Autowired
    cajaRepo repositorio;

    @Override
public List<caja> listar(){

    List<caja> result =(List<caja>)repositorio.findAll();
    if(result.size() > 0) {
        return result;
    } else {
        return new ArrayList<caja>();
    }
}

@Override
public caja listarId(int id){
    Optional<caja> caj = repositorio.findById((long) id);
    return caj.get();
}

    @Override
    public int save(caja u) {
        int res=0;

        caja us =  repositorio.save(u);
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
