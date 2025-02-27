public class FakeExchange implements Exchange {
    private String API_KEY;

    private final static String US_CURRENCY = "USD";
    private final static String EUR_CURRENCY = "Euro";
    private final static float US_TO_EURO_RATE = 0.96f;

    public FakeExchange(String fakeAPIkey) {
        this.API_KEY = fakeAPIkey;
    }

    @Override
    public float rate(String origin, String target) {
        if (origin.equals(US_CURRENCY)) {
            switch (target){
                case EUR_CURRENCY:
                    return US_TO_EURO_RATE;
                default:
                    return 0;
            }
        } else {
            return 0;
        }
    }
}
