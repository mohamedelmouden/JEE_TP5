package dao;
// creation de l interface IDao avec ses 5 fonctions
import java.util.List;
// message personnelle::0637
public interface IDao<T> {
    boolean create(T o);// message personnelle::0637
    boolean delete(T o);
    boolean update(T o);// message personnelle::0637
    T findById(int id);
    List<T> findAll();// message personnelle::0637
}

// message personnelle::0637