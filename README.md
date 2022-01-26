# springboot-on-docker-for-kubernetes-cluster
Springboot、Docker、Dockerfile、DockerHub、Kubernetes

**一、本地打包镜像推送到DockerHub**

    mkdir kubernetes-springboot
          -- kubernetes-springboot-0.0.1-SNAPSHOT.jar
          -- Dockerfile
 
    docker build -t 13362132290/kubernetes-springboot:v1.0.0 .

**二、登陆DockerHub输入自己的账号密码**

    docker login
   
**三、推送到DockerHub**

    docker push 13362132290/kubernetes-springboot:v1.0.0

**四、切换到yaml创建pod和service**

    kubectl create -f kubernetes-springboot-deployment.yaml

    kubectl create -f kubernetes-springboot-service.yaml

    kubectl get pod -n default

**五、根据暴露的指定端口访问**

    http://masterIP:30002/kubernetes/springboot