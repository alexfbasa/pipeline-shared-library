FROM jenkins/jenkins
USER root
RUN apt-get update
RUN apt-get install -y maven
RUN apt-get install -y net-tools

RUN apt-get install -y python3-pip
# Install app dependencies
RUN pip install --upgrade pip
#RUN pip install ansible --upgrade
USER jenkins