
package x_abstracts;
import x_interfaces.ICRUD;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;


public  abstract class CurdController<T, DTO, ID> implements ICRUD<T, DTO, ID>
{

    @Override
    @GetMapping
    public ResponseEntity<List<T>> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    @GetMapping("/{id}")
    public T getById() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    @PostMapping()
    public  ResponseEntity<T> create(DTO entidade) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    @PutMapping
    public  ResponseEntity<T> update(DTO entidade) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(ID id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
