
package metier;

import dao.IDao;
import entities.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
// message personnelle::0637
@Repository
public class ProductDaoImpl implements IDao<Product> {

    @Autowired
    private SessionFactory sessionFactory;
    // message personnelle::0637
    @Override
    @Transactional
    public boolean create(Product product) {
        Session session = sessionFactory.getCurrentSession();
        session.save(product);
        return true;
    }
    // message personnelle::0637
    @Override
    @Transactional
    public boolean delete(Product product) {
        sessionFactory.getCurrentSession().delete(product);
        return true;
    }

    @Override
    @Transactional
    public boolean update(Product product) {
        sessionFactory.getCurrentSession().update(product);
        return true;
    }

    @Override
    @Transactional(readOnly = true)  // lecture seule = optimisé
    public Product findById(int id) {
        return sessionFactory.getCurrentSession().get(Product.class, id);
    }

    @Override
    @Transactional(readOnly = true)  // lecture seule = optimisé
    public List<Product> findAll() {
        return sessionFactory.getCurrentSession()
                .createQuery("from Product", Product.class)
                .list();
    }
// implementer les @Transaction sur les autre methode
}