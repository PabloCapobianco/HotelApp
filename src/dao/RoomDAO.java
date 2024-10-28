package dao;
import dbconnection.DBConnection;
import model.Room;

public class RoomDAO implements DAO<Room> {

    private DBConnection dbConnection;
    boolean returnKeys;
    String sqlCommand;

    // Constructor de RoomDAO
    public RoomDAO() {
        // Instancia DBConnection
        this.dbConnection = new DBConnection();
    }

    @Override
    public void insert(Room room) {
        // Implementación del método insert usando dbConnection
    }

    @Override
    public void update(Room room) {
        // Implementación del método update usando dbConnection
    }

    @Override
    public void delete(int id) {
        // Implementación del método delete usando dbConnection
    }

    @Override
    public Room findById(int id) {
        // Implementación del método findById usando dbConnection
        return null;
    }
}
