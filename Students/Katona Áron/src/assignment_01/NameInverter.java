package assignment_01;

import java.util.Arrays;
import java.util.List;

public class NameInverter {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(null, "", "SingleWord", "FirstName LastName", " SingleWord ",
                " FirstName LastName ", "Mr. FirstName LastName", "Mr. Phd. FirstName LastName");
        for (String name : names) {
            System.out.println("\"" + name + "\" inverted is: \"" + invertName(name) + "\"");

        }
    }

    public static String invertName(String name) {
        if (name == null) {
            return null;
        }

        name = name.trim();
        if (name.isEmpty()) {
            return "";
        }
        if (!name.contains(" ")) {
            return name;
        }

        int nameSeparatorIndex = name.lastIndexOf(" ");
        int titleEndIndex = name.lastIndexOf(" ", nameSeparatorIndex - 1);
        StringBuilder sb = new StringBuilder(name.substring(nameSeparatorIndex + 1))
                .append(", ")
                .append(name, titleEndIndex + 1, nameSeparatorIndex);
        if (titleEndIndex > -1) {
            sb.append(" ").append(name, 0, titleEndIndex);
        }
        return sb.toString();
    }
}
