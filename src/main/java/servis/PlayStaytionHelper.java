package servis;

import model.challeng.Challeng;
import model.challeng.FirstChalleng;
import model.challeng.SecundChalleng;
import model.challeng.ThirdChalleng;

import java.util.Random;
import java.util.function.Predicate;
import java.util.logging.Level;

public class PlayStaytionHelper {
    public static Challeng randomChalleng() {
        randomChalleng().action();
        Random random = new Random();
        int i = random.nextInt(1, 5);
        return switch (i) {
            case 1, 2 -> new FirstChalleng();
            case 3, 5 -> new ThirdChalleng();
            case 4 -> new SecundChalleng();
            default -> throw new IllegalStateException("Unexpected value: " + i);
        };

    }

    public static Level randomLevel() {
        return null;
    }

    public static Predicate<Challeng> getFilterChalleng(String challeng) {
        switch (challeng) {
            case "FirstChalleng" -> {
                return x -> x instanceof FirstChalleng;
            }
            case "SecundChalleng" -> {
                return x -> x instanceof FirstChalleng;
            }
            case "ThirdChalleng" -> {
                return x -> x instanceof SecundChalleng;
            }
            default -> {
                return x -> x instanceof ThirdChalleng;
            }
        }
    }


    public static String getChallengName(String challeng) {
        return switch (challeng) {
            case "ThirdChalleng" -> "SecundChalleng";
            case "SecundChalleng" -> "FirstChalleng";
            default -> "";

        };
    }


}
