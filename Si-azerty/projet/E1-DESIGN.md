# Architecture globale
>L’architecture de notre système est formée :
>D'une IHM faite en Angular permettant à l’utilisateur de consulter la liste des vols, réserver des billets et de voir ses réservations. 
>Une API en SpringBoot permetant d'interagir avec les données.
>nous avons opté pour un modèle MVC 

```mermaid
graph LR;
    A[MODEL] --> B[VIEW]
    C[CONTROLLER] --> A[MODEL]
    C[CONTROLLER] --> B[VIEW]
    B[VIEW] --> C[CONTROLLER]    
```

# Modèle de données

Afin de développer l'API, nous avons décidé d'utiliser l'environement SpringBoot. 
SpringBoot est un framework open source pour construire et définir l'infrastructure d'une application Java.

 ![image](https://github.com/palpatoune/tp-architecture/blob/SI-azerty/images/Architecture.png)


 ![image](https://github.com/palpatoune/tp-architecture/blob/SI-azerty/Si-azerty/projet/Diagramme%20de%20classe.png)


# Stack technique
### Applications et data

 - JavaScript
 - Java
 - Angular
 - SpringBoot
