create table elus
(
	id int auto_increment,
	nom_et_prenom text null,
	mission text null,
	groupe text null,
	h_f text null,
	indemnite int null,
	constraint elus_id_uindex
		unique (id)
);

alter table elus
	add primary key (id)
;

INSERT INTO elus (nom_et_prenom,mission, groupe,h_f,indemnite)
VALUES
       ('ACHIBA Salim','Conseiller métropolitain','MCU','H',1089.03),
       ('AUGER Marie-Françoise','Conseiller métropolitain','GIDEC','F',1089.03),
       ('BAILLOT Frédéric','Conseiller métropolitain','SRCP','H',1089.03),
       ('BALY Stéphane','Conseiller métropolitain','EUROPE ECOLOGIE-LES VERTS','H',1089.03),
       ('CAUCHE Régis','Conseiller métropolitain délégué','GIDEC','H',1312.67),
       ('DALEUX Lise','Conseiller métropolitain','EUROPE ECOLOGIE-LES VERTS','F',1089.03),
       ('DEBREU Bernard','Vice-President métropolitain','CRC','H',1769.68),
       ('DELEPAUL Michel','Conseiller métropolitain délégué','MPC','H',1312.67),
       ('DELRUE Francis','Vice-President métropolitain','GIDEC','H',1769.68),
       ('DENOEUD Eric','Conseiller métropolitain','MCU','H',1089.03),
       ('DE SAINTIGNON Pierre','Conseiller métropolitain','SRCP','H',1089.03),
       ('DETERPIGNY Nicolas','Conseiller métropolitain','MPC','H',1089.03),
       ('DHALLUIN Benoit','Conseiller métropolitain','MPC','H',1089.03),
       ('DUQUENNE Aimé','Conseiller métropolitain','MPC','H',1089.03),
       ('FABER Vinciane','Conseiller métropolitain','EUROPE ECOLOGIE-LES VERTS','F',1089.03),
       ('FREMAUX Jean Louis','Conseiller métropolitain délégué','SRCP','H',1312.67),
       ('GAUTIER Antony','Conseiller métropolitain','SRCP','H',1089.03),
       ('GEENENS Patrick','Vice-President métropolitain','SRCP','H',1769.68),
       ('HANNA Walid','Conseiller métropolitain','SRCP','H',1089.03),
       ('HAYART Daniel','Conseiller métropolitain','SRCP','H',1089.03),
       ('HUTCHINSON Yvan','Conseiller métropolitain','MPC','H',1089.03),
       ('LEFEBVRE Joseph','Conseiller métropolitain','NON INSCRITS','H',1089.03),
       ('MASSON Jean-Gabriel','Conseiller métropolitain','MPC','H',1089.03),
       ('MINARD Frédéric','Conseiller métropolitain','MCU','H',1089.03),
       ('OYEZ Emmanuel','Conseiller métropolitain','MCU','H',1089.03),
       ('PAU André','Conseiller métropolitain','MPC','H',1089.03),
       ('PLANCKE Ghislain','Conseiller métropolitain','GIDEC','H',1089.03),
       ('PLOUY Michel','Conseiller métropolitain','GIDEC','H',1089.03),
       ('RINGOTTE Marie Christine','Conseiller métropolitain','SRCP','F',1089.03),
       ('SEELS Frederique','Vice-President métropolitain','MPC','F',1769.68),
       ('SOINNE Caroline','Conseiller métropolitain','MPC','F',1089.03),
       ('TONNERRE Marie','Conseiller métropolitain','MCU','F',1089.03),
       ('VERDONCK Sylvane','Conseiller métropolitain','MPC','F',1089.03),
       ('VEROONE Jean-Jacques','Conseiller métropolitain','GIDEC','H',1089.03),
       ('WOLFCARIUS Loïc','Conseiller métropolitain','MPC','H',1089.03),
       ('ALA Milouda','Conseiller métropolitain','MCU','F',1089.03),
       ('BORREWATER Michel','Conseiller métropolitain','MPC','H',1089.03),
       ('CAMBIEN Alain','Conseiller métropolitain délégué','MPC','H',1312.67),
       ('CATTELIN DENU Eric','Conseiller métropolitain','NON INSCRITS','H',1089.03),
       ('COLIN Michel','Vice-President métropolitain','MPC','H',1769.68),
       ('CORBILLON Matthieu','Conseiller métropolitain délégué','MPC','H',1312.67),
       ('CREPEL Jérémie','Conseiller métropolitain','EUROPE ECOLOGIE-LES VERTS','H',1089.03),
       ('DARMANIN Gérald','Vice-President métropolitain','MCU','H',0.0),
       ('DELANNOY Michel François','Conseiller métropolitain','SRCP','H',1089.03),
       ('DESPLANQUES Gauthier','Conseiller métropolitain','MPC','H',1089.03),
       ('DURAND Eric','Conseiller métropolitain','MCU','H',1089.03),
       ('GABRELLE René','Conseiller métropolitain','CRC','H',1089.03),
       ('GADAUT Henri','Conseiller métropolitain','SRCP','H',1089.03),
       ('GERARD Bernard','Vice-President métropolitain','GIDEC','H',1769.68),
       ('GONCE-SOLLAERS Alain','Conseiller métropolitain','MPC','H',1089.03),
       ('HIBON André','Conseiller métropolitain','MPC','H',1089.03),
       ('JACOB Jean Gabriel','Conseiller métropolitain délégué','MPC','H',1312.67),
       ('JEGOU Claude','Conseiller métropolitain','MPC','H',1089.03),
       ('KINGET François','Conseiller métropolitain','MCU','H',1089.03),
       ('LANNOO Vincent','Conseiller métropolitain','SRCP','H',1089.03),
       ('LEBAS Nicolas','Conseiller métropolitain','MPC','H',1089.03),
       ('LEDOUX Vincent','Conseiller métropolitain','MCU','H',1089.03),
       ('LEGRAND Jean François','Conseiller métropolitain délégué','MPC','H',1312.67),
       ('LIENART Christophe','Conseiller métropolitain','GIDEC','H',1089.03),
       ('MANIER Didier','Conseiller métropolitain','SRCP','H',1089.03),
       ('MARCHAND Frédéric','Conseiller métropolitain','NON INSCRITS','H',1089.03),
       ('MEZOUANE Nabella','Conseiller métropolitain','MCU','F',1089.03),
       ('MOENECLAEY Hélène','Vice-President métropolitain','MPC','F',1769.68),
       ('MONTOIS Jacques','Conseiller métropolitain','MPC','H',1089.03),
       ('PASTOUR Jacques','Conseiller métropolitain','GIDEC','H',1089.03),
       ('PAUCHET Thierry','Conseiller métropolitain','MCU','H',1089.03),
       ('PIERRE  Dominique','Conseiller métropolitain','SRCP','F',1089.03),
       ('PINCEDE Marie-Thérèse','Conseiller métropolitain','MPC','F',1089.03),
       ('RENARD André','Conseiller métropolitain','MPC','H',1089.03),
       ('ROLLAND  Thierry','Conseiller métropolitain','MPC','H',1089.03),
       ('AUBRY Martine','Vice-President métropolitain','SRCP','F',1769.68),
       ('BECUE Doriane','Conseiller métropolitain','MCU','F',1089.03),
       ('BEZIRARD Alain','Vice-President métropolitain','MPC','H',1769.68),
       ('CASIER Carole','Conseiller métropolitain','SRCP','F',1089.03),
       ('CAUDRON Gérard','Vice-President métropolitain','RC','H',1769.68),
       ('CHANTELOUP Fabienne','Conseiller métropolitain','MCU','F',1089.03),
       ('COOLZAET Françoise','Conseiller métropolitain','LILLE METROPOLE BLEU MARINE','F',1089.03),
       ('COSTEUR Sébastien','Conseiller métropolitain','RC','H',1089.03),
       ('DASSONVILLE Gustave','Conseiller métropolitain délégué','MCU','H',1312.67),
       ('DEBOOSERE Eglantine','Conseiller métropolitain','MCU','F',1089.03),
       ('DESCHAMPS Guy','Conseiller métropolitain','MPC','H',1089.03),
       ('DETOURNAY Alain','Vice-President métropolitain','GIDEC','H',1769.68),
       ('DUBOIS André','Conseiller métropolitain','MPC','H',1089.03),
       ('DUBUISSON René','Conseiller métropolitain','GIDEC','H',1089.03),
       ('DUCRET Stéphanie','Conseiller métropolitain délégué','GIDEC','F',1312.67),
       ('ELEGEEST Rudy','Conseiller métropolitain','APM','H',1089.03),
       ('ELLART Didier','Conseiller métropolitain','GIDEC','H',1089.03),
       ('GOUBE Françoise','Conseiller métropolitain','GIDEC','F',1089.03),
       ('HERBAUT Daniel','Conseiller métropolitain','MPC','H',1089.03),
       ('HUGOO David','Conseiller métropolitain','MCU','H',1089.03),
       ('JANSSENS Daniel','Vice-President métropolitain','MPC','H',1769.68),
       ('JEANNE Gaëtan','Conseiller métropolitain','MPC','H',1089.03),
       ('KHITER Kamel','Conseiller métropolitain','SRCP','H',1089.03),
       ('KRIEGER Christiane','Conseiller métropolitain','GIDEC','F',1089.03),
       ('LECLERCQ Alain','Conseiller métropolitain','MPC','H',1089.03),
       ('LEFEBVRE Catherine','Conseiller métropolitain','MPC','F',1089.03),
       ('LEFEBVRE Yves','Conseiller métropolitain','MPC','H',1089.03),
       ('MASSE Marie Elisabeth','Conseiller métropolitain','MPC','F',1089.03),
       ('MULLIER Béatrice','Conseiller métropolitain','SRCP','F',1089.03),
       ('OURAL Akim','Conseiller métropolitain délégué','SRCP','H',1312.67),
       ('PACAUX Christophe','Conseiller métropolitain','APM','H',1089.03),
       ('PARGNEAUX Gilles','Conseiller métropolitain délégué','NON INSCRITS','H',0.0),
       ('PICAULT Dominique','Conseiller métropolitain','SRCP','F',1089.03),
       ('REIFFERS Zohra','Conseiller métropolitain','SRCP','F',1089.03),
       ('RICHIR Jacques','Conseiller métropolitain','SRCP','H',1089.03),
       ('ROCHER Sophie','Conseiller métropolitain','GIDEC','F',1089.03),
       ('ROUSSEAU Anita','Conseiller métropolitain','MPC','F',1089.03),
       ('SOUBRIER Anne Marie','Conseiller métropolitain','MPC','F',1089.03),
       ('STANIEC Marie-Christine','Conseiller métropolitain','SRCP','F',1089.03),
       ('VANNIER Caroline','Conseiller métropolitain','MCU','F',1089.03),
       ('VUYLSTEKER Jean-Marie','Conseiller métropolitain','MCU','H',1089.03),
       ('BACLE Véronique','Conseiller métropolitain','SRCP','F',1089.03),
       ('BAERT Dominique','Conseiller métropolitain','SRCP','H',1089.03),
       ('BARISEAU Florence','Conseiller métropolitain','MCU','F',1089.03),
       ('BARRET Philippe','Conseiller métropolitain délégué','GIDEC','H',1312.67),
       ('BOCQUET Eric','Conseiller métropolitain','CRC','H',1089.03),
       ('BOUCHART Christiane','Vice-President métropolitain','EUROPE ECOLOGIE-LES VERTS','F',1769.68),
       ('BREHON Raphaël','Conseiller métropolitain','MPC','H',1089.03),
       ('CASTELAIN Damien','Président de la Métropole Européenne de Lille','MPC','H',5639.63),
       ('CHABANE Raghnia','Conseiller métropolitain','APM','F',1089.03),
       ('CINUS Roselyne','Conseiller métropolitain','RC','F',1089.03),
       ('COUSIN Yvon','Conseiller métropolitain','MPC','H',1089.03),
       ('CRESPEL Jean','Conseiller métropolitain','MPC','H',1089.03),
       ('DAUBRESSE Marc-Philippe','Conseiller métropolitain','GIDEC','H',1089.03),
       ('DELABY Bernard','Vice-President métropolitain','MPC','H',1769.68),
       ('DELEBARRE Jean','Conseiller métropolitain','MPC','H',1089.03),
       ('DENDOUGA Dalila','Conseiller métropolitain','SRCP','F',1089.03),
       ('GAUTIER  Marion','Conseiller métropolitain','SRCP','F',1089.03),
       ('GIRARD Maryvonne','Conseiller métropolitain','RC','F',1089.03),
       ('HAESEBROECK Bernard','Vice-President métropolitain','SRCP','H',1769.68),
       ('HOUSSIN Jacques','Conseiller métropolitain','GIDEC','H',1089.03),
       ('LEGRAND Jean-Pierre','Conseiller métropolitain','LILLE METROPOLE BLEU MARINE','H',1089.03),
       ('LEKIEN Danièle','Conseiller métropolitain','GIDEC','F',1089.03),
       ('LENFANT Henri','Conseiller métropolitain','MPC','H',1089.03),
       ('LHERBIER Brigitte','Conseiller métropolitain','MCU','F',1089.03),
       ('LINKENHELD Audrey','Conseiller métropolitain','SRCP','F',1089.03),
       ('L''KASSIMI Zina','Conseiller métropolitain','MPC','F',1089.03),
       ('MAHIEU Isabelle','Conseiller métropolitain','MCU','F',1089.03),
       ('MARIAGE Isabelle','Conseiller métropolitain','MCU','F',1089.03),
       ('MATHON Christian','Conseiller métropolitain','GIDEC','H',1089.03),
       ('PLOUVIER Françoise','Conseiller métropolitain','MPC','F',1089.03),
       ('PONCHAUX Danièle','Conseiller métropolitain','MPC','F',1089.03),
       ('SARTIAUX Claudine','Conseiller métropolitain','RC','F',1089.03),
       ('SIX Valérie','Conseiller métropolitain','MCU','F',1089.03),
       ('VALLIN David','Conseiller métropolitain','MPC','H',1089.03),
       ('VANBEUGHEN Pierre','Conseiller métropolitain','CRC','H',1089.03),
       ('VERCAMER Francis','Conseiller métropolitain','MPC','H',1089.03),
       ('VERPOORT Lydie','Conseiller métropolitain','MPC','F',1089.03),
       ('VOITURIEZ Anne','Vice-President métropolitain','MPC','F',1769.68),
       ('ACKERMANN Rodolphe','Conseiller métropolitain','NON INSCRITS','H',1089.03),
       ('AMBROZIEWICZ Jean Marc','Conseiller métropolitain','NON INSCRITS','H',1089.03),
       ('BERNARD Alain','Vice-President métropolitain','MPC','H',1769.68),
       ('BLONDEAU Alain','Conseiller métropolitain','MPC','H',1089.03),
       ('BOSSUT Francis','Conseiller métropolitain','APM','H',1089.03),
       ('BOUREL Daniel','Conseiller métropolitain','MPC','H',1089.03),
       ('BRUN Charlotte','Conseiller métropolitain','SRCP','F',1089.03),
       ('CANESSE Pierre','Conseiller métropolitain','GIDEC','H',1089.03),
       ('CAUDRON Christophe','Conseiller métropolitain','GIDEC','H',1089.03),
       ('COISNE Bernard','Conseiller métropolitain','MPC','H',1089.03),
       ('CONNELL Margaret','Conseiller métropolitain','MCU','F',1089.03),
       ('DELBAR Guillaume','Vice-President métropolitain','MCU','H',1769.68),
       ('DELEBARRE Patrick','Conseiller métropolitain délégué','MPC','H',1312.67),
       ('DILLIES Eric','Conseiller métropolitain','LILLE METROPOLE BLEU MARINE','H',1089.03),
       ('DUBOIS Pierre','Conseiller métropolitain','SRCP','H',1089.03),
       ('DUCROCQ Jacques','Conseiller métropolitain','MPC','H',1089.03),
       ('GODEFROY Marc','Conseiller métropolitain délégué','SRCP','H',1312.67),
       ('HALLYNCK Rose-Marie','Conseiller métropolitain','APM','F',1089.03),
       ('HOLVOOTE Philippe','Conseiller métropolitain','MPC','H',1089.03),
       ('IFRI Michel','Conseiller métropolitain','EUROPE ECOLOGIE-LES VERTS','H',1089.03),
       ('LEFEBVRE Claudie','Conseiller métropolitain','SRCP','F',1089.03),
       ('LEMAN Marie Agnès','Conseiller métropolitain','MPC','F',1089.03),
       ('LEPRETRE Sébastien','Vice-President métropolitain','MPC','H',1769.68),
       ('LEYS Annie','Conseiller métropolitain','MPC','F',1089.03),
       ('MOLLE Jean Michel','Conseiller métropolitain','RC','H',1089.03),
       ('MUNCH Jean-Louis','Conseiller métropolitain','GIDEC','H',1089.03),
       ('PAURON Eric','Conseiller métropolitain','MPC','H',1089.03),
       ('PICK Max André','Conseiller métropolitain','MCU','H',1089.03),
       ('PLUSS Alain','Conseiller métropolitain délégué','MPC','H',1312.67),
       ('QUESNE Valérie','Conseiller métropolitain','RC','F',1089.03),
       ('RODES Estelle','Conseiller métropolitain','SRCP','F',1089.03),
       ('SKYRONKA Eric','Conseiller métropolitain délégué','MPC','H',1312.67),
       ('VICOT Roger','Conseiller métropolitain','SRCP','H',1089.03),
       ('WANLIN Grégory','Conseiller métropolitain','MPC','H',1089.03),
       ('WAYMEL Philippe','Conseiller métropolitain','MPC','H',1089.03)
;
