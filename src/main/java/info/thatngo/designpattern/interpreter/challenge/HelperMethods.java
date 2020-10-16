package info.thatngo.designpattern.interpreter.challenge;

import java.util.Arrays;
import java.util.List;

public class HelperMethods {

    public static String noRepeatedWords(String context) {
        List<String> list = Arrays.asList(context.split(" "));
        int size = list.size() - 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            String word = list.get(i);
            if (!word.equals(list.get(i + 1))) {
                sb.append(word).append(" ");
            }
        }

        sb.append(list.get(size));

        context = sb.toString();

        return context;
    }

    public static String endsWithPeriod(String context) {
        if (!context.endsWith(".")) {
            context = context + ".";
        }

        return context;
    }
}
