I've created a stripped down spring boot project that demonstrates this problem.  You can git it at

https://github.com/funkyvisions/spring-boot-hello-world

you can toggle these 2 lines in the pom file

       <version>1.1.9.RELEASE</version>
       <!--<version>1.2.0.RC2</version>-->

Version 1.1.9.RELEASE of spring-boot will use spring-framework 4.0.8.RELEASE.  
Version 1.2.0.RC2 will use 4.1.2.RELEASE (a version with the problem).

Notice that only in the 4.0.8 version does the 

***********************  Setting HttpServletRequest!!!!!

line show up.  In the 4.1.2 it does not (just like our scenario).

I'm suspecting it has to do with the abstract class and isBridge(), so I need to play around with concrete classes and see how it behaves.
