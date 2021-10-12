## TPJPA PARTIE 1

#### Nous avons essayé de répondre aux différentes questions

3) Les entites ont été générés par l'outil eclipse Create Entities From Tables. 
Les EJB Singleton sont les classes ListEmployeOnStartUp et ListProduitOnStartUp du package <b>ept.dic2.tpjpa.utils</b>

![Alt text](ressources/listing.png?raw=true "Listing des Employes")


4) Nous avons créé la super classe Personne avec l'annotation <b>@MappedSuperclass</b> et dont Employe et Client héritent par la suite. Elle se trouce dans le package <b>ept.dic2.tpjpa.vente.entities</b>

![Alt text](ressources/personne.png?raw=true "Classe Personne")

5) Nous avons créé la class <b>Adresse</b> avec l'annotation <b>@Embeddable</b> qui contient les champs suivants:
- adresse
- codeZip
- etat
- ville

![Alt text](ressources/embeddable.png?raw=true "Adresse avec l'annotation Embeddable")

Cette class est par la suite imbriquée dans les classes Client et Magasin comme le montre l'image suivante:

![Alt text](ressources/embedded.png?raw=true "Adresse immbriquée dans Client")
