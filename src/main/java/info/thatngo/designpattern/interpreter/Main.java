package info.thatngo.designpattern.interpreter;

public class Main {

    public static void main(String args[]) {
        String context = "_Int";

        FirstLetterNotUnderScore firstLetterNotUnderScore = new FirstLetterNotUnderScore();
        context = firstLetterNotUnderScore.interpret(context);

        System.out.println(context);
    }
}
