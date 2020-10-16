package info.thatngo.designpattern.interpreter;

public class NameNotPrimitiveType implements Expression {
    @Override
    public String interpret(String context) {
        if (context.equals("int") || context.equals("boolean")
            || context.equals("double")) {
            context += "1";
        }

        return context;
    }
}
