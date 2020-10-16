package info.thatngo.designpattern.interpreter.challenge;

import info.thatngo.designpattern.interpreter.Expression;

public class FirstLetterIsUpperCase implements Expression {
    private EndsWithPeriod endsWithPeriod = new EndsWithPeriod();

    @Override
    public String interpret(String context) {
        context = context.substring(0, 1).toUpperCase() + context.substring(1);

        return endsWithPeriod.interpret(context);
    }
}
