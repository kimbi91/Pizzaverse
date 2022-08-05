package app.pizzaverse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class PizzaverseApplication {

    public static void main(String[] args) {
        if (checkEnvs()) {
            SpringApplication.run(PizzaverseApplication.class, args);
        }
    }

    private static boolean checkEnvs() {
        List<String> missingEnvs = findMissingEnvs("DB_URL", "DB_USERNAME", "DB_PASSWORD");

        if (missingEnvs.size() == 0) {
            return true;
        }

        askForEnvs(missingEnvs);
        return false;
    }

    private static List<String> findMissingEnvs(String... neededEnvs) {
        List<String> missingEnvs = new ArrayList<>();

        for (String env : neededEnvs) {
            if (System.getenv(env) == null) {
                missingEnvs.add(env);
            }
        }

        return missingEnvs;
    }

    private static void askForEnvs(List<String> missingEnvs) {
        String red = "\u001B[31m";
        String def = "\u001B[0m";
        System.out.println(red + "The application failed to run because some environment variables are missed:");

        for (String env : missingEnvs) {
            System.out.println("\t" + env);
        }

        System.out.println("Please set them before running the application!");
        System.out.println("You can set them in IntelliJ: Run > Edit Configurations... " +
                "> Environment > Environment variables" + def);
    }

}
