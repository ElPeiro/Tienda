package com.uabc.edu.mx.webController;


import com.uabc.edu.mx.Service.interArticuloService;
import com.uabc.edu.mx.modelo.articulo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping
public class articulosController {

    @Autowired
    private interArticuloService service;


    @GetMapping("/listarArticulos")
    public String listar(Model model){
        List<articulo> u = service.listar();
        model.addAttribute("articulos",u);
        return "tienda";
    }

    @PostMapping("/venta")
    public String venta(@Valid articulo a , Model model){


        return "";
    }


}
