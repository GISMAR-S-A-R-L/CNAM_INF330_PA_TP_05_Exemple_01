package fr.cnam.pa.inf330.tp05.exemple01.model;

public class Utilisateur {
    String name;
    String login;
    int id;

    public Utilisateur(String name, String login, int id){
        System.out.println("public Utilisateur(String name, String login, int id)");
        this.name = name;
        this.login = login;
        this.id = id;
    }

    public Utilisateur(String name, String login){
        this(name,login,999);
        System.out.println("public Utilisateur(String name, String login)");
    }

    private Utilisateur(String name){
        this(name,"login");
    }

    @Override
    public String toString() {
        return "Utilisateur{" +
                "name='" + name + '\'' +
                ", login='" + login + '\'' +
                ", id=" + id +
                '}';
    }
}
