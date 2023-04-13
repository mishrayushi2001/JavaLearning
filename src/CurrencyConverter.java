import java.sql.SQLOutput;

public class CurrencyConverter {
    // Currency exchange rates of different currencies relative to 1 US dollar
    double[] exchangeRates;
    void setExchangeRates(double[] rates){
        exchangeRates =rates;
    }
    void updateExchangeRates(int arrayIndex, double newValue){
        exchangeRates[arrayIndex] =newValue;
    }
    double getExchangeRate(int arrayIndex){
        return exchangeRates[arrayIndex];
    }
    double ComputeTransferAmount(int arrayIndex,double amount){
        return amount * getExchangeRate(arrayIndex);
    }
    void printCurrencies(){
        System.out.println("\nrupee: "+ exchangeRates[0]);
        System.out.println("dirham: "+exchangeRates[1]);
        System.out.println("real: "+exchangeRates[2]);
        System.out.println("chilean peso: "+exchangeRates[3]);
        System.out.println("mexican_peso: "+exchangeRates[4]);
        System.out.println("yen: "+exchangeRates[5]);
        System.out.println("$australian: "+exchangeRates[exchangeRates.length-1]);
    }
    public static  void main(String[] args){
        CurrencyConverter cc = new CurrencyConverter();

        // Jan 1st
        double[] rates={63.0,3.0,3.0,595.5,18.0,107.0,2.0};
        cc.setExchangeRates(rates);

        cc.printCurrencies();

        rates= new double[]{65.0,3.2,3.0,565.5,18.0,107.0,2.0};
        cc.setExchangeRates(rates);

        cc.printCurrencies();

        cc.updateExchangeRates(0,66.0);
        cc.printCurrencies();

        double amount =cc.ComputeTransferAmount(0,1000);
        System.out.println("\nTransferred Amount: "+amount);
    }
}
