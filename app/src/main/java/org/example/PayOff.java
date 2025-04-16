package org.example;

public class PayOff {
    // enum for the type of payoff  
    public enum OptionsType {
        CALL,
        PUT,
        DOUBLE_DIGITAL
    }

    private OptionsType type;
    private double strike;
    private double strikeUpper;
    private double strikeLower;

    // constructor
    public PayOff(OptionsType type, double strike) {
        this.type = type;
        this.strike = strike;
    }

    public PayOff(double strikeUpper, double strikeLower) {
        this.type = OptionsType.DOUBLE_DIGITAL;
        this.strikeUpper = strikeUpper;
        this.strikeLower = strikeLower;
    }



    public double getPayoff(double spot) {  
        switch (type) {
            case CALL:
                return Math.max(spot - strike, 0);
            case PUT:
                return Math.max(strike - spot, 0);
            case DOUBLE_DIGITAL:
                return spot >= strikeLower && spot <= strikeUpper ? 1 : 0;
            default:
                return 0;
        }
    }

}
