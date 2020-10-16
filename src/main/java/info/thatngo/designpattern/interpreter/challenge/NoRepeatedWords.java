package info.thatngo.designpattern.interpreter.challenge;

import info.thatngo.designpattern.interpreter.Expression;

public class NoRepeatedWords implements Expression {

    @Override
    public String interpret(String context) {
        return HelperMethods.noRepeatedWords(context);
    }
}
