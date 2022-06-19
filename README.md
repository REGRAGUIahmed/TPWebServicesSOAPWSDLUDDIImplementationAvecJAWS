# TPWebServicesSOAPWSDLUDDIImplementationAvecJAWS
Dans ce TP on a crée un web service appelé "BanqueService" permet de faire une conversion simple Euro/Dh, avoir le compte d'un client à partir de son Id, ainsi que la lites des comptes disponibles.  
Pour déployer notre service on a crée un serveur "ServeurJaxWS":    
![image](https://user-images.githubusercontent.com/102111459/174474977-3c27591c-3ea2-44df-8fda-50abcb02e203.png)  
Pour afficher le wsdl de notre web service, il suffit de taper dans la barre d'adresse de votre navigateur l'adresse suivante : http://localhost:8686/BanqueWS?wsdl  
Vous obtenez un document XML resseble à celui-ci :  
![image](https://user-images.githubusercontent.com/102111459/174475231-eac6d92d-bf58-49e7-bbe9-c844981d14a7.png)  
Ce fichier n'est pas dédié aux êtres humains mais plutôt aux machines, ce fichier commence par "Definitions" c'est la racine dans cette partie on trouve "types" qui contient tous les méthodes de notre web service.  
L'autre partie intéressante est "portType" représentant l'interface de web service contenant les opérations avec des Input/Output  
Pour tester notre web service on utilise un outil s'appele "SoapUI" qui représente le standard des outils utilisés pour tester les web services  
L'interface d'acceuil de ce logiciel est la suivante:  
![image](https://user-images.githubusercontent.com/102111459/174475851-1c27b5cd-5a25-400d-b724-e0c42518859f.png)  
Dans l'anglet "New" on choisit "Vew SOAP Project"  
![image](https://user-images.githubusercontent.com/102111459/174475931-6d3fe041-25ed-4e7f-981e-105bc4ad06d9.png)  
Dans "initial WSDL" on met l'adresse de notre wsdl : http://localhost:8686/BanqueWS?wsdl, puis on appuie sur "OK  
SoapUI analyse le wsdl et vous affiche l'ensemble de méthodes:  
![image](https://user-images.githubusercontent.com/102111459/174476039-f3284229-4e8f-4954-bc61-21a4d56759b0.png)  
Pour tester par exemeple la méthode "ConversionEuroToDH" on clique là-dessus deux fois, la fenêtre suivante:  
![image](https://user-images.githubusercontent.com/102111459/174476139-b74a7797-0529-4175-8f65-06f591d2f2e4.png)  
On tape le montant et on clique sur envoyer (fléche verte haut à gauche):  
![image](https://user-images.githubusercontent.com/102111459/174476223-b8ecbce1-635f-408d-9d69-2ab36b9b44d4.png)  
L'étape suivante c'est crée un client java : "ClientWS" pour consommer notre web service, de ce fait on va créer un autre projet Java ...  
(Voir le repositorie ClientWS)







