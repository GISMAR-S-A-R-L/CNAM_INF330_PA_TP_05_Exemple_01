package fr.cnam.pa.inf330.tp05.exemple01;

import java.io.Serializable;
import java.util.Arrays;

public class ClassInheritanceInspector {

    public static void main(String[] args) throws Exception {
        Class<? super MonInnerException> superclass = MonInnerException.class.getSuperclass();
        System.out.println("La superclasse de MonInnerException est " + superclass.getName());

        System.out.println("et le(s) interface(s) implémentée(s) est(sont) ");
        Class<?>[] interfaces = MonInnerException.class.getInterfaces();
        Arrays.stream(interfaces).forEach(itf -> {
            System.out.println("\t" + itf.getName());
        });
    }

    class MonInnerException extends Exception implements Serializable {

        public MonInnerException() {
            super("Un message d'erreur depuis MonInnerException");
        }
    }
}

