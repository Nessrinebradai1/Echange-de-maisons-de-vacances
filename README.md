# Echange de maisons de vacances
```
Université de la Manouba
Ecole Nationale Des Sciences De L’Informatique
```
###### RAPPORT

##### De Projet De Conception et De Développement

```
Elaboré par :
```
###### Ayech Manel

###### Bradai Nessrine

```
Sujet :
```
###### Conception et développement d’un site web dynamique pour

###### l’échange de maisons de vacances en ligne

```
Sous l’encadrement de :
```
###### Mme Hela Ben Othman

```
Année Universitaire :
```
###### 2013-


##### Résumé

Notre travail est proposé dans le cadre du projet de conception et de développement pour les
élèves ingénieurs de l’Ecole Nationale des Sciences de l’Informatique (ENSI).
Notre tache a pour objectif de programmer un site web nommé "Echange de maisons de
vacances en ligne".
Tout au long du projet, nous sommes amenés à découvrir le framework Java "JavaServer
Faces" et le framework open source "Hibernate", aussi de programmer les fonctions et
effectuer les tests nécessaires pour assurer le bon fonctionnement du site web.

```
i
```

##### Abstract

Our work is proposed in the project of design and development for engineering students of
the NSCS (National School for Computing Studies).
Our task was to program a website nomed "Exchanging holiday’s homes online".
Throughout the project, we had to discover the Java framework "JavaServer Faces" and the
open source framework "Hibernate", and program functions and make the necessary tests to
ensure the proper functioning of the website.

```
ii
```

### Remerciements

Nous adressons nos sincères remerciements à notre encadrante Mme Hela ben Othman
aussi bien pour sa collaboration ainsi que pour son assistance précieuse qui nous ont donné un
coup d’aide pour réaliser notre application convenablement.
Nous voudrons remercier également les personnes qui ont encouragé la réalisation de cette
recherche beaucoup en avance à sa réalisation.

```
iii
```

### Table des matières

RAPPORT De Projet De Conception et De Développement **iv**


### Table des figures

RAPPORT De Projet De Conception et De Développement **v**


### Introduction Générale

## L

```
Egrand nombre des sites web ne peut jamais montrer que chaque idée ou approche lui
associée un site.
```
Ainsi nous trouvons des sites web qui prennent tous le même sujet d’intérêt. En contrepar-
tie, nous trouvons qu’il y a des sujets assez intéressants et pourtant ne possédant aucun site
web.
Cela peut être expliqué par le fait que, à part les sites des réseaux sociaux, la majorité qui
reste est orienté à la commercialisation des produits et aux annonces publicitaires et la mise
en service de secteur commercial, citons par exemple les sites de vente en ligne et les sites de
location en ligne.

Pour cette raison nous choisissons de développer un site un peu particulier mais qui a une
valeur ajoutée assez importante pour ceux qui veulent l’accéder.

Notre site est ni un site de rencontre ni un site commercial, c’est un site d’échange de
bien. L’idée de ce site vient pour remédier quelques problèmes rencontrés par les touristes
qui veulent passer leurs vacances dans des bonnes conditions.

Donc nous pensons à chercher une solution pour leur problème majeur qui est le problème
de résidence. Donc pour atteindre ce but nous essayons de donner à nos clients la meilleure
solution qui peut exister. Nous choisissons une solution qui se caractérise par la simplicité et
l’efficacité.

Et enfin nous aboutissons à la réalisation de ce site qui donne à chaque client l’occasion de
bénéficier de bonnes vacances dans les meilleures conditions.


```
Introduction Générale
```
Nous sommes en face d’une nouvelle approche et d’un nouveau concept.
Nous essayons de défendre notre idée et de faire le maximum pour prouver son importance en
proposant ce site qui devra présenter un moyen efficace pour garantir des bonnes moments de
vacances.


#### Chapitre 1

### Présentation du projet

###### Introduction

## D

Enos jours, l’accès de l’être humain à l’internet devient de plus en plus important, il est
facile maintenant de bénéficier de beaucoup de services offerts en lignes.
Pour notre projet, nous proposons de réaliser une application web dynamique qui offre des
services diversifiés à ses clients.
Ainsi, notre application est dédiée aux gens intéressés par les voyages, elle sert à résoudre un
problème rencontré par beaucoup de personnes.
Dans ce chapitre introductif, nous mettons l’application dans son cadre général et donnons
l’utilité de son utilisation sur tous les plans.

###### 1.1 Cadre du projet

Ce projet intitulé "Développement d’une application web dynamique pour l’échange de
maisons de vacances en ligne" s’inscrit dans le cadre du projet de conception et de développe-
ment durant la 2ème année cycle d’ingénieur en informatique au sein de l’école nationale des
sciences de l’informatique.
Le travail est réalisé tout au long du 2ème semestre de l’année universitaire 2013/2014.
Une telle application peut être exploitée dans le but d’améliorer le secteur touristique dans
n’importe quel pays.


```
CHAPITRE 1. PRÉSENTATION DU PROJET
```
Prenons par exemple de la Tunisie, cette application permet aux touristes d’accéder aux
villes touristiques tout en garantissant une bonne résidence malgré le manque d’hôtels dans
certains endroits, également pour les tunisiens qui veulent passer leurs vacances dans des mai-
sons en dépensant moins.
Cette application peut présenter une solution pour garantir la satisfaction de beaucoup de be-
soins.
Loin de son cadre touristique, nous voulons montrer l’importance de notre application sur le
plan culturel. En effet, en cas d’échange de maisons, nous assurons l’échange des traditions.
Chaque famille peut s’inspirer de la culture de l’autre à partir de l’architecture de la maison, la
décoration, l’environnement...

###### 1.2 Présentation générale du projet

A une époque où la vie humaine est gouvernée par les intérêts économiques et les contraintes
sociales, nous avons tous besoin de moments de loisirs et de plaisirs d’où vient l’importance
des vacances.
Dans ce contexte, nombreuses sont les personnes qui donnent une grande importance aux va-
cances dans le sens où elles commencent à faire leur planning avant des mois, et à partir de ce
moment, nous nous posons des questions variées comme par exemple : Où vais-je passer mes
vacances? En compagnie de qui? Quelle ville je vais visiter cette année? Quelle est le budget à
réserver pendant les vacances? Mais la question la plus obsédante est : Est-il facile de trouver
un endroit dans lequel je dispose de conditions favorables et où je puisse passer de bonnes
vacances.
Ainsi, notre application se situe dans ce cadre. Elle consiste à créer une idée facilitant la prépara-
tion aux vacances. Il s’agit en fait de développer un site web dynamique à travers lequel chaque
personne est censée déposer son offre et chercher l’offre qui lui convienne et qui s’adapte à ses
besoins personnels.

###### 1.3 Problématique

L’utilisation de cette application est basée sur l’échange de maisons, donc l’application doit
contenir un espace pour déposer l’offre de la maison a échanger et un espace pour citer les
caractéristiques de la maison voulue.


```
CHAPITRE 1. PRÉSENTATION DU PROJET
```
Donc pour déposer l’offre, un utilisateur est invité à mentionner des informations concernant
sa maison, ces caractéristiques doivent être bien spécifiées pour convaincre les autres à échan-
ger avec lui leur maison et cela va lui donner plus de chance pour trouver la meilleure maison
qui s’adapte à ses besoins.
Parmi les caractéristiques les plus importantes on trouve : les dates de disponibilité de la mai-
son , les caractéristiques de cette dernière. Citons par exemple le type de maison : maison avec
jardin , maison sans jardin , appartement, nombre de chambres disponibles, la nature de son
emplacement :il peut être dans une campagne , prés d’une montagne , dans une zone touris-
tique , dans une zone saharienne...
Tout ça doit être mentionné et avec précision pour aider les autres à trouver le bon choix et
pour satisfaire tous les besoins que ce soit pour ceux qui cherchent les ambiances de Sahara et
de tourisme saharien ou bien ceux qui veulent passer leurs vacances dans une zone touristique
ou à la plage ou bien ceux qui cherchent le calme et la nature donc ils trouvent les campagnes
comme un bon choix pour passer de bons moments.

Un dépôt d’offre doit être obligatoirement accompagné par un dépôt de besoins pour bien
garantir les conditions d’échange.
Donc un espace est réservé pour le dépôt du besoin, il nous permet de donner les caractéris-
tiques de la maison qu’on cherche.
Pour des raisons de clarté et pour faciliter la tâche de recherche, une telle comparaison se fait
entre les besoins et les offres des tous les clients pour dégager toutes les correspondances pos-
sibles.
Pour cela, il est aussi important de mentionner les caractéristiques les plus intéressantes de la
maison voulue et le pays ou bien le gouvernorat dans lequel on cherche à passer ses vacances.

###### 1.4 Objectifs

Plus généralement, et en regardant l’importance de l’application du coté économique, nous
trouvons qu’elle résout un problème très important, qu’est celui de la capacité matérielle.
Il est clair que nous sommes maintenant dans une crise économique et le fait de passer les
vacances, surtout dans un pays étranger devient de plus en plus difficile et de plus en plus
couteux.


```
CHAPITRE 1. PRÉSENTATION DU PROJET
```
Ainsi, le fait de garantir un lieu de résidence bien équipé sans payer d’argent est un grand
bénéfice, surtout si vous arrivez a une situation où les deux parties de l’échange sont satisfaits
d’une coté par la maison et de l’autre par l’endroit. Garantissant, ainsi, un partenaire avec
lequel vous pouvez échanger votre maison à l’avenir.
Ceci peut, donc, pousser beaucoup de personnes à réfléchir à cette solution, cela peut résoudre
certains problèmes dans le secteur touristique et économique au sein de beaucoup de pays dans
le monde.
Nous assurons, en même temps, la diversité du produit touristique avec le moindre prix et le
développement de plusieurs domaines.
La sécurité, la simplicité ainsi que la facilité d’utilisation sont les critères les plus importants
qui sont garantis par notre application, en effet, une simple procédure d’inscription est le seul
moyen d’accès à cet espace. L’accès d’un client à l’application n’est pas obligatoirement pour
déposer une demande, il peut être juste pour la consultation ou bien pour la modification de
quelques données.
L’efficacité reste le but le plus important pour nous, développeurs de cette application, que
nous essayons d’assurer pour donner de l’importance à cette application.

###### Conclusion

Dans ce chapitre, nous avons donné une idée claire en ce qui concerne l’application qui est
détaillée. Dans le chapitre suivant dans lequel nous présentons l’analyse et la spécification des
besoins fonctionnels et non fonctionnels.


#### Chapitre 2

### Spécification des besoins

###### Introduction

# D

Évelopper une application commence toujours par l’évaluation des contraintes qu’il
est préfèrable de fixer avant d’entamer un projet.
Ce chapitre détaille donc les besoins fonctionnels qui spécifient le comportement
entrée/sortie du système, les besoins non fonctionnels du développement de notre application
"Développement d’une application web dynamique pour l’échange de maisons de vacances en
ligne".

###### 2.1 Les acteurs

```
Les acteurs qui participent à notre application sont les suivants :
```
- Client : Cet acteur est concerné par les services de notre site tel qu’il peut :
–– D’une part s’authentifier afin de déposer son offre ou de faire les mises à jour nécessaires
des données de son offre, saisir ses critères pour consulter les offres existantes et postuler
pour celles qui lui conviennent.
- D’autre part s’authentifier afin de confirmer son choix qui exprime l’échange de maisons
de vacances avec succés.


```
CHAPITRE 2. SPÉCIFICATION DES BESOINS
```
- Administrateur : Cet acteur a la possibilité de contrôler les échanges de maisons de
vacances effectués entre les clients pour faire les mises à jour nécessaires des données de
notre site.

###### 2.2 Les besoins fonctionels

```
Les besoins fonctionnels sont les suivants :
```
- Le système doit présenter, au début, une interface qui se divise en deux parties princi-
pales :

```
––– Une première partie qui présente l’espace client pour s’inscrire afin qu’il puisse profiter
des services offerts par le site et/ou s’authentifier pour accéder à son compte afin de dé-
poser son offre et postuler pour celles qui lui conviennent.
```
- Une autre partie qui présente l’espace privé de l’administrateur pour gérer les mises à
    jour nécessaires du site et contrôler les échanges de maisons effectués par les clients.
    - Le système doit fournir aux clients une interface qui leur permette d’indiquer les diffé-
    rentes conditions nécessaires pour leur inscription.
    - Le système doit fournir aux clients une interface qui leur permette d’indiquer les diffé-
    rentes conditions nécessaires pour leur authentifiacation et qui leur permette de passer à
    une autre interface pour qu’ils puissent déposer leur offre.
    - Le système doit fournir aux clients une interface qui contienne les champs nécessaires
    pour qu’ils puissent déposer leur offre avec la possibilité d’enregistrement, de modifica-
    tion et/ou de suppression de leur demande, ainsi de leur permette de saisir les critéres
    qui satisfont leur offre.
    - Le système doit fournir aux clients une interface qui leur permette de consulter les offres.


```
CHAPITRE 2. SPÉCIFICATION DES BESOINS
```
- Le système doit fournir aux clients une interface qui présente toutes les offres existantes
dans notre site afin que ces derniers puissent choisir l’offre convenable.
- Le système doit fournir aux clients la possibilité de postuler aux offres qui leur conviennent.
- Le systéme doit fournir aux clients la possibilité d’accéder aux différntes demandes re-
çues pour confirmer leur choix d’échange de maisons de vacances avec les autres clients.

###### 2.3 Les besoins non fonctionels

```
Les besoins non fonctionnels sont les suivants :
```
```
–––––––– Le système doit assurer à l’utilisateur une interface graphique conviviale facile à utiliser
et de bonne qualité.
```
- Le système doit assurer la facilité d’utilisation et de consultation des informations offertes
    par l’application.
- Le système doit assurer la rapidité de la réponse fournie suite aux requêtes lancées par
    l’utilisateur de l’application.
- Le système doit assurer une bonne décomposition modulaire permettant de faciliter l’ajout
    de nouvelles fonctionnalités au niveau de notre application.
- Le systéme doit afficher les possibilités de déplacement d’une interface à une autre.
- Le systéme doit assurer que notre application soit réutilisable en tout ou en partie dans
    l’élaboration de nouvelles applications.


```
CHAPITRE 2. SPÉCIFICATION DES BESOINS
```
- Le systéme doit assurer les contrôles d’accés necéssaires afin de réaliser une application
    efficace.
- Le systéme doit assurer la possibilité aux clients de consulter les offres existantes dans le
    site à partir n’importe quelle interface du site.

###### 2.4 Diagramme de Cas d’utilisations

```
Le diagramme de Cas d’utilisations correspondant à l’acteur "Client" est définit ci dessous :
```
```
FIGURE2.1 – Diagramme de Cas D’utilisations du "Client"
```

```
CHAPITRE 2. SPÉCIFICATION DES BESOINS
```
Le diagramme de Cas d’utilisations correspondant à l’acteur "Administrateur" est définit ci
dessous :

```
FIGURE2.2 – Diagramme de Cas D’utilisations de "l’Administrateur"
```
###### 2.5 Diagramme de Séquences

Le diagramme de Séquences correspondant au sénario "déposer une offre" est défini ci des-
sous :

```
FIGURE2.3 – Diagramme de Séquences du Cas d’Utilistation "déposer une offre"
```

```
CHAPITRE 2. SPÉCIFICATION DES BESOINS
```
Le diagramme de Séquences correspondant au sénario "Postuler à une offre" est défini ci
dessous :

```
FIGURE2.4 – Diagramme de Séquences du Cas d’Utilistation "Postuler à une offre"
```
###### Conclusion

La fixation des contraintes et des besoins du projet ont été importantes dans la réalisation
du projet, et nous ont permi d’avoir un plan clair à suivre, même si nous avons dû adapter
quelques détails lors de la réalisation du projet.


#### Chapitre 3

### Conception

###### Introduction

Après avoir détaillé les besoins fonctionnels et non fonctionnels de notre projet, nous consa-
crons ce chapitre à la partie conception.
Nous présentons dans un premier lieu l’architecture adoptée pour concevoir notre application
puis nous donnons une description détaillée des différents diagrammes utilisés.

###### 3.1 Conception globale

Parmi les architectures de conception, nous trouvons que l’architecture MVC est la plus
adéquate avec la nature de notre projet.
Donc l’architecture Modèle-Vue-Contrôle abrégé en MVC est une architecture qui nous permet
de bien organiser notre code source en séparant la logique de code en trois parties qui sont : le
modèle , la vue et le contrôle.

```
Ci-dessous une description détaillée de chaque partie :
```
- Le modèle
    Le modèle représente le comportement de l’application : traitements des données, inter-
    actions avec la base de données, etc. Il assure la gestion de ces données et garantit leur
    intégrité. Dans le cas typique d’une base de données, c’est le modèle qui la contient. Le
    modèle offre des méthodes pour mettre à jour ces données (insertion, suppression, chan-
    gement de valeur).


```
CHAPITRE 3. CONCEPTION
```
```
Il offre aussi des méthodes pour récupérer ces données. Les résultats renvoyés par le
modèle sont dénués de toute présentation.
```
- La vue
    Sa première tâche est de présenter les résultats renvoyés par le contrôleur. Sa seconde
    tâche est de recevoir toutes les actions de l’utilisateur (clic de souris, sélection d’une en-
    trée, boutons...). Ces différents événements sont envoyés au contrôleur. La vue n’effectue
    aucun traitement, elle se contente d’afficher les résultats des traitements. Bref, c’est géné-
    ralement du contenu HTML.
- Le contrôle
    Le contrôleur prend en charge la gestion des événements de synchronisation pour mettre
    à jour la vue et la base de données. Il reçoit tous les événements de l’utilisateur et en-
    clenche les actions à effectuer. Si une action nécessite un changement des données, le
    contrôleur demande la modification des données au modèle ou dans notre cas, fait direc-
    tement la modification des données et ensuite avertit la vue que les données ont changé
    pour qu’elle se mette à jour. C’est dans les contrôleurs que la grande partie du dévelop-
    pement d’un site web se trouve.

###### 3.2 Conception détaillée

Après avoir présenté l’architecture de notre application, nous présentons maintenant le mo-
dèle des données convenable.
Dans un premier lieu nous donnons une description détaillée de la base des données utilisée et
les différentes relations entre ses tables.
Dans un deuxième lieu nous présentons le diagramme des classes, les diagrammes des sé-
quences et le diagramme de navigation correspondants.


```
CHAPITRE 3. CONCEPTION
```
**3.2.1 La vue**

```
Pour simplifier le fonctionnement du site nous donnons sa structure générale suivante :
```
```
FIGURE3.1 – Structure générale du site
```
**3.2.2 Le contrôleur**

**3.2.2.1 Diagramme de classes**

```
FIGURE3.2 – Diagramme de classes
```

```
CHAPITRE 3. CONCEPTION
```
**3.2.2.2 Diagramme de séquences**

- Diagramme de séquence de s’authentifier

```
FIGURE3.3 – Diagramme de séquence de s’authentifier
```
- Diagramme de séquence de déposer une offre

```
FIGURE3.4 – Diagramme de séquence de déposer une offre
```

```
CHAPITRE 3. CONCEPTION
```
- Diagramme de séquence de confirmer l’échange

```
FIGURE3.5 – Diagramme de séquence de confirmer l’échange
```
**3.2.3 Le modèle**

Le diagramme de classes partie modèle qui permettent l’accès à la base de données sont
présentés ci-dessous :

```
FIGURE3.6 – Diagramme de classes partie modèle
```

```
CHAPITRE 3. CONCEPTION
```
**3.2.4 Conception de la base de données**

Afin de garantir la conservation des données de notre site, nous utilisons une base des
données dans laquelle nous mettons toutes les informations utiles relatives aux clients et aux
offres.
Pour concevoir notre base, nous commençons par l’élaboration du schéma conceptuel par le
diagramme entités-associations.

**3.2.4.1 Modèle conceptuel des données**

Nous présentons le modèle conceptuel des données par le diagramme entité-association
ci-dessous

```
FIGURE3.7 – Diagramme rélationnel
```
- Relation client : elle renferme toutes les informations nécessaires pour identifier un client
- Relation offre : elle renferme toutes les détails relatives à un bien déposé par un client.
- Relation post : elle est relative à l’opération de postulation, grâce à cette table chaque
    client peut connaitre qui a postulé à son offre.
- Relation confirmation : cette relation est dédiée pour le stockage de tous les échanges
    effectués avec succès en conservant les noms de deux parties d’échanges.
- Relation administrateur : Contient les cordonnées de l’administrateur.


```
CHAPITRE 3. CONCEPTION
```
###### Conclusion

Dans cette partie, nous avons présenté l’architecture utilisée pour notre application, le dia-
gramme de classes et les diagrammes de séquences.
Nous proposons dans le chapitre suivant de décrire la réalisation de notre site web.


#### Chapitre 4

### Realisation

###### Introduction

## L

’objectif de ce chapitre est de décrire les langages utilisés afin de créer notre site d’une
part, et d’autre part de présenter ses différentes pages web qui peuvent étre accessibles
par nos clients.

###### 4.1 Langages et environnement de programmation

Afin de modéliser notre site, il faut savoir les outils et les besoins pour la développer.
En effet, nous avons utilisé la langage de programmation Java EE et nous avons dévellopés
notre site avec le framework Java "JavaServer Faces" abrégé en JSF, le framework open source
"Hibernate" qui gére la persistance des objets en base de données relationnelle, et nous avons
utilisé le conteneur web "Apache Tomcat v7.0", vue la possibilité de les bien maitriser d’une
part,et d’autre afin d’améliorer nos connaissances dans l’environnement de programmation.

###### 4.2 Les pages web de notre site

```
Dans cette partie, nous allons présenter les différentes pages web de notre site comme suit :
```

```
CHAPITRE 4. REALISATION
```
```
FIGURE4.1 – Page d’accueil
```
La figure4.1 illustre la première page web permettant de présenter le site ainsi que les dif-
férents onglets pour atteindre les offres proposées.

```
FIGURE4.2 – Page d’inscription
```
La figure4.2 illustre une page web qui permet au client de s’inscrire pour profiter des ser-
vices de notre site.


```
CHAPITRE 4. REALISATION
```
```
FIGURE4.3 – Page de succés de l’inscription
```
```
La figure4.3 illustre une page web qui confirme l’inscription du client avec succés.
```
```
FIGURE4.4 – Page d’échec d’inscription
```
La figure4.4 illustre une page web qui montre que les données saisies par le client sont
erronées.


```
CHAPITRE 4. REALISATION
```
```
FIGURE4.5 – Page d’authentification du client
```
La figure4.5 illustre une page web qui permet au client de s’authentifier, en entrant son
login et son mot de passe.

```
FIGURE4.6 – Espace privé du client
```
```
La figure4.6 illustre une page web qui permet d’afficher l’espace privé du client.
```

```
CHAPITRE 4. REALISATION
```
```
FIGURE4.7 – Page de depot
```
La figure4.7 illustre une page web qui permet à un client de déposer son offre en indiquant
le nom de l’offre, la nature de bien, les pièces disponibles, sa région, la nature de bien voulu, le
minimum de pièces voulues et la région voulue.

```
FIGURE4.8 – Page de confirmation du depot
```
La figure4.8 illustre une page web qui confirme que le client a bien déposé son offre avec
succés.


```
CHAPITRE 4. REALISATION
```
```
FIGURE4.9 – Page de listes des offres
```
La figure4.9 illustre une page web qui permet de lister les offres déposées par les différents
clients inscrits dans le site.

```
FIGURE4.10 – Page de postulation
```
```
La figure4.10 illustre une page web qui permet au client de postuler à une offre.
```

```
CHAPITRE 4. REALISATION
```
```
FIGURE4.11 – Page de confirmation de postulation
```
La figure4.11 illustre une page web qui confirme que le client a bien postulé à une offre.

```
FIGURE4.12 – Page de suppression d’une offre
```
La figure4.12 illustre une page web qui permet au client de pouvoir supprimer son offre.


```
CHAPITRE 4. REALISATION
```
```
FIGURE4.13 – Page de succés de suppression de l’offre
```
La figure4.13 illustre une page web qui montre que la suppression de l’offre est effectuée
avec succés.

```
FIGURE4.14 – Page des demandes d’échange reçues au client
```
La figure4.14 illustre une page web qui permet au client de consulter les demandes d’échange
envoyées par les autres clients.


```
CHAPITRE 4. REALISATION
```
```
FIGURE4.15 – Page de succés de confirmation
```
```
La figure4.15 illustre une page web qui montre que le client a confirmé une offre avec succés.
```
```
FIGURE4.16 – Page d’authentification invalide
```
La figure4.16 illustre une page web qui affiche un erreur en cas d’une authentification inva-
lide.


```
CHAPITRE 4. REALISATION
```
```
FIGURE4.17 – Page d’authentification nécessaire
```
La figure4.17 illustre une page web qui montre que le client doit s’authentifier avant de
consulter les offres.

```
FIGURE4.18 – Page d’authentification de l’administrateur
```
La figure4.18 illustre une page web qui permet à l’administrateur de s’authentifier pour
accéder à son espace privé.


```
CHAPITRE 4. REALISATION
```
```
FIGURE4.19 – Page de l’espace privé de l’administrateur
```
```
La figure4.19 illustre une page web qui décrit l’espace privé de l’administrateur.
```
```
FIGURE4.20 – Page des échanges effectués par les clients
```
La figure4.20 illustre une page web qui présente l’ensemble des couples de personnes qui
ont echangé leur maisons de vacances.


```
CHAPITRE 4. REALISATION
```
```
FIGURE4.21 – Page de consultation des clients
```
```
La figure4.21 illustre une page web qui affiche la liste des clients.
```
```
FIGURE4.22 – Page de succés de suppression du client
```
La figure4.22 illustre une page web qui montre que la suppression du client est effectuée
avec succés.


```
CHAPITRE 4. REALISATION
```
```
FIGURE4.23 – Page de consultation des offres
```
```
La figure4.23 illustre une page web qui affiche la liste des offres.
```
```
FIGURE4.24 – Page de succés de suppression de l’offre
```
La figure4.24 illustre une page web qui montre que la suppression de l’offre est effectuée
avec succés.


```
CHAPITRE 4. REALISATION
```
###### Conclusion

Dans ce chapitre, nous avons présenté les aspects du réalisation de notre application ainsi
que les captures d’écran décrivant les différentes pages de notre site.


### Conclusion Générale

## C

```
Etravail présente les différentes étapes par lesquelles nous sommes passés pour mettre
en oeuvre un site web dynamique d’échange des logements de vacances en ligne.
```
```
Le site comporte un espace clients dans lequel, les utilisateurs font l’échange de leurs biens.
```
Pour mettre en relief ce travail, nous avons commencé par la présentation du concept géné-
rale du site et l’explication de son intérêt d’existence.
Puis, nous avons passer à la spécification et l’analyse des besoins fonctionnels et non fonction-
nels pour fixer les buts à atteindre.
Ensuite, nous avons entamé l’étape de conception dans laquelle nous avons présenté l’archi-
tecture de travail qui repose sur architecture MVC avec ses différentes composantes : Modèle,
Vue et Contrôleur. Par la suite, nous avons présenté le diagramme de classes et les diagrammes
des séquences correspondants.

La phase de réalisation vient couronner l’ensemble pendant laquelle nous avons traduit
notre modélisation conceptuelle en un prototype fonctionnel.

Malgré les contraintes de temps et difficultés rencontrées, nous avons reussit à réaliser une
partie conséquente du travail requis pour satisfaire la majorité des besoins attendus.

```
Merci pour votre attention.
```

### Bibliographie

[1] Livre Du Zero "Créez des applications web avec Java EE"

[2] Livre Du Zero "Réalisez votre site web avec HTML5 et CSS3"


### Netographie

(1) http ://www.tutorialspoint.com/hibernate/
(2) http ://portfolio-tech.comuf.com/wordpress/exemple-crud-avec-jsf-et-hibernate/
(3) http ://www.primefaces.org/showcase/
(4) http ://www.youtube.com
(5) http ://all-free-download.com/free-website-templates/
(6) Documentation sur le modele MVC Uber communication


