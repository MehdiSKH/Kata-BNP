# Kata-BNP
Kata pour qualif BNP

Outils/technos : Kubernetes-Helm / PostgreSQL / Maven (Spring boot 3.0 - Java 17).

- Création d'un dockerfile backend avec mécanisme de build

- Exposition de l'app à l'aide d'un reverse proxy (ingress nginx)

- Utilisation d'un multistage pour l'exposition du jar obtenu dans un container

- Démarrage de l'appli 3-tier (front, back, bdd postgres) à l'aide de kubectl ou helm.