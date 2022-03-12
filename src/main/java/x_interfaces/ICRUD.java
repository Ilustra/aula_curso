package x_interfaces;




import java.util.List;
import model.Pais;
import org.springframework.http.ResponseEntity;

public interface ICRUD<T, ObjectDTO, ID> {
    
    ResponseEntity<List<T>> findAll();
    
    T getById();
    
    ResponseEntity<T> create(ObjectDTO entidade);
    
    ResponseEntity<T> update(ObjectDTO entidade);
    
    void delete(ID id);
    
}
