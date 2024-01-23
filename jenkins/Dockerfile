FROM jenkins/jenkins:lts
USER root

ENV JAVA_OPTS -Djenkins.install.runSetupWizard=false

COPY config/plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN jenkins-plugin-cli -f /usr/share/jenkins/ref/plugins.txt


RUN echo "Configure Jenkins" && \
    mkdir -p /var/lib/jenkins/init.groovy.d


COPY scripts/*.groovy /var/lib/jenkins/init.groovy.d/


COPY config/jenkins /etc/sysconfig/jenkins

RUN apt-get update && apt-get install -y \
    awscli \
    openjdk-17-jdk \
    maven

# RUN apt-get install -y ansible
RUN chown -R jenkins:jenkins /var/lib/jenkins

USER jenkins
