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
``
When it prompts for password, type 'rps@12345' without the quotes.

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
