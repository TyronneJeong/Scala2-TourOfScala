package ProgrammingInScala4thEdition.combining/* an annotation in Java notation */

import java.lang.annotation.*; // This is Java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Ignore { }
