# Проект по предметот Континуирана интеграција и испорака 2022/2023 год.

Докеризирање на Java Spring апликација, која користи PostgreSQL база на податоци. Проектот се состои од multi-stage build Dockerfile, docker-compose file и Kubernetes YAML manifests. <br>
Старт на апликацијата:
-   `docker compose up`
-   `k3d cluster create project-cluster -p "8080:80@loadbalancer"`

<br>
Сетиран е и CI/CD pipeline, така што со push на git, се поставува новата верзија на Docker имиџот на DockerHub, а потоа и на deployment околина со помош на Microsoft Azure.
<br>
Kubernetes манифести има за следните работи: Secrets, Service и Ingress на апликацијата, StatefulSet за базата на податоци и посебен namespace за кластерот.
