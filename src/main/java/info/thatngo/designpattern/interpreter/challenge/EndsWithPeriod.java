package info.thatngo.designpattern.interpreter.challenge;

import info.thatngo.designpattern.interpreter.Expression;

public class EndsWithPeriod implements Expression {

    private NoRepeatedWords noRepeatedWords = new NoRepeatedWords();

    @Override
    public String interpret(String context) {
        context = HelperMethods.endsWithPeriod(context);

        return noRepeatedWords.interpret(context);
    }
}
