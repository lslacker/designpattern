package info.thatngo.designpattern.chainofresponsiblity;

public class SpreadsheetHandler extends DocumentHandler {

    public SpreadsheetHandler(DocumentHandler handler) {
        super(handler);
    }

    public void openDocument(String fileExtension) {
        if (fileExtension.equals("xlsx")) {
            System.out.println("Opening excel document...");
        } else {
            super.openDocument(fileExtension);
        }
    }
}
