# sb-property-sources-hidden-folders

* requires JDK 13+
* the project contains 3 classes: configuration, property binding and the test case.
* the project contains 1 properties file: src/main/resources/application-hello.properties, suitable of being bound to MyProperties bean.
* pom.xml provides 2 profiles -> 'failure' and 'success'.
* Profile failure is activated by default.

#### The "hidden" folder

The maven projects pom.xml adjusts the build target folder to `.target` folder. Since 2.3.5, using a "hidden" folder causes `application[-hello].properties` not to be found and therefore, binding does not take place.

```
<!-- adjust maven target to hidden folder -->
<directory>${project.basedir}/.target</directory>

<defaultGoal>clean verify</defaultGoal>
```

#### bad: Spring Boot 2.3.5
+ Just run `mvn` or `mvn -Pfailure`

#### fine: Spring Boot 2.3.4
+ Run `mvn -Psuccess`
