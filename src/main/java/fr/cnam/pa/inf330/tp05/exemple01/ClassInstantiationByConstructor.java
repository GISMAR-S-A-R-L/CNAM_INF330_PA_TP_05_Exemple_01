package fr.cnam.pa.inf330.tp05.exemple01;

import fr.cnam.pa.inf330.tp05.exemple01.model.Utilisateur;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassInstantiationByConstructor {
    public static void main(String[] args) {
        try {
            Constructor<Utilisateur> constructor = Utilisateur.class.getConstructor(String.class, String.class, int.class);
            System.out.println("Utilisation du constructeur " + constructor.toString());
            Utilisateur utilisateur = constructor.newInstance("Gustavo", "loginGustavo",667766);
            System.out.println("L'instance créée est : " + utilisateur.toString());
            Constructor<Utilisateur> privateConstructor = Utilisateur.class.getDeclaredConstructor(String.class);
            System.out.println("Le constructeur privé est : " + privateConstructor.getName());
        } catch (NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            System.out.println("Erreur!!! " + e.getMessage());
        }
    }
}
