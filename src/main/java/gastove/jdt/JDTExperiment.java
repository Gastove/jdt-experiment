package gastove.jdt;

public class JDTExperiment {

    boolean wasInitialized;

    public JDTExperiment() {
        this.wasInitialized = true;
    }

    public int doSomeThings(String val, long diffVal) throws RuntimeException {
        return val + diffVal;
    }
}
