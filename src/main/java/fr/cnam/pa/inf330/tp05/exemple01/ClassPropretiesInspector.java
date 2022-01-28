package fr.cnam.pa.inf330.tp05.exemple01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassPropretiesInspector {

    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {
        /*
        List<Class> classes = new ArrayList<Class>(
                Arrays.asList(String.class, int.class, MonInnerException.class, MonOuterException.class));

        classes.stream().forEach(clazz -> {
            System.out.println("class " + clazz.getName());
            System.out.println("\tIsPrimitive? " + clazz.isPrimitive());
            System.out.println("\tIsMemberClass? " + clazz.isMemberClass() + "\n");
        });
         */

        //Constructor<MonInnerException> declaredConstructor = MonInnerException.class.getDeclaredConstructor();

        Method[] declaredMethods = MonInnerException.class.getDeclaredMethods();

        Field messageField = MonInnerException.class.getDeclaredField("message");
        System.out.println(messageField);
    }

    class MonInnerException extends Exception {

         String message;

        public MonInnerException() {
            super("Un message d'erreur depuis MonInnerException");
        }
    }
}

class MonOuterException extends Exception {
    public MonOuterException() {
        super("Un message d'erreur depuis MonOuterException");
    }
}
