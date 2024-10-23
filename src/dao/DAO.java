package dao;
import java.util.List;
import java.util.Optional;

public interface DAO<T, ID> {

    // Método para guardar o crear
    Optional<T> save(T entity);

    // Método para buscar
    Optional<T> findById(ID id);

    // Método para listar
    List<T> findAll();

    // Método para actualizar
    void update(T entity);

    // Método para eliminar
    void deleteById(ID id);
}
