# Day 2

## Debugging ReactJS applications from Microsoft Visual Studio Code
<pre>
https://code.visualstudio.com/docs/editor/debugging#_launch-configurations
https://create-react-app.dev/docs/debugging-tests
</pre>

## Using Matchers in REST Jest and React Test Suite Framework based Test cases
<pre>
https://jestjs.io/docs/using-matchers
</pre>

## Installing JDK 11 in CentOS 7.9.2009
```
cd ~/Downloads
wget https://github.com/adoptium/temurin17-binaries/releases/download/jdk-17.0.2%2B8/OpenJDK17U-jdk_x64_linux_hotspot_17.0.2_8.tar.gz
tar xvfz OpenJDK17U-jdk_x64_linux_hotspot_17.0.2_8.tar.gz
```

## Installing Maven
```
cd ~/Downloads
wget https://dlcdn.apache.org/maven/maven-3/3.8.6/binaries/apache-maven-3.8.6-bin.tar.gz
tar xvfz apache-maven-3.8.6-bin.tar.gz
cd apache-maven-3.8.6
```

## Adding JDK and Maven in system path
Make sure your ~/.bashrc file looks as shown below
<pre>
home/jegan/Downloads/node-v16.17.1-linux-x64
export JAVA_HOME=/home/jegan/Downloads/jdk-17.0.2+8
export M2_HOME=/home/jegan/Downloads/apache-maven-3.8.6

export PATH=$JAVA_HOME/bin:$M2_HOME/bin:$NODEJS_HOME/bin:$PATH
</pre>

Testing if Maven works as expected
<pre>
[jegan@tektutor.org ~]$ <b>source ~/.bashrc</b>
[jegan@tektutor.org ~]$ <b>mvn --version</b>
Apache Maven 3.8.6 (84538c9988a25aec085021c365c560670ad80f63)
Maven home: /home/jegan/Downloads/apache-maven-3.8.6
Java version: 17.0.2, vendor: Eclipse Adoptium, runtime: /home/jegan/Downloads/jdk-17.0.2+8
Default locale: en_US, platform encoding: UTF-8
OS name: "linux", version: "3.10.0-1160.76.1.el7.x86_64", arch: "amd64", family: "unix"
</pre>

## Spring Initializr website
<pre>
https://start.spring.io/
</pre>

## Lab - Executing the React Login Application
```
cd ~/java-microservices-oct-2022
git pull
cd Day2/reactjs/login-app
npm install
npm start
```

# Day 2

## SOLID Design Principle
1. Single Responsibility Principle (S)
2. Open Closed Principle (O)
3. Liskov Substitution Principle (L)
4. Interface Seggration (I)
5. Dependency Inject or Dependency Inversion or Invertion of Control (D)


