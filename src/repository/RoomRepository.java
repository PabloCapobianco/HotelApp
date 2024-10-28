package repository;
import model.Room;
import java.util.List;
import java.util.Optional;

import  dao.DAO;

public class RoomRepository implements DAO<Room, Integer> {
    // Listado de Rooms
    private List<Room> Rooms;

    //Constructor Privado
    private RoomRepository() {
        // Debe llamar al método del getAll del DAO
    }
    private static RoomRepository instance;


    public static synchronized RoomRepository getInstance() {
        if (instance == null) {
            instance = new RoomRepository();
        }
        return instance;
    }



    @Override
    public Optional<Room> save(Room room) {
        // Lógica de guardado
    }

    @Override
    public Optional<Room> findById(Integer id) {
        // Lógica para encontrar por ID
        return Optional.empty();
    }

    @Override
    public List<Room> findAll() {
        // Lógica para encontrar todas las habitaciones
        return null;
    }

    @Override
    public void update(Room room) {
        // Lógica de actualización
    }

    @Override
    public void deleteById(Integer id) {
        // Lógica para eliminar por ID
    }

}
