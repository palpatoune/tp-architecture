# TP Architecture Distribué

Ce TP fonctionne par groupe de 4 ou 5.
Nous allons réalisé une solution, ultra simplifié de reservation de billet d'avion.
Nous gérons 3 aéroports:
- New York qui porte le code JFK
- CDG Paris qui porte le code CDG
- Detroit qui porte le code DTW

Tout les jours, des billets d'avions sont disponible.
Un billet d'avion est consituté:
- D'un code depart
- D'un code destination
- D'un prix (en Euros)

__CDG-JFK 400__ represente donc un billet d'avion au départ de Paris et à destination de New York à 400 euros.

## Etape 0

- Forker ce [repository](https://github.com/ESIEA-Distributed-Architecture/tp-architecture)
- Ajouter les membres de votre groupe a ce repository pour les besoins de commit
- Créer une branche qui porte le nom de la façon constituer de la façon suivante: {majeur-du-chef-promo}-{nom-de-votre-groupe}
- __Créer un dossier qui porte le même nom, tout ce que vous allez créer, devra se trouver dans ce dossier.__
- Creer le fichier MEMBERS.md, a l'interieur de ce fichier, rentrer le prénom et nom de chacune des personnes de votre groupe
- Votre projet devra se trouver dans le dossier ```projet```
- Faites une Pull Request entre votre branche ```{code-promo}-{nom-de-votre-groupe}``` et la branche ```main``` de ce [repository](https://github.com/ESIEA-Distributed-Architecture/tp-architecture)

## Etape 1

Designer ce systeme de reservation de billet d'avion.

La solution doit permettre:
- de permettre à un utilisateur de voir la liste des voles disponible
- de reservations des billets d'avion 
- de voir ce qu'il a reservé

Vous présenterez votre design à tous, vous êtes attendu sur:
- L'architecture globale
- Le modele de donnée stocké
- La stack technique

Votre deisgn devra se trouver dans le fichier ```projet/E1-DESIGN.md```

## Etape 2

Implémentez votre solution, votre code devra se trouver dans le dossier ```project/code```
Lorsque vous avez terminé, venez me voir pour la suite...

## Etpae 3

Surprise !
