Introduction
Continuous Integration/Continuous Deployment (CI/CD) pipelines are one of the core components of the DevOps environment. They help streamline the workflow between multiple teams and increase productivity. Jenkins is a widely-used open source automation server that can set up CI/CD pipelines.

In this tutorial, you will install Jenkins on Kubernetes. You will then access the Jenkins UI and run a sample pipeline.

If you’re looking for a managed Kubernetes hosting service, check out our simple, managed Kubernetes service built for growth.

Prerequisites
To follow this tutorial, you will need:

A working Kubernetes cluster and kubectl set up on your workstation. Follow our Kubernetes Quickstart to set up a Kubernetes cluster on DigitalOcean.
Step 1 — Installing Jenkins on Kubernetes
Kubernetes has a declarative API and you can convey the desired state using either a YAML or JSON file. For this tutorial, you will use a YAML file to deploy Jenkins. Make sure you have the kubectl command configured for the cluster.

First, use kubectl to create the Jenkins namespace:

kubectl create namespace jenkins

Next, create the YAML file that will deploy Jenkins.

Create and open a new file called jenkins.yaml using nano or your preferred editor:

nano jenkins.yaml
Now add the following code to define the Jenkins image, its port, and several more configurations:

This YAML file creates a deployment using the Jenkins LTS image and also opens port 8080 and 50000. You use these ports to access Jenkins and accept connections from Jenkins workers respectively.

Now create this deployment in the jenkins namespace:


kubectl create -f jenkins-service.yaml --namespace jenkins


kubectl get services --namespace jenkins