public class SmartClass extends SimpleClass {

    private String stringValue = "HELLO ANDREI";

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    @Override
    public String toString() {
        return String.format("%s , additional word: %s", super.toString(), stringValue);
    }
}
