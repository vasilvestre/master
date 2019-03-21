package Service;

import Dao.AdherentDao;
import Model.Adherent;

import java.util.List;

public class AdherentService {
    private static AdherentDao adherentDao;

    public AdherentService() {
        adherentDao = new AdherentDao();
    }

    public void persist(Adherent entity) {
        adherentDao.openCurrentSessionwithTransaction();
        adherentDao.persist(entity);
        adherentDao.closeCurrentSessionwithTransaction();
    }

    public void update(Adherent entity) {
        adherentDao.openCurrentSessionwithTransaction();
        adherentDao.update(entity);
        adherentDao.closeCurrentSessionwithTransaction();
    }

    public Adherent findById(Integer id) {
        adherentDao.openCurrentSession();
        Adherent adherent = (Adherent) adherentDao.findById(id);
        adherentDao.closeCurrentSession();
        return adherent;
    }

    public void delete(Integer id) {
        adherentDao.openCurrentSessionwithTransaction();
        Adherent adherent = (Adherent) adherentDao.findById(id);
        adherentDao.delete(adherent);
        adherentDao.closeCurrentSessionwithTransaction();
    }

    public List<Adherent> findAll() {
        adherentDao.openCurrentSession();
        List<Adherent> adherents = adherentDao.findAll();
        adherentDao.closeCurrentSession();
        return adherents;
    }

    public List<Adherent> findAllOrderBy(String field, String order) {
        adherentDao.openCurrentSession();
        List<Adherent> adherents = adherentDao.findAllOrderBy(field, order);
        adherentDao.closeCurrentSession();
        return adherents;
    }

    public void deleteAll() {
        adherentDao.openCurrentSessionwithTransaction();
        adherentDao.deleteAll();
        adherentDao.closeCurrentSessionwithTransaction();
    }

    public AdherentDao adherentDao() {
        return adherentDao;
    }
}
