

public class Interest {

    private double principal_amount,rate_of_interest,time;
    Interest(double principal_amount,double rate_of_interest,double time){
        this.principal_amount=principal_amount;
        this.rate_of_interest=rate_of_interest;
        this.time=time;
    }
    public double simple_interest()
    {
        return (principal_amount * time * rate_of_interest)/100;
    }
    public double compound_interest()
    {
        return principal_amount * Math.pow(1.0+rate_of_interest/100.0,time) - principal_amount;
    }
}