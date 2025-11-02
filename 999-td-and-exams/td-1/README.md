# Travail à Rendre Design patterns

## Exercice 1

> ### Situation 1 - Composite Pattern
```mermad
---
title: Situation 1 - Composite Pattern
config:
  layout: elk
  class:
    hideEmptyMembersBox: true
---
classDiagram
    direction BT
    class Figure {
        <<interface>>
    }
    namespace Figures {
        class Cercle
        class Rectangle
    }
    Figure <|.. Cercle
    Figure <|.. Rectangle

    class Groupe {
        -Figure[] children
        +add(f: Figure)
        +remove(f: Figure)
        +getChildren() Figure[]
    }

    Figure <|.. Groupe
    Groupe "0..1" *-- "0..*" Figure
```
