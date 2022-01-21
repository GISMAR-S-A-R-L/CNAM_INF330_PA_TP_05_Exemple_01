package fr.cnam.pa.inf330.tp05.exo01;

public class ClassForNameIntrospector {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName(args[0]);
        Object obj = clazz.getConstructor().newInstance();
        System.out.println("Nom de la classe inspectée : " + obj.getClass().getName());
    }
}
