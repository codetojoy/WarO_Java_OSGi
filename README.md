## WarO_Java_OSGi

WarO is a code kata based on a simple card game. Rules are documented [here](https://github.com/peidevs/WarO_Java/blob/master/README.md).

### Architecture

* This example contains 3 modules. They are somewhat arbitrary, as this project was
written without modules in mind and initially converted to [Jigsaw modules](https://github.com/peidevs/WarO_Java_9).

* waro.base
    * originally used Spring, though this is commented out for now
    * exports several utility packages
    * OSGi Bundle Manifest [here](https://github.com/codetojoy/WarO_Java_OSGi/blob/master/waro.base/src/main/resources/META-INF/MANIFEST.MF)
* waro.function
    * uses Guava
    * exports functional packages 
    * OSGi Bundle Manifest [here](https://github.com/codetojoy/WarO_Java_OSGi/blob/master/waro.function/src/main/resources/META-INF/MANIFEST.MF)
* waro.main
    * requires `waro.base` and `waro.function`
    * the main app
    * OSGi Bundle Manifest [here](https://github.com/codetojoy/WarO_Java_OSGi/blob/master/waro.main/src/main/resources/META-INF/MANIFEST.MF)

### Setup 

* requires Java 1.8+ and Maven
* install [Apache Karaf](http://karaf.apache.org/)
* copy Guava 18.0 jar into `$APACHE_KARAF_HOME/deploy`

### Build Steps

* in terminal 1, start Apache Karaf
* in terminal 2:
    * `cd waro.base`
    * `mvn clean install` 
* in terminal 1:
    * `install mvn:net.codetojoy/waro-base/1.0.0-SNAPSHOT`
    * `list` to identify ID value
    * `start ID` for ID value (also useful is `stop ID` and `uninstall ID`)
* in terminal 2:
    * `cd waro.function`
    * `mvn clean install` 
* in terminal 1:
    * `install mvn:net.codetojoy/waro-function/1.0.0-SNAPSHOT`
    * `list` to identify ID value
    * `start ID` for ID value (also useful is `stop ID` and `uninstall ID`)
* in terminal 2:
    * `cd waro.main`
    * `mvn clean install` 
* in terminal 1:
    * `install mvn:net.codetojoy/waro-main/1.0.0-SNAPSHOT`
    * `list` to identify ID value
    * `start ID` for ID value (also useful is `stop ID` and `uninstall ID`)

### TODO 

* use OSGi annotations
* restore Spring into the `waro.base` configuration classes
