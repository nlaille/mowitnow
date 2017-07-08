# MowItNow

La société MowItNow a décidé de développer une tondeuse à gazon automatique, destinée aux

surfaces rectangulaires.


La tondeuse peut être programmée pour parcourir l'intégralité de la surface.

La position de la tondeuse est représentée par une combinaison de coordonnées (x,y) et d'une

lettre indiquant l'orientation selon la notation cardinale anglaise (N,E,W,S). La pelouse est

divisée en grille pour simplifier la navigation.

Par exemple, la position de la tondeuse peut être « 0,0, N », ce qui signifie qu'elle se situe

dans le coin inférieur gauche de la pelouse, et orientée vers le Nord.


Enonce du projet : [lien vers le pdf](ExerciceTechnique-MOWER2.doc.pdf)


# Usage du projet

Il est possible de lancer le projet directement avec le fichier sample1.mow

```
$ gradle runSample1
```

Il est egalement possible de choisir le fichier souhaite

```
$ gradle run -Pfile=input/sample1.mow
```

# Tester le projet

Le projet est couvert par des tests unitaires (JUnit)

Il est possible d'executer les tests avec la task gradle test

```
$ gradle test
```