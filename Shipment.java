/**
 *Programmer: Tyler King<BR>*
 * Student Number: 991429844<BR>*
 *Program:Shipment.java<BR>*
 *Date:March 22th 2017<BR>
 *@version 1.0
 */
public class Shipment {
    /** Weight  **/
    protected double weight;
    /** Shipping Method  **/
    protected String method;
    /** Shipping Cost  **/
    protected double shipping;
    /**
     * Collects values given by Main.java and calculates the shipping costs
     * @param w collects weight value from Main.java and set weight to w
     * @param m collects method value from Main.java and set weight to m
     **/
    public Shipment(double w, String m){
        weight =w;
        method =m;
        calculate();
    }
    /**
     * calculates shipping cost
     **/
    private void calculate(){
 if(method.equalsIgnoreCase("air")){ //calculates values for air delivery
            if(weight<=10)
                shipping=weight*4;
            if(weight>10&&weight<=20)
                shipping=weight*3;
            if(weight>20)
                shipping=weight*2.5;

        }
 if(method.equalsIgnoreCase("truck")){//calculates values for truck delivery
            if(weight<=10)
                shipping=weight*3;
            if(weight>10&&weight<=20)
                shipping=weight*2.45;
            if(weight>20)
                shipping=weight*1.95;
        }
  if(method.equalsIgnoreCase("mail")){//calculates values for mail delivery
            if(weight<=10)
                shipping=weight*2;
            if(weight>10&&weight<=20)
                shipping=weight*1.75;
            if(weight>20)
                shipping=weight*1.55;
        }
    }
}
