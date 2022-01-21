package fr.cnam.pa.inf330.tp05.exo01;

import fr.cnam.pa.inf330.tp05.exo01.model.Utilisateur;

import java.lang.reflect.Field;

public class UtilsateurFieldAccessor {
    public static void main(String[] args) throws Exception {
        Field nameField = Utilisateur.class.getDeclaredField("name");
        // la variable est privée, il faut donc passer outre la sécurité
        nameField.setAccessible(true);

        Utilisateur utilisateur = new Utilisateur("gustavo","loginGustavo");
        System.out.println("L'instance Utilisateur est : " + utilisateur.toString());
        String nameValue = (String)nameField.get(utilisateur);
        System.out.println("Affectivement la valeur de la variable d'instance 'name' est '" + nameValue+"'");

        System.out.println("Si on change la valeur de la variable d'instance 'name' par 'GUSTAVO'");
        nameField.set(utilisateur,"GUSTAVO");
        System.out.println("L'instance Utilisateur est : " + utilisateur.toString() + " ... maintenant");
    }
}
