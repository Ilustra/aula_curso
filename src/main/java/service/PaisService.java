
package service;

import model.Pais;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import antlr.collections.List;
import repositories.PaisRepository;

@Service
public class PaisService {
    @Autowired
    private PaisRepository paisRepository;

    public Pais save(Pais pais) {
        return this.paisRepository.save(pais);
    }

    public boolean nexistsBySigla(String sigla) {
        return this.paisRepository.existsBySigla(sigla);
    }

    
}
