package com.springlearning.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/* 
The above annotation internally has the below meta-annotations. So if an annotation has another annotation, it is called meta-annotation.

@Target(ElementType.TYPE)
This means that the @Target annotation can be only assigned to a class/interface/enum

@Retention(RetentionPolicy.RUNTIME)
This means that this particular @SpringBootApplication should be available at Runtime

@Documented
This means that this annotation should be documented in the java docs. This looks like a marker annotation.

@Inherited
This allows an annotation to be inherited by subclasses.

@SpringBootConfiguration
This is an indication for Spring that this class provides application configuration

@EnableAutoConfiguration
This annotation will check your dependency jars and create and configure beans automatically

@ComponentScan(excludeFilters = { @Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
@Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })
This annotation allows spring to scan for any class with @Component and autoconfigure it. In the above code, both TypeExcludeFilter and AutoConfigurationExcludeFilter classes are being excluded from being scanned.

*/
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
		/*
		This above line is used to call a creation an object of SpringApplication and call the public run() method with your class that has the application configuration details and any args.
		 */
	}

}
