package fr.cnam.pa.inf330.tp05.exemple01;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class ModifierChecker {

    public static void main(String[] args) {
        for (Field field : String.class.getDeclaredFields()) {
            int modifiers = field.getModifiers();
            StringBuilder builder = new StringBuilder();
            if (Modifier.isPrivate(modifiers)) builder.append("private ");
            if (Modifier.isProtected(modifiers)) builder.append("protected ");
            if (Modifier.isPublic(modifiers)) builder.append("public ");
            if (Modifier.isStatic(modifiers)) builder.append("static ");
            if (Modifier.isFinal(modifiers)) builder.append("final ");
            System.out.println(builder.append(field.getType().getName()).append(' ').append(field.getName()));
        }
    }
}
