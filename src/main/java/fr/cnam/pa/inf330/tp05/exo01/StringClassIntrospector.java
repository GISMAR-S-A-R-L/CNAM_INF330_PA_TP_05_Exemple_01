package fr.cnam.pa.inf330.tp05.exo01;

public class StringClassIntrospector {
    public static void main(String[] args) throws Exception {
        Class<String> clazz = String.class;
        String s = clazz.getDeclaredConstructor().newInstance();

        String aString = "Contenu de la variable s";
        Object o = s;
        Class<? extends Object> clazz2 = o.getClass();
        boolean isTheSame = (clazz2 == s.getClass()); // true
        System.out.println(isTheSame);
    }
}
