## TPJPA PARTIE 1

#### Nous avons essay� de r�pondre aux diff�rentes questions

3) Les entites ont �t� g�n�r�s par l'outil eclipse Create Entities From Tables. 
Les EJB Singleton sont les classes ListEmployeOnStartUp et ListProduitOnStartUp du package <b>ept.dic2.tpjpa.utils</b>

![Alt text](ressources/listing.png?raw=true "Listing des Employes")


4) Nous avons cr�� la super classe Personne avec l'annotation <b>@MappedSuperclass</b> et dont Employe et Client h�ritent par la suite. Elle se trouce dans le package <b>ept.dic2.tpjpa.vente.entities</b>

![Alt text](ressources/personne.png?raw=true "Classe Personne")

5) Nous avons cr�� la class <b>Adresse</b> avec l'annotation <b>@Embeddable</b> qui contient les champs suivants:
- adresse
- codeZip
- etat
- ville

![Alt text](ressources/embeddable.png?raw=true "Adresse avec l'annotation Embeddable")

Cette class est par la suite imbriqu�e dans les classes Client et Magasin comme le montre l'image suivante:

![Alt text](ressources/embedded.png?raw=true "Adresse immbriqu�e dans Client")
