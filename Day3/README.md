# Day 3
## Troubleshooting docker permission denied error (try this in your new terminal)
```
id
newgrp docker
id
```

## ⛹️‍♀️ Lab - Creating mysql docker container
```
docker run -d --name mysql --hostname mysql -p 3306:3306 -e MYSQL_ROOT_PASSWORD=root bitnami/mysql:latest
```

List and see if the mysql container is running
```
docker ps
```

In case, you wish to see the mysql db server logs
```
docker logs mysql
```

#### Getting inside the mysql db container to create database and an empty customer table
When it prompts for password, type 'root' without quotes.
```
docker exec -it mysql sh
mysql -u root -p
CREATE DATABASE tektutor;
USE tektutor;
CREATE TABLE customer (id INT NOT NULL, firstname VARCHAR(100) NOT NULL, lastname VARCHAR(100) NOT NULL, email VARCHAR(250) NOT NULL, PRIMARY KEY(id) );
```

## Troubleshooting Maven build failure related to JPA

If you are getting this below error
<pre>
***************************
APPLICATION FAILED TO START
***************************

Description:

Failed to configure a DataSource: 'url' attribute is not specified and no embedded datasource could be configured.

Reason: Failed to determine a suitable driver class


Action:

Consider the following:
	If you want an embedded database (H2, HSQL or Derby), please put it on the classpath.
	If you have database settings to be loaded from a particular profile you may need to activate it (no profiles are currently active).

2022-10-12 05:29:15.905 ERROR 8966 --- [           main] o.s.test.context.TestContextManager      : Caught exception while allowing TestExecutionListener [org.springframework.test.context.web.ServletTestExecutionListener@53142455] to prepare test instance [org.tektutor.customer.CustomerApplicationTests@43a65cd8]

java.lang.IllegalStateException: Failed to load ApplicationContext
	at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:98) ~[spring-test-5.3.23.jar:5.3.23]
	at org.springframework.test.context.support.DefaultTestContext.getApplicationContext(DefaultTestContext.java:124) ~[spring-test-5.3.23.jar:5.3.23]
	at org.springframework.test.context.web.ServletTestExecutionListener.setUpRequestContextIfNecessary(ServletTestExecutionListener.java:190) ~[spring-test-5.3.23.jar:5.3.23]
	at org.springframework.test.context.web.ServletTestExecutionListener.prepareTestInstance(ServletTestExecutionListener.java:132) ~[spring-test-5.3.23.jar:5.3.23]
	at org.springframework.test.context.TestContextManager.prepareTestInstance(TestContextManager.java:248) ~[spring-test-5.3.23.jar:5.3.23]
	at org.springframework.test.context.junit.jupiter.SpringExtension.postProcessTestInstance(SpringExtension.java:138) ~[spring-test-5.3.23.jar:5.3.23]
	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$invokeTestInstancePostProcessors$8(ClassBasedTestDescriptor.java:363) ~[junit-jupiter-engine-5.8.2.jar:5.8.2]
	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.executeAndMaskThrowable(ClassBasedTestDescriptor.java:368) ~[junit-jupiter-engine-5.8.2.jar:5.8.2]
	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$invokeTestInstancePostProcessors$9(ClassBasedTestDescriptor.java:363) ~[junit-jupiter-engine-5.8.2.jar:5.8.2]
	at java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197) ~[na:na]
	at java.base/java.util.stream.ReferencePipeline$2$1.accept(ReferencePipeline.java:179) ~[na:na]
	at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1625) ~[na:na]
	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509) ~[na:na]
	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499) ~[na:na]
	at java.base/java.util.stream.StreamSpliterators$WrappingSpliterator.forEachRemaining(StreamSpliterators.java:310) ~[na:na]
	at java.base/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:735) ~[na:na]
	at java.base/java.util.stream.Streams$ConcatSpliterator.forEachRemaining(Streams.java:734) ~[na:na]
	at java.base/java.util.stream.ReferencePipeline$Head.forEach(ReferencePipeline.java:762) ~[na:na]
	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.invokeTestInstancePostProcessors(ClassBasedTestDescriptor.java:362) ~[junit-jupiter-engine-5.8.2.jar:5.8.2]
	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$instantiateAndPostProcessTestInstance$6(ClassBasedTestDescriptor.java:283) ~[junit-jupiter-engine-5.8.2.jar:5.8.2]
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.8.2.jar:1.8.2]
	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.instantiateAndPostProcessTestInstance(ClassBasedTestDescriptor.java:282) ~[junit-jupiter-engine-5.8.2.jar:5.8.2]
	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$4(ClassBasedTestDescriptor.java:272) ~[junit-jupiter-engine-5.8.2.jar:5.8.2]
	at java.base/java.util.Optional.orElseGet(Optional.java:364) ~[na:na]
	at org.junit.jupiter.engine.descriptor.ClassBasedTestDescriptor.lambda$testInstancesProvider$5(ClassBasedTestDescriptor.java:271) ~[junit-jupiter-engine-5.8.2.jar:5.8.2]
	at org.junit.jupiter.engine.execution.TestInstancesProvider.getTestInstances(TestInstancesProvider.java:31) ~[junit-jupiter-engine-5.8.2.jar:5.8.2]
	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.lambda$prepare$0(TestMethodTestDescriptor.java:102) ~[junit-jupiter-engine-5.8.2.jar:5.8.2]
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.8.2.jar:1.8.2]
	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:101) ~[junit-jupiter-engine-5.8.2.jar:5.8.2]
	at org.junit.jupiter.engine.descriptor.TestMethodTestDescriptor.prepare(TestMethodTestDescriptor.java:66) ~[junit-jupiter-engine-5.8.2.jar:5.8.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$prepare$2(NodeTestTask.java:123) ~[junit-platform-engine-1.8.2.jar:1.8.2]
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.8.2.jar:1.8.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.prepare(NodeTestTask.java:123) ~[junit-platform-engine-1.8.2.jar:1.8.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:90) ~[junit-platform-engine-1.8.2.jar:1.8.2]
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511) ~[na:na]
	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41) ~[junit-platform-engine-1.8.2.jar:1.8.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155) ~[junit-platform-engine-1.8.2.jar:1.8.2]
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.8.2.jar:1.8.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[junit-platform-engine-1.8.2.jar:1.8.2]
	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[junit-platform-engine-1.8.2.jar:1.8.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[junit-platform-engine-1.8.2.jar:1.8.2]
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.8.2.jar:1.8.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[junit-platform-engine-1.8.2.jar:1.8.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[junit-platform-engine-1.8.2.jar:1.8.2]
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511) ~[na:na]
	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.invokeAll(SameThreadHierarchicalTestExecutorService.java:41) ~[junit-platform-engine-1.8.2.jar:1.8.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$6(NodeTestTask.java:155) ~[junit-platform-engine-1.8.2.jar:1.8.2]
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.8.2.jar:1.8.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$8(NodeTestTask.java:141) ~[junit-platform-engine-1.8.2.jar:1.8.2]
	at org.junit.platform.engine.support.hierarchical.Node.around(Node.java:137) ~[junit-platform-engine-1.8.2.jar:1.8.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.lambda$executeRecursively$9(NodeTestTask.java:139) ~[junit-platform-engine-1.8.2.jar:1.8.2]
	at org.junit.platform.engine.support.hierarchical.ThrowableCollector.execute(ThrowableCollector.java:73) ~[junit-platform-engine-1.8.2.jar:1.8.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.executeRecursively(NodeTestTask.java:138) ~[junit-platform-engine-1.8.2.jar:1.8.2]
	at org.junit.platform.engine.support.hierarchical.NodeTestTask.execute(NodeTestTask.java:95) ~[junit-platform-engine-1.8.2.jar:1.8.2]
	at org.junit.platform.engine.support.hierarchical.SameThreadHierarchicalTestExecutorService.submit(SameThreadHierarchicalTestExecutorService.java:35) ~[junit-platform-engine-1.8.2.jar:1.8.2]
	at org.junit.platform.engine.support.hierarchical.HierarchicalTestExecutor.execute(HierarchicalTestExecutor.java:57) ~[junit-platform-engine-1.8.2.jar:1.8.2]
	at org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine.execute(HierarchicalTestEngine.java:54) ~[junit-platform-engine-1.8.2.jar:1.8.2]
	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:220) ~[junit-platform-launcher-1.3.1.jar:1.3.1]
	at org.junit.platform.launcher.core.DefaultLauncher.lambda$execute$6(DefaultLauncher.java:188) ~[junit-platform-launcher-1.3.1.jar:1.3.1]
	at org.junit.platform.launcher.core.DefaultLauncher.withInterceptedStreams(DefaultLauncher.java:202) ~[junit-platform-launcher-1.3.1.jar:1.3.1]
	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:181) ~[junit-platform-launcher-1.3.1.jar:1.3.1]
	at org.junit.platform.launcher.core.DefaultLauncher.execute(DefaultLauncher.java:128) ~[junit-platform-launcher-1.3.1.jar:1.3.1]
	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invokeAllTests(JUnitPlatformProvider.java:150) ~[surefire-junit-platform-2.22.2.jar:2.22.2]
	at org.apache.maven.surefire.junitplatform.JUnitPlatformProvider.invoke(JUnitPlatformProvider.java:124) ~[surefire-junit-platform-2.22.2.jar:2.22.2]
	at org.apache.maven.surefire.booter.ForkedBooter.invokeProviderInSameClassLoader(ForkedBooter.java:384) ~[surefire-booter-2.22.2.jar:2.22.2]
	at org.apache.maven.surefire.booter.ForkedBooter.runSuitesInProcess(ForkedBooter.java:345) ~[surefire-booter-2.22.2.jar:2.22.2]
	at org.apache.maven.surefire.booter.ForkedBooter.execute(ForkedBooter.java:126) ~[surefire-booter-2.22.2.jar:2.22.2]
	at org.apache.maven.surefire.booter.ForkedBooter.main(ForkedBooter.java:418) ~[surefire-booter-2.22.2.jar:2.22.2]
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'dataSourceScriptDatabaseInitializer' defined in class path resource [org/springframework/boot/autoconfigure/sql/init/DataSourceInitializationConfiguration.class]: Unsatisfied dependency expressed through method 'dataSourceScriptDatabaseInitializer' parameter 0; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'dataSource' defined in class path resource [org/springframework/boot/autoconfigure/jdbc/DataSourceConfiguration$Hikari.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [com.zaxxer.hikari.HikariDataSource]: Factory method 'dataSource' threw exception; nested exception is org.springframework.boot.autoconfigure.jdbc.DataSourceProperties$DataSourceBeanCreationException: Failed to determine a suitable driver class
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:800) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:541) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1352) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1195) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:322) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1154) ~[spring-context-5.3.23.jar:5.3.23]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:908) ~[spring-context-5.3.23.jar:5.3.23]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:583) ~[spring-context-5.3.23.jar:5.3.23]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:734) ~[spring-boot-2.7.4.jar:2.7.4]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:408) ~[spring-boot-2.7.4.jar:2.7.4]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:308) ~[spring-boot-2.7.4.jar:2.7.4]
	at org.springframework.boot.test.context.SpringBootContextLoader.loadContext(SpringBootContextLoader.java:132) ~[spring-boot-test-2.7.4.jar:2.7.4]
	at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContextInternal(DefaultCacheAwareContextLoaderDelegate.java:141) ~[spring-test-5.3.23.jar:5.3.23]
	at org.springframework.test.context.cache.DefaultCacheAwareContextLoaderDelegate.loadContext(DefaultCacheAwareContextLoaderDelegate.java:90) ~[spring-test-5.3.23.jar:5.3.23]
	... 67 common frames omitted
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'dataSource' defined in class path resource [org/springframework/boot/autoconfigure/jdbc/DataSourceConfiguration$Hikari.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [com.zaxxer.hikari.HikariDataSource]: Factory method 'dataSource' threw exception; nested exception is org.springframework.boot.autoconfigure.jdbc.DataSourceProperties$DataSourceBeanCreationException: Failed to determine a suitable driver class
	at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:658) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiateUsingFactoryMethod(ConstructorResolver.java:638) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.instantiateUsingFactoryMethod(AbstractAutowireCapableBeanFactory.java:1352) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBeanInstance(AbstractAutowireCapableBeanFactory.java:1195) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:582) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:542) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:335) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:333) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:208) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.config.DependencyDescriptor.resolveCandidate(DependencyDescriptor.java:276) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:1391) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:1311) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.ConstructorResolver.resolveAutowiredArgument(ConstructorResolver.java:887) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.ConstructorResolver.createArgumentArray(ConstructorResolver.java:791) ~[spring-beans-5.3.23.jar:5.3.23]
	... 87 common frames omitted
Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [com.zaxxer.hikari.HikariDataSource]: Factory method 'dataSource' threw exception; nested exception is org.springframework.boot.autoconfigure.jdbc.DataSourceProperties$DataSourceBeanCreationException: Failed to determine a suitable driver class
	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:185) ~[spring-beans-5.3.23.jar:5.3.23]
	at org.springframework.beans.factory.support.ConstructorResolver.instantiate(ConstructorResolver.java:653) ~[spring-beans-5.3.23.jar:5.3.23]
	... 101 common frames omitted
Caused by: org.springframework.boot.autoconfigure.jdbc.DataSourceProperties$DataSourceBeanCreationException: Failed to determine a suitable driver class
	at org.springframework.boot.autoconfigure.jdbc.DataSourceProperties.determineDriverClassName(DataSourceProperties.java:182) ~[spring-boot-autoconfigure-2.7.4.jar:2.7.4]
	at org.springframework.boot.autoconfigure.jdbc.DataSourceProperties.initializeDataSourceBuilder(DataSourceProperties.java:123) ~[spring-boot-autoconfigure-2.7.4.jar:2.7.4]
	at org.springframework.boot.autoconfigure.jdbc.DataSourceConfiguration.createDataSource(DataSourceConfiguration.java:48) ~[spring-boot-autoconfigure-2.7.4.jar:2.7.4]
	at org.springframework.boot.autoconfigure.jdbc.DataSourceConfiguration$Hikari.dataSource(DataSourceConfiguration.java:90) ~[spring-boot-autoconfigure-2.7.4.jar:2.7.4]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:na]
	at java.base/jdk.internal.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:77) ~[na:na]
	at java.base/jdk.internal.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:na]
	at java.base/java.lang.reflect.Method.invoke(Method.java:568) ~[na:na]
	at org.springframework.beans.factory.support.SimpleInstantiationStrategy.instantiate(SimpleInstantiationStrategy.java:154) ~[spring-beans-5.3.23.jar:5.3.23]
	... 102 common frames omitted

[[1;31mERROR[m] [1;31mTests [0;1mrun: [0;1m1[m, Failures: 0, [1;31mErrors: [0;1;31m1[m, Skipped: 0, Time elapsed: 1.329 s[1;31m <<< FAILURE![m - in org.tektutor.customer.[1mCustomerApplicationTests[m
[[1;31mERROR[m] contextLoads  Time elapsed: 0.004 s  <<< ERROR!
java.lang.IllegalStateException: Failed to load ApplicationContext
Caused by: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'dataSourceScriptDatabaseInitializer' defined in class path resource [org/springframework/boot/autoconfigure/sql/init/DataSourceInitializationConfiguration.class]: Unsatisfied dependency expressed through method 'dataSourceScriptDatabaseInitializer' parameter 0; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'dataSource' defined in class path resource [org/springframework/boot/autoconfigure/jdbc/DataSourceConfiguration$Hikari.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [com.zaxxer.hikari.HikariDataSource]: Factory method 'dataSource' threw exception; nested exception is org.springframework.boot.autoconfigure.jdbc.DataSourceProperties$DataSourceBeanCreationException: Failed to determine a suitable driver class
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'dataSource' defined in class path resource [org/springframework/boot/autoconfigure/jdbc/DataSourceConfiguration$Hikari.class]: Bean instantiation via factory method failed; nested exception is org.springframework.beans.BeanInstantiationException: Failed to instantiate [com.zaxxer.hikari.HikariDataSource]: Factory method 'dataSource' threw exception; nested exception is org.springframework.boot.autoconfigure.jdbc.DataSourceProperties$DataSourceBeanCreationException: Failed to determine a suitable driver class
Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [com.zaxxer.hikari.HikariDataSource]: Factory method 'dataSource' threw exception; nested exception is org.springframework.boot.autoconfigure.jdbc.DataSourceProperties$DataSourceBeanCreationException: Failed to determine a suitable driver class
Caused by: org.springframework.boot.autoconfigure.jdbc.DataSourceProperties$DataSourceBeanCreationException: Failed to determine a suitable driver class

[[1;34mINFO[m] 
[[1;34mINFO[m] Results:
[[1;34mINFO[m] 
[[1;31mERROR[m] [1;31mErrors: [m
[[1;31mERROR[m] [1;31m  CustomerApplicationTests.contextLoads » IllegalState Failed to load Applicatio...[m
[[1;34mINFO[m] 
[[1;31mERROR[m] [1;31mTests run: 1, Failures: 0, Errors: 1, Skipped: 0[m
[[1;34mINFO[m] 
[[1;34mINFO[m] [1m------------------------------------------------------------------------[m
[[1;34mINFO[m] [1;31mBUILD FAILURE[m
[[1;34mINFO[m] [1m------------------------------------------------------------------------[m
[[1;34mINFO[m] Total time:  3.445 s
[[1;34mINFO[m] Finished at: 2022-10-12T05:29:16+05:30
[[1;34mINFO[m] [1m------------------------------------------------------------------------[m
[[1;33mWARNING[m] The requested profile "pom.xml" could not be activated because it does not exist.
[[1;31mERROR[m] Failed to execute goal [32morg.apache.maven.plugins:maven-surefire-plugin:2.22.2:test[m [1m(default-test)[m on project [36mcustomer[m: [1;31mThere are test failures.[m
[[1;31mERROR[m] [1;31m[m
[[1;31mERROR[m] [1;31mPlease refer to /home/jegan/Documents/workspace-spring-tool-suite-4-4.16.0.RELEASE/customer/target/surefire-reports for the individual test results.[m
[[1;31mERROR[m] [1;31mPlease refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.[m
[[1;31mERROR[m] -> [1m[Help 1][m
[[1;31mERROR[m] 
[[1;31mERROR[m] To see the full stack trace of the errors, re-run Maven with the [1m-e[m switch.
[[1;31mERROR[m] Re-run Maven using the [1m-X[m switch to enable full debug logging.
[[1;31mERROR[m] 
[[1;31mERROR[m] For more information about the errors and possible solutions, please read the following articles:
[[1;31mERROR[m] [1m[Help 1][m http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
</pre>

### Solution - add the below annotations to your Application Main class
<pre>
package org.tektutor.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Configuration;

<b>@Configuration</b>
<b>@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})</b>
@SpringBootApplication
public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}

}
</pre>
