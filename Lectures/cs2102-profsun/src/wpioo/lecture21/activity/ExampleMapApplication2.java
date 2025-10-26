package wpioo.lecture21.activity;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A class that demonstrates implementing {@link Object#equals(Object)}, {@link Object#hashCode()} and
 * {@link Comparable#compareTo(Object)} for the {@link Student} class before entering the data into a {@link Map}.
 *
 * @author Prof. Yu-Shan "Sami" Sun
 *
 * @version 1.0
 */
public class ExampleMapApplication2 {

    /**
     * The main entry point to the program.
     *
     * @param args
     *            Command line arguments
     */
    public static void main(String[] args) {
        // 1. Make two students objects with the same information.
        System.out.println("----------------------------------------");
        Student first = new Student(1, "John", "john1@wpi.edu");
        Student second = new Student(1, "John", "john1@wpi.edu");
        System.out.println("equals Test: " + first.equals(second));
        System.out.println("compareTo Result: " + first.compareTo(second));
        System.out.println("first's hashCode: " + first.hashCode());
        System.out.println("second's hashCode: " + second.hashCode());

        // 2. Add the items into a map that keeps track of grades
        System.out.println("----------------------------------------");
        Map<Student, Integer> gradesMap = new HashMap<>();
        gradesMap.put(first, 80);
        gradesMap.put(second, 75);
        System.out.println(gradesMap);

        // 3. Create a map with an initial capacity and load factor to populate student grades
        System.out.println("----------------------------------------");
        Map<Student, Integer> gradesMap2 = new HashMap<>(100, 0.75f);

        List<String> hundredGrades = Arrays.asList("Jill", "23", "Holland", "30", "Travis", "66", "Janell", "75",
                "Jeffery", "88", "Tyanna", "52", "Johnna", "45", "Jensen", "62", "Matteo", "61", "Aubree", "57",
                "Caden", "92", "Marques", "37", "Pedro", "24", "Isabella", "16", "Maritza", "85", "Gracelyn", "70",
                "Malka", "59", "Gerald", "4", "Elissa", "2", "Anabel", "93", "Beverly", "79", "Kasey", "48", "Dillan",
                "0", "Agustin", "65", "Benito", "73", "Kristine", "34", "Selene", "36", "Anastacia", "42", "Madilyn",
                "17", "Brooks", "38", "Cordell", "5", "Lauren", "99", "Kalvin", "1", "Ginger", "11", "Loren", "71",
                "Camren", "0", "Ignacio", "26", "Antonio", "69", "Jaden", "20", "Yolanda", "54", "Mckayla", "22",
                "Bilal", "60", "Cameron", "28", "Devan", "32", "Juanita", "72", "Jose", "64", "Xochitl", "50", "Ray",
                "82", "Alonzo", "98", "Shemar", "80", "Nia", "21", "Neha", "35", "Johnny", "95", "Nikhil", "78",
                "Aysha", "8", "Lukas", "87", "Alyssa", "77", "Gideon", "76", "Karley", "25", "Juwan", "91", "Dante",
                "7", "Jacquelin", "18", "Javion", "96", "Debra", "86", "Cathy", "67", "Karina", "97", "Ronan", "46",
                "Hayden", "12", "Stephon", "29", "Thea", "81", "Timmy", "0", "Marshall", "56", "Shirley", "53",
                "Khalil", "44", "Tasha", "9", "Miguelangel", "90", "Hattie", "15", "Abraham", "58", "Yulissa", "83",
                "Tyrone", "13", "Ramiro", "94", "Reese", "89", "Lila", "47", "Laken", "84", "Fredy", "31", "Daylon",
                "27", "Eliza", "43", "Isiah", "19", "Joe", "63", "Warren", "41", "Mauricio", "3", "Macy", "49",
                "Delaney", "68", "Braxton", "0", "Jayden", "55", "Emerson", "39", "Britton", "6", "Yosef", "74",
                "Kerrigan", "40", "Keyonna", "33");
        long id = 1;
        for (int i = 0; i < hundredGrades.size(); i += 2) {
            String name = hundredGrades.get(i);
            int grade = Integer.parseInt(hundredGrades.get(i + 1));
            gradesMap2.put(new Student(id, name, name.toLowerCase() + id + "@wpi.edu"), grade);
            id++;
        }

        System.out.println(gradesMap2);
        System.out.println("----------------------------------------");
    }
}
