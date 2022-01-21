package fr.cnam.pa.inf330.tp05.exemple01;

import fr.cnam.pa.inf330.tp05.exemple01.model.Utilisateur;

import java.lang.reflect.Method;

public class UtilsateurMethodCaller {
    public static void main(String[] args) throws Exception {
        Method toStringMethod = Utilisateur.class.getDeclaredMethod("toString");

        Utilisateur utilisateur = new Utilisateur("gustavo","loginGustavo");

        System.out.println("Appel de la méthode 'toString' de l'utilisateur avec l'objet : " + utilisateur.toString());
        System.out.println("Appel de la méthode 'toString' de l'utilisateur avec la réflexion : " + toStringMethod.invoke(utilisateur));
    }
}
