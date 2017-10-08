
import java.util.ArrayList;
/**
 *Programmer: Tyler King<BR>*
 * Student Number: 991429844<BR>*
 *Program:ShipmentOrder.java<BR>*
 *Date:March 22th 2017
 *@version 1.0
 */
public class ShipmentOrder extends Shipment{
/**Order Number**/
private int OrderNumber;
/** Cost Of Insurance**/
private double insuranceCost;
/**Total Cost**/
private double totalCost;
/** Count variable **/
private int count =0;
    /**
     ** Initiates the parameters of Shipment.java as a subclass
     * @param w collects weight value from Main.java and set weight to w
     * @param m collects method value from Main.java and set weight to m
     **/
    public ShipmentOrder(double w, String m) {
        super(w, m);
    }
    /**
     *Calculates Insurance Costs and Total Costs
     **/
private void calculateinsurance(){
    String t = 
    Main.type; //Sets the Type of Insurance based on input from Main.java
    OrderNumber = 
    Main.num;// Set the Order Number based on input from Main.java
    if(t.equalsIgnoreCase("basic")){ //Sets costs for basic insurance
    if(shipping>=0)
        insuranceCost=0.5;
    if(shipping>=10.01)
        insuranceCost=1.5;
    if(shipping>=30.01)
        insuranceCost=2.50;}
    if(t.equalsIgnoreCase("regular")){//Sets costs for regular insurance
    if(shipping>=0)
        insuranceCost=2.45;
    if(shipping>=10.01)
        insuranceCost=3.95;
    if(shipping>=30.01)
        insuranceCost=5.55;}
    totalCost=shipping+insuranceCost;//calculates total cost
}
/**
     * Sets ShipmentOrder objects into ArrayList List in Main.java
     * @param cList Used to set values for ArrayList List in Main.java
     * @return The ShipmentOrder variables to List in Main.java
     **/
public ArrayList<ShipmentOrder> list(ArrayList cList){
    calculateinsurance(); //Initiates CalculateInurance Method
    cList.add(count,OrderNumber);
    cList.add((count+1),weight);
    cList.add((count+2),method);
    cList.add((count+3),shipping);
    cList.add((count+4),insuranceCost);
    cList.add((count+5),totalCost);
    count=count+6;
    return cList; 
}
}
