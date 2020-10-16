package info.thatngo.designpattern.interpreter.challenge;

import info.thatngo.designpattern.interpreter.FirstLetterNotUnderScore;

public class Main {

    public static void main(String args[]) {
        String context = "this is a a sentence";
        // first word is title case
        // no repeat
        // end with period

        FirstLetterIsUpperCase firstLetterIsUpperCase = new FirstLetterIsUpperCase();
        context = firstLetterIsUpperCase.interpret(context);

        System.out.println(context);
    }
}
