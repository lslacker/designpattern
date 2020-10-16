package info.thatngo.designpattern.interpreter;

public class FirstLetterNotUnderScore implements Expression {

    private FirstLetterIsLowerCase firstLetterIsLowerCase = new FirstLetterIsLowerCase();

    @Override
    public String interpret(String context) {
        if (context.startsWith("_")) {
            context = context.substring(1);
        }

        return firstLetterIsLowerCase.interpret(context);
    }
}
