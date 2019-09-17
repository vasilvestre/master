import Model.Adherent;
import Service.AdherentService;

public class Main {
    /**
     * Main method of program.
     *
     * @param args Arguments to main
     */
    public static void main(final String[] args) {
        AdherentService adherentService = new AdherentService();
        System.out.println(adherentService.findAll());
        Adherent adherent1 = new Adherent("jeannine", "paulette", "2019/03/15", "vsil@truc.dlf");
        System.out.println("Ajout d'un adherent");
        adherentService.persist(adherent1);
        System.out.println(adherentService.findAll());
        System.out.println("Modification de l'adhérent");
        adherent1.setLastName("bob");
        adherentService.update(adherent1);
        System.out.println(adherentService.findAll());
        adherentService.delete(adherent1.getId());
        System.out.println("Création de 3 adhérents");
        Adherent adherent2 = new Adherent("jean", "paul", "2018/03/13","2019/03/15", "vsil@truc.dlf");
        Adherent adherent3 = new Adherent("jeanne", "pol", "2017/03/14","2019/03/15", "vsil@truc.dlf");
        Adherent adherent4 = new Adherent("janne", "popol", "2019/03/14","2019/03/15", "vsil@truc.dlf");
        adherentService.persist(adherent2);
        adherentService.persist(adherent3);
        adherentService.persist(adherent4);
        System.out.println("Listing des adhérents");
        System.out.println(adherentService.findAll());
        System.out.println("Listing des adhérents par date d'inscription");
        System.out.println(adherentService.findAllOrderBy("dateSubscription","ASC"));
        adherentService.delete(adherent2.getId());
        adherentService.delete(adherent3.getId());
        adherentService.delete(adherent4.getId());
    }
}
