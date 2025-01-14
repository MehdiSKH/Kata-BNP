# Kata-BNP
Kata for BNP validation

Tools/technos : Kubernetes-Helm / PostgreSQL / Maven (Spring boot 3.0 - Java 17).

- Creating a dockerfile for backend (with a build mechanism)
- Using multistaging to expose the resulting jar in the container
- Exposing the app using a reverse proxy (ingress nginx)
- Starting the 3-tier app (front, back, db postgres) using kubectl or helm.
