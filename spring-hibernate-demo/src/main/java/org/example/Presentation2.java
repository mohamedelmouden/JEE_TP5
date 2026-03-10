package org.example;
// donner le package
//        Créer la classe Presentation2.java
import dao.IDao;
import entities.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import util.HibernateConfig;
// message personnelle::0637
public class Presentation2 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(HibernateConfig.class);
// message personnelle::0637
        IDao<Product> productDao = context.getBean(IDao.class);
// message personnelle::0637
        Product product = new Product();
        product.setName("Produit 1");
        product.setPrice(100.0);
// message personnelle::0637
        productDao.create(product);
// message personnelle::0637
        System.out.println("Produit sauvegardé : " + product.getName());
    }
}