import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        NumberExtractionReport numberExtractionReport = new NumberExtractionReport();
        numberExtractionReport.prepareAndSendReport("src/data.txt");
    }
}