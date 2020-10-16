package info.thatngo.designpattern.command;

public class GUI {

    public static Document document = new Document();

    public static void main(String args[]) {
        Button saveButton = new Button("Save");
        Button printButton = new Button("Print");

        saveButton.click(new SaveCommand(document));
        printButton.click(new PrintCommand(document));
    }
}
