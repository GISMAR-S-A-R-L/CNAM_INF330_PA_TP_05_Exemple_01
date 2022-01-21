package fr.cnam.pa.inf330.tp05.exemple01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClassPropretiesInspector {

    public static void main(String[] args) {
        List<Class> classes = new ArrayList<Class>(
                Arrays.asList(String.class, int.class, MonInnerException.class, MonOuterException.class));
        classes.stream().forEach(clazz -> {
            System.out.println("class " + clazz.getName());
            System.out.println("\tIsPrimitive? " + clazz.isPrimitive());
            System.out.println("\tIsMemberClass? " + clazz.isMemberClass() + "\n");
        });
    }

    class MonInnerException extends Exception {
        public MonInnerException(){
            super("Un message d'erreur depuis MonInnerException");
        }
    }
}

class MonOuterException extends Exception {
    public MonOuterException(){
        super("Un message d'erreur depuis MonOuterException");
    }
}
