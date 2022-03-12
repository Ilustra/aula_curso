package x_interfaces;




import java.util.List;

public interface ICRUD<T, ObjectDTO, ID> {
    
    List<T> findAll();
    
    T getById();
    
    void create(ObjectDTO entidade);
    
    T update(ObjectDTO entidade);
    
    void delete(ID id);
    
}
