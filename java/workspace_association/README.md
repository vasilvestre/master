## Workspace association

### Objectifs 
* [ ] Installer un environnement J2EE et BDD
* [ ] Mise en place d'une architecture 3 tiers
* [ ] Mise en place d'hivernate et de JSTL via des JSP
* [ ] Application des principes de développement (javadoc, commentaires)

### Etapes
* Lancer docker-compose
`docker-compose up -d`

* Créer la bdd
```
CREATE TABLE adherent (
id int(10) NOT NULL auto_increment,firstName varchar(100) NOT NULL,lastName
varchar(100) NOT NULL,dateSubscription varchar(10) NOT NULL,dateBirth varchar(10) NOT
NULL,email varchar(100) NOT NULL,hasPaid int(1),cooptation int(10),PRIMARY KEY (id));
```
* Insérer un objet
```
INSERT INTO `adherent` (`id`, `firstName`, `lastName`, `dateSubscription`, `dateBirth`, `email`,
`hasPaid`, `cooptation`) VALUES ('1', ‘Robert’, ‘Dupont’, '01/01/19', '20/03/10',
'test@gmail.com', '1', NULL);
```

### Todolist
* Couche DAO
    * [x] Configuration hibernate
    * [x] Création des DAO
* Couche tests = classe main
    * [x] Ajout d'un adhérent
    * [x] Modification d'un adhérent
    * [x] Suppression d'un adhérent
    * [x] Récupération de tous les adhérents
    * [x] Récupération de tous les adhérents triés selon leur date d'inscription
* Couche services
    * Créer un package Service avec
    * [x] L'ajout d'un adhérent
    * [x] La modification d'un adhérent
    * [x] La suppression d'un adhérent
    * [x] Lister tous les adhérents
* Couche présentation
    * [x] Une page d'accueil
    * [x] Une page d'inscription
    * [x] Une page pour lister tous les adhérents et pouvoir les trier selon leur date d’inscription dans l’ordre croissant et décroissant
    * [x] De la page précédente, on peut accéder à une page pour modifier un adhérent et pouvoir même le supprimer.
