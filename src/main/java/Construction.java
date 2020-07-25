

public class Construction{
    boolean automated;
    String material;
    double area;
    double total_cost=0.0;
    public Construction(boolean b,String s,double n){
        automated=b;
        material=s;
        area=n;
    }
    public double construction_cost()
    {
        if (automated == false) {
            if (material == "standard") {
                total_cost = 1200 * area;
            } else if (material == "above_standard") {
                total_cost = 1500 * area;
            } else if (material == "high_standard") {
                total_cost = 1800 * area;
            }
        } else if (automated) {
            total_cost = 2500 * area;
        }

        return total_cost;

    }
}