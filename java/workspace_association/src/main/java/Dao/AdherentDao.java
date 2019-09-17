package Dao;

import Model.Adherent;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.io.Serializable;
import java.util.List;

public class AdherentDao implements AdherentInterface {

    private Session currentSession;

    private Transaction currentTransaction;

    public AdherentDao() {
    }

    public Session openCurrentSession() {
        currentSession = getSessionFactory().openSession();
        return currentSession;
    }

    public Session openCurrentSessionwithTransaction() {
        currentSession = getSessionFactory().openSession();
        currentTransaction = currentSession.beginTransaction();
        return currentSession;
    }

    public void closeCurrentSession() {
        currentSession.close();
    }

    public void closeCurrentSessionwithTransaction() {
        currentTransaction.commit();
        currentSession.close();
    }

    private static SessionFactory getSessionFactory() {
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(Adherent.class);
        StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties());
        return configuration.buildSessionFactory(builder.build());
    }

    private Session getCurrentSession() {
        return currentSession;
    }

    public void setCurrentSession(Session currentSession) {
        this.currentSession = currentSession;
    }

    public Transaction getCurrentTransaction() {
        return currentTransaction;
    }

    public void setCurrentTransaction(Transaction currentTransaction) {
        this.currentTransaction = currentTransaction;
    }

    public void persist(Object entity) {
        getCurrentSession().save(entity);
    }

    public void update(Object entity) {
        getCurrentSession().update(entity);
    }

    public Object findById(Serializable id) {
        return (Adherent) getCurrentSession().get(Adherent.class, id);
    }

    public void delete(Object entity) {
        getCurrentSession().delete(entity);
    }

    @SuppressWarnings("unchecked")
    public List<Adherent> findAll() {
        return (List<Adherent>) getCurrentSession().createQuery("from Adherent").list();
    }

    @SuppressWarnings("unchecked")
    public List<Adherent> findAllOrderBy(String field, String order) {
        return (List<Adherent>) getCurrentSession().createQuery("from Adherent order by " + field + " " + order).list();
    }

    public void deleteAll() {
        List<Adherent> entityList = findAll();
        for (Adherent entity : entityList) {
            delete(entity);
        }
    }
}
