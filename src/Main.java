import Units.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static ArrayList<BaseUnit> darkTeam = new ArrayList<>();
    static ArrayList<BaseUnit> holyTeam = new ArrayList<>();
    static ArrayList<BaseUnit> allTeam = new ArrayList<>();

    private static String getName() {
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
    }

    public static void main(String[] args) {
        int teamSize = 10;
        int countChar = 7;


        for (int i = 0; i < teamSize; i++) {
            switch (new Random().nextInt(countChar)) {
                case 0:
                    darkTeam.add(new Archer(getName(), i + 1, 1, darkTeam));
                    break;
                case 1:
                    darkTeam.add(new Xbowman(getName(), i + 1, 1, darkTeam));
                    break;
                case 2:
                    darkTeam.add(new Mag(getName(), i + 1, 1, darkTeam));
                    break;
                case 3:
                    darkTeam.add(new Monk(getName(), i + 1, 1, darkTeam));
                    break;
                case 4:
                    darkTeam.add(new Spearman(getName(), i + 1, 1, darkTeam));
                    break;
                case 5:
                    darkTeam.add(new Infantryman(getName(), i + 1, 1, darkTeam));
                    break;
                case 6:
                    darkTeam.add(new Peasant(getName(), i + 1, 1, darkTeam));
                    break;
            }
        }
        for (int i = 0; i < teamSize; i++) {
            switch (new Random().nextInt(countChar)) {
                case 0:
                    holyTeam.add(new Archer(getName(), i + 1, 10, holyTeam));
                    break;
                case 1:
                    holyTeam.add(new Xbowman(getName(), i + 1, 10, holyTeam));
                    break;
                case 2:
                    holyTeam.add(new Mag(getName(), i + 1, 10, holyTeam));
                    break;
                case 3:
                    holyTeam.add(new Monk(getName(), i + 1, 10, holyTeam));
                    break;
                case 4:
                    holyTeam.add(new Spearman(getName(), i + 1, 10, holyTeam));
                    break;
                case 5:
                    holyTeam.add(new Infantryman(getName(), i + 1, 10, holyTeam));
                    break;
                case 6:
                    holyTeam.add(new Peasant(getName(), i + 1, 10, holyTeam));
                    break;
            }
        }
        allTeam.addAll(darkTeam);
        allTeam.addAll(holyTeam);
        allTeam.sort(BaseUnit::compareTo);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            View.view();
            scanner.nextLine();
            for (BaseUnit unit : allTeam) {
                if (holyTeam.contains(unit)) {
                    unit.step(darkTeam);
                } else {
                    unit.step(holyTeam);
                }
            }
        }
    }
}