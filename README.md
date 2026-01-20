// ...existing code...
# ACT-MODULAR — Introducció i ordenació d'una taula d'enters

Aquest README descriu com el programa compleix els requisits de l'activitat.

Fitxer principal
----------------
- [actModular.java](actModular.java)
  - [`actModular.main`](actModular.java) — Controla el flux: demana la mida, crida l'entrada, ordena i mostra el resultat.
  - [`actModular.entradaDeDades`](actModular.java) — Mètode d'entrada de dades: rep la mida com a paràmetre, demana a l'usuari els valors i retorna un array d'enters.
  - [`actModular.ordenarDades`](actModular.java) — Mètode d'ordenació: rep un array d'enters i retorna l'array ordenat de menor a major (implementació amb bubble sort).

Compliment dels requisits
-------------------------
- El programa demana la mida de la taula i llegeix exactament aquesta quantitat d'enters mitjançant [`actModular.entradaDeDades`](actModular.java).
- L'ordenació es fa amb [`actModular.ordenarDades`](actModular.java) i retorna l'array ordenat ascendentment.
- Els tres passos (entrada, ordenació i impressió) són executats des de [`actModular.main`](actModular.java), per tant l'enunciat està completament satisfet.

Exemple d'ús
------------
1. Compilar:
```sh
javac actModular.java
```
2. Executar:
```sh
java actModular
```
Flux d'execució esperat (exemple):
- Introdueix la mida de la taula: 5
- Introdueix els valors: 7 2 9 1 5
- Sortida: Taula ordenada: 1 2 5 7 9

Enllaços
-------
- [actModular.java](actModular.java)
- [README.md](README.md)
// ...existing