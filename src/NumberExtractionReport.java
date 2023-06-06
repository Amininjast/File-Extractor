import java.util.regex.Pattern;

public class NumberExtractionReport extends ExtractionReport {
    private static final Pattern PATTERN = Pattern.compile("^[0-9]*$");

    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "PhoneNumbers";
    }

    @Override
    public String clean(String input) {
        return input;
    }
}
