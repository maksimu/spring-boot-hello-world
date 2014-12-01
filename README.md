This application demonstrates an issue we had moving from spring-framework 4.1.0 to 4.1.1 (and it exists in 4.1.2)

The @Resource injection seems to behave different because it thinks the method doing the injection is a bridge.

You can toggle these 2 lines in the pom file to see the problem

        <spring.version>4.1.0.RELEASE</spring.version>
        <!--<spring.version>4.1.1.RELEASE</spring.version>-->

Notice that only in the 4.1.0 version does the

***********************  Setting HttpServletRequest!!!!!

line show up.  In the 4.1.1 it does not.  Meaning the injection never occurred.

I'm suspecting it has to do with the abstract class and isBridge().

If I change the @Resource to @Autowired then it works as expected.

I am running under Java 1.8.0_25-b17.

Here's the change that I think broke it.

https://github.com/spring-projects/spring-framework/commit/f4219ca06bbd1c324567ab9e74d0d18693359810#diff-2

It was to resolve

https://jira.spring.io/browse/SPR-12187
