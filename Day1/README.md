# Day 1 - React JS

## What is DOM ?
- DOM is Document Object Model
- DOM is a tree style object
- is a programming interface for web documents
- it represents the web page
- an object oriented representation of a web page
- reprents structure, style and content of the web page
- DOM object has one or more HTML elements
- Examples of HTML element
  - <input> element that accepts input from end-user 
  - <button> element that allows you to submit the information to server/local for further processing
 
  
## Framework vs Library

## JavaScript
- scripting language that is supported by almost all web browsers
- Web browsers under HTML
- Web browsers under DOM 
- each time the user types or modifies any properties on your web page, the entire DOM is replaced which is inefficient
- as even smaller updates end-up replacing the entire DOM, the web page will have performance impacts
  
## What is React JS ?
- is an open source javascript library developed by Facebook
- it is very small library compared to Angular JS or Vue JS Frameworks
- hence it is easy to learn
- each time there is an update, first the Virtual DOM managed by React is updated in-memory, React then compares the Virtual DOM with the actual DOM in the web page, React then only updates the portion that is different between the Virtual and Actual DOM
- hence web applications developed using ReactJS Javascript library is faster compared to other Web Frameworks

## Angular JS
- is a web application development Framework
- it provides complete solution to develop a web application
- we get very less choice to choose the third-party javascript libaries as the Framework makes such choice for us
- learning a big framework like Angular JS is difficult compared to React JS

  
## What are the advantages of using React JS over plain JavaScript ?

## What are the advantages of using React JS over Angular or Vue js ?

## What is JSX ?
- means JavaScript XML
- extension of JavaScript 
- it is neither a string nor a HTML
- JSX produces React elements

## What is Babel/TypeScript ?
- is a JSX compiler or to be precise they are called as Transpilers
- they convery JSX code into pure javascript
- TypeScript is yet another Transpiler that converts JSX code into old Javascript code that can be understood by most Web browsers
 
## What is WebPack ?
- is a Javascript library that helps us in packaging the web applications into a bundle which is easier to deploy into some web servers/app servers

## Installing git in CentOS 7.9.x
```
sudo yum -y install https://packages.endpointdev.com/rhel/7/os/x86_64/endpoint-repo.x86_64.rpm
sudo yum install git  
```
  
## Setting up React Lab environment
```
cd ~/Downloads
wget https://nodejs.org/dist/v16.17.1/node-v16.17.1-linux-x64.tar.xz
tar xvf node-v16.17.1-linux-x64.tar.xz
cd node-v16.17.1-linux-x64
pwd
```
  
Expected output
<pre>
[jegan@tektutor.org Downloads]$ <b>tar xvf node-v16.17.1-linux-x64.tar.xz</b>
node-v16.17.1-linux-x64/
node-v16.17.1-linux-x64/bin/
node-v16.17.1-linux-x64/bin/node
node-v16.17.1-linux-x64/bin/npm
node-v16.17.1-linux-x64/bin/npx
node-v16.17.1-linux-x64/bin/corepack
node-v16.17.1-linux-x64/include/node/openssl/asn1t_no-asm.h
node-v16.17.1-linux-x64/include/node/openssl/bio_no-asm.h
node-v16.17.1-linux-x64/include/node/openssl/bn_conf_no-asm.h
node-v16.17.1-linux-x64/include/node/openssl/cms_asm.h
node-v16.17.1-linux-x64/include/node/openssl/conf_no-asm.h
node-v16.17.1-linux-x64/include/node/openssl/crmf_no-asm.h
node-v16.17.1-linux-x64/include/node/openssl/dso_conf_asm.h
node-v16.17.1-linux-x64/include/node/openssl/ess_no-asm.h
node-v16.17.1-linux-x64/include/node/openssl/ocsp_asm.h
node-v16.17.1-linux-x64/include/node/openssl/opensslv_no-asm.h
node-v16.17.1-linux-x64/include/node/openssl/safestack_asm.h
node-v16.17.1-linux-x64/include/node/openssl/ui_asm.h
node-v16.17.1-linux-x64/include/node/openssl/x509v3_asm.h
node-v16.17.1-linux-x64/include/node/openssl/crmf_asm.h
node-v16.17.1-linux-x64/include/node/openssl/crypto_asm.h
node-v16.17.1-linux-x64/include/node/openssl/dso_conf_no-asm.h
node-v16.17.1-linux-x64/include/node/openssl/fipskey_asm.h
node-v16.17.1-linux-x64/include/node/openssl/opensslconf_asm.h
node-v16.17.1-linux-x64/include/node/openssl/pkcs12_no-asm.h
node-v16.17.1-linux-x64/include/node/openssl/srp_no-asm.h
node-v16.17.1-linux-x64/include/node/openssl/x509_no-asm.h
node-v16.17.1-linux-x64/include/node/openssl/asn1_asm.h
node-v16.17.1-linux-x64/include/node/openssl/asn1t_asm.h
node-v16.17.1-linux-x64/include/node/openssl/bio_asm.h
node-v16.17.1-linux-x64/include/node/openssl/bn_conf_asm.h
node-v16.17.1-linux-x64/include/node/openssl/cmp_asm.h
node-v16.17.1-linux-x64/include/node/openssl/cms_no-asm.h
node-v16.17.1-linux-x64/include/node/openssl/configuration_asm.h
node-v16.17.1-linux-x64/include/node/openssl/crypto_no-asm.h
node-v16.17.1-linux-x64/include/node/openssl/err_asm.h
node-v16.17.1-linux-x64/include/node/openssl/fipskey_no-asm.h
node-v16.17.1-linux-x64/include/node/openssl/opensslconf_no-asm.h
node-v16.17.1-linux-x64/include/node/openssl/pkcs7_asm.h
node-v16.17.1-linux-x64/include/node/openssl/srp_asm.h
node-v16.17.1-linux-x64/include/node/openssl/ui_no-asm.h
node-v16.17.1-linux-x64/include/node/openssl/x509v3_no-asm.h
node-v16.17.1-linux-x64/include/node/zconf.h
node-v16.17.1-linux-x64/include/node/zlib.h
node-v16.17.1-linux-x64/README.md
node-v16.17.1-linux-x64/LICENSE
node-v16.17.1-linux-x64/CHANGELOG.md
[jegan@tektutor.org Downloads]$ 
</pre>

## Adding the NodeJS bin folder to system path

  
You need to edit the file ~/.bashrc 
<br>Editing the ~/.bashrc using vim
```
vim ~/.bashrc
```
To start editing the file,
<pre>
Press the esc button
i
</pre>
  
To save the changes in vim editor, you need to follow the below
<pre>
Press the esc button
:wq!
</pre>

<br>
Editing the ~/.bashrc using gedit (resembles like Windows notepad editor)
```
gedit ~/.bashrc
```

Make sure you append the below lines at the end of the file. Replace 'jegan' with 'rps' without quotes 
<pre>
# User specific aliases and functions
export NODEJS_HOME=/home/jegan/Downloads/node-v16.17.1-linux-x64
export PATH=$NODEJS_HOME/bin:$PATH
</pre>

To apply config changes
```
source ~/.bashrc
```
  
Verify if nodejs is added to system path as expected
```
cd ~
node --version
npm --version
```

Expected output
<pre>
[jegan@tektutor.org ~]$ <b>node --version</b>
bash: node: command not found...
[jegan@tektutor.org ~]$ <b>npm --version</b>
bash: npm: command not found...
[jegan@tektutor.org ~]$ <b>source ~/.bashrc</b>
[jegan@tektutor.org ~]$ <b>node --version</b>
v16.17.1
[jegan@tektutor.org ~]$ <b>npm --version</b>
8.15.0
</pre>


## In case git and tree utilities are not installed on your system
```
cd ~
sudo yum install -y tree git
```
When it prompts for password, type 'rps@12345' without the quotes.


## Installing Visual Studio Code in CentOS Linux release 7.9.2009 (Core)
For detailed instructions you may refer this https://linuxize.com/post/how-to-install-visual-studio-code-on-centos-7/#:~:text=Now%20that%20VS%20Code%20is,%2D%3E%20Visual%20Studio%20Code%20).&text=You%20can%20now%20start%20installing,Code%20according%20to%20your%20preferences.
  
```
sudo rpm --import https://packages.microsoft.com/keys/microsoft.asc
```
  
Create a file named /etc/yum.repos.d/vscode.repo
```
sudo gedit /etc/yum.repos.d/vscode.repo
```
Paste the below content in /etc/yum.repos.d/vscode.repo and save the file
<pre>
[code]
name=Visual Studio Code
baseurl=https://packages.microsoft.com/yumrepos/vscode
enabled=1
gpgcheck=1
gpgkey=https://packages.microsoft.com/keys/microsoft.asc
</pre>

Now you can install Visual Studio code as shown below
```
sudo yum install code -y
```
  
## Cloning TekTutor GitHub Repository to your Cloud Lab Machine (First time)
```
cd ~
git clone https://github.com/tektutor/java-microservices-oct-2022.git
cd java-microservices-oct-2022
```

## Pulling delta changes after clone
```
cd ~/java-microservices-oct-2022
git pull
```
  
## ⛹️‍♂️ Lab - Executing your first JavaScript example
```
cd ~/java-microservices-oct-2022
git pull
cd Day1/javascript/hello-world
pwd
```
Copy the above path and paste in your chrome browser and open index.html file, click the button to check the output.
  
In my case, the url looks as shown below
<pre>
/home/jegan/java-microservices-oct-2022/Day1/javascript/hello-world/index.html
</pre>

## ⛹️‍♂️ Lab - Executing your JavaScript example that updates images on button click via Javascript
```
cd ~/java-microservices-oct-2022
git pull
cd Day1/javascript/images
pwd
```
Copy the above path and paste in your chrome browser and open index.html file, click the button to check the output.
  
In my case, the url looks as shown below
<pre>
/home/jegan/java-microservices-oct-2022/Day1/javascript/images/index.html
</pre>

## ⛹️‍♂️ Lab - Changing Font size and display/hide text using JavaScript
```
cd ~/java-microservices-oct-2022
git pull
cd Day1/javascript/font-size
pwd
```
Copy the above path and paste in your chrome browser and open index.html file, click the button to check the output.
  
In my case, the url looks as shown below
<pre>
/home/jegan/java-microservices-oct-2022/Day1/javascript/font-size/index.html
</pre>
  
## ⛹️‍♂️ Lab - Using JavaScript function as a button click event handler
```
cd ~/java-microservices-oct-2022
git pull
cd Day1/javascript/functions
pwd
```
Copy the above path and paste in your chrome browser and open index.html file, click the button to check the output.
  
In my case, the url looks as shown below
<pre>
/home/jegan/java-microservices-oct-2022/Day1/javascript/functions/index.html
</pre>

## Create your first react-js application
```
cd ~
npx create-react-app hello
```

Expected output
<pre>
[jegan@tektutor.org ~]$ <b>npx create-react-app hello</b>
Need to install the following packages:
  create-react-app@5.0.1
Ok to proceed? (y) <b>y</b>
npm WARN deprecated tar@2.2.2: This version of tar is no longer supported, and will not receive security updates. Please upgrade asap.

Creating a new React app in /home/jegan/hello.

Installing packages. This might take a couple of minutes.
Installing react, react-dom, and react-scripts with cra-template...


added 1393 packages in 54s

209 packages are looking for funding
  run `npm fund` for details

Initialized a git repository.

Installing template dependencies using npm...

added 56 packages in 6s

209 packages are looking for funding
  run `npm fund` for details
Removing template package using npm...


removed 1 package, and audited 1449 packages in 3s

209 packages are looking for funding
  run `npm fund` for details

6 high severity vulnerabilities

To address all issues (including breaking changes), run:
  npm audit fix --force

Run `npm audit` for details.

Created git commit.

Success! Created hello at /home/jegan/hello
Inside that directory, you can run several commands:

  npm start
    Starts the development server.

  npm run build
    Bundles the app into static files for production.

  npm test
    Starts the test runner.

  npm run eject
    Removes this tool and copies build dependencies, configuration files
    and scripts into the app directory. If you do this, you can’t go back!

We suggest that you begin by typing:

  cd hello
  npm start

Happy hacking!
</pre>

## ⛹️‍♂️ Lab - Trying the loops and variable lab exercise
```
cd ~/java-microservices-oct-2022
git pull

cd Day1/reactjs/loops-and-variables/
npm install
npm start
```
  
## Troubleshooting multiple watch error while running npm start ( Execute this as admin user )
```
echo fs.inotify.max_user_watches=524288 | sudo tee -a /etc/sysctl.conf && sudo sysctl -p 
```
  
