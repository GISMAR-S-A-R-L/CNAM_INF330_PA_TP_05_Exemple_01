package fr.cnam.pa.inf330.tp05.exemple01;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ClassForNameIntrospector {
    public static void main(String[] args) throws Exception {

        Class clazz = Class.forName(args[0]);
        Object obj = clazz.getConstructor().newInstance();
        System.out.println("Nom de la classe inspectée : " + obj.getClass().getName());

    }


}
