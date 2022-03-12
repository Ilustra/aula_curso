
package repositories;

import model.Pais;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PaisRepository extends JpaRepository<Pais, Integer>{
    public boolean existsBySigla(String sigla);
    
}
