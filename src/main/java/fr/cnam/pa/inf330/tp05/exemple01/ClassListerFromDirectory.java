package fr.cnam.pa.inf330.tp05.exemple01;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ClassListerFromDirectory {

    public static void main(String[] args) throws ClassNotFoundException, IOException {
        Path packageDirectory = Paths.get("/Users/SantEZ/cnam/exemples/CNAM_INF330_PA_TP_05_Exemple_01/target/classes/fr/cnam/pa/inf330/tp05/exemple01");
        List<Class> classes = findClasses(packageDirectory, "fr.cnam.pa.inf330.tp05.exemple01");
        classes.stream().forEach(clazz -> {
            System.out.println("Class => " + clazz.getName());

        });
    }

    private static List<Class> findClasses(Path directoryPath, String packageName) throws IOException {
        List<Class> classes = new ArrayList<Class>();
        if (!Files.isDirectory(directoryPath)) {
            return classes;
        }

        List<Path> paths = Files.walk(directoryPath).collect(Collectors.toList());
        for (Path path : paths) {
            if (path.toString().endsWith(".class")) {
                try {
                    classes.add(Class.forName(packageName + '.' + path.getFileName().toString().substring(0, path.getFileName().toString().length() - 6)));
                } catch (ClassNotFoundException e) {
                    System.out.println("Classe introuvable : " + path.getFileName().toString() + "\tException : " + e.getMessage());
                }
            }
        }
        return classes;
    }
}
