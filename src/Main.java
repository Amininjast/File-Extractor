import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "src/data.txt";
        NumberExtractionReport numberExtractionReport = new NumberExtractionReport();
        numberExtractionReport.prepareAndSendReport(path);

        EmailExtractionReport emailExtractionReport = new EmailExtractionReport();
        emailExtractionReport.prepareAndSendReport(path);
    }
}