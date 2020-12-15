# Mise en route du projet

Pour mettre en route le projet localement, il est nécessaire d'avoir les prérequis suivants :
- Node.JS
- Angular
- NPM
- Angular Material

## Description des prérequis
Angular est le framework utilisé pour la partie front-end. Node.JS et npm permettent d'installer Angular. Finalement, Angular Material est un module pour Angular permettant d'incorporer les règles de Material Design de Google.

## Installation des prérequis
Cette partie expliquera comment installer les principaux prérequis pour exécuter le programme.

### Installation de Node.JS
Nous devons commencer par l'installation de Node.JS. Nous pouvons récupérer le fichier exécutable à cette adresse : [Node.JS installers](https://nodejs.org/en/about/releases/ "Node.JS installers")
Il est recommandé d'utiliser la version LTS, elle est en effet plus stable.
L'installeur de Node.JS devrait installer npm par la même occasion. npm est un gestionnaire de paquets pour Node.JS.
Une fois l'installation finie, il est possible d'ouvrir un terminal (ou une invite de commandes) et de taper la commande suivante : `npm -v`
Le résultat devrait être similaire à ceci :
![Version de npm](https://i.imgur.com/eYrNFSR.png)

### Installation d'Angular
Une fois que nous avons installé Node.JS et vérifié que npm est bien présent, nous pouvons passer à l'installation d'Angular.
Pour ce faire, rien de plus simple. Dans un terminal (ou une invite de commandes), nous avons juste à entrer cette commande :
`npm install -g @angular/cli`

Pour vérifier que l'installation s'est bien déroulée, nous pouvons taper cette commande dans un terminal (ou une invite de commandes) : `ng version`
Si tout va bien, la sortie devrait ressembler à ceci :
![Version d'Angular](https://i.imgur.com/NM1QwFa.png)

### Installation d'Angular Material

Cette partie va permettre de détailler l'installation du module Angular Material. Une fois que nous avons Angular d'installé, nous pouvons entrer cette commande dans un terminal (ou une invite de commandes): `ng add @angular/material`.
Angular nous demandera quelques questions comme le thème de couleurs par défaut :
![enter image description here](https://i.imgur.com/OYG36bX.png)
Cette commande doit être effectuée au sein d'un projet Angular. 

## Lancement du projet

Lorsque toutes les dépendances sont installées, nous pouvons lancer le projet. Nous devons naviguer dans le répertoire où se trouve notre projet Angular et d'ouvrir un terminal (ou une invite de commandes) et d'entrer la commande suivante : `ng serve`. Cette commande lancera l'application WEB et nous pourrons naviguer avec un navigateur WEB sur la page lancée par le mini-serveur.
Voici à quoi ressemble la page de base :
![ng serve](https://i.imgur.com/92iG053.png)
![page d'accueil](https://i.imgur.com/OC5X0du.png)
