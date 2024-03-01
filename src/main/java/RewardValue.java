public class RewardValue {
    private double cashValue;
    private double milesValue;
    public RewardValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = convertCashToMiles(cashValue);
    }

    public RewardValue(double milesValue, boolean isMiles){
        this.milesValue = milesValue;
        this.cashValue = isMiles ? milesValue * 0.0035 : 0.0;
    }

    public double getCashValue() {
        return cashValue;
    }

    public double getMilesValue(){
        return milesValue;
    }

    private double convertCashToMiles(double cash){
        return cash / 0.0035;
    }
}
