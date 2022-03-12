
package com.service.service_tarefa;

import DTO.PaisDTO;
import model.Pais;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.PaisService;


@RestController
@RequestMapping("/pais")
public class PaisController  {
    
    @Autowired
    private PaisService paisService;
    
    @PostMapping
    public ResponseEntity<Pais> create(@RequestBody PaisDTO paisDTO){
        try{
           var pais = new Pais();
        BeanUtils.copyProperties(paisDTO, pais);
        this.paisService.save(pais);
            return ResponseEntity.status(HttpStatus.CREATED).body(pais);
        }catch(Exception e){
            //return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("conflito");
        }
        return null;

    }
    @GetMapping
    public String teste(){
        return "Olá";
    }
}
