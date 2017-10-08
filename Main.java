import java.text.DecimalFormat;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
/**
 *Programmer: Tyler King<BR>*
 *Student Number: 991429844<BR>*
 *Program:Main<BR>*
 *Date:March 11th 2017<BR>
 *@version 1.0
 */
public class Main extends Application {
    /** Type Of Insurance  **/
    public static String type;
     /** Shipment Number  **/
    public static int num;
    /** Truck Option  **/
    DecimalFormat currency = new DecimalFormat("###,###,##0.00"); 
    /**Sets decimal places**/
    private RadioButton Sair = new RadioButton("Air");
     /** Air Option  **/
    private RadioButton Struck = new RadioButton("Truck");  
     /** Mail Option  **/
    private RadioButton Smail = new RadioButton("Mail");
    /** Basic Option  **/
    private RadioButton Ibasic = new RadioButton("Basic");
    /** Regular Option  **/
    private RadioButton Iregular = new RadioButton("Regular");
     /** Shipment Method  **/
    public String method = new String();
    /** Shipment Weight  **/
    public double weight = 0;
    /** Shipment Options  **/
    private HBox optionsS = new HBox(Sair, Struck, Smail); 
     /** Insurance Options **/
    private HBox optionsI = new HBox(Ibasic, Iregular);
    /** Insurance Group**/
    private ToggleGroup Insurance = new ToggleGroup();
    /** Shipment Group **/
    private ToggleGroup Ship = new ToggleGroup();
     /** information to appear in order **/
    public String Input = new String();
    /** Text area for Weight**/ 
    public TextArea wTxt = new TextArea();
   /** Text area for Order Number**/
    public TextArea oTxt = new TextArea();
    /** Array list used to collect all of the objects**/
    public ArrayList <ShipmentOrder> list = new ArrayList();
    /**displays Order information**/
   public TextArea dis = new TextArea();
     /***Prompts values of Shipment Number, Weight(kg), Method Of Transport
     * and Type of Insurance *
     * Collects vales and sends them to ShipmentOrder *
     * Collects the values set by ShipmentOrder *
     * @param args unused
     **/
    @Override
    public void start(Stage primaryStage) {
    Sair.setToggleGroup(Ship);
    Struck.setToggleGroup(Ship);
    Smail.setToggleGroup(Ship);
    Struck.setSelected(true);
    Ibasic.setToggleGroup(Insurance);
    Iregular.setToggleGroup(Insurance);
    Ibasic.setSelected(true);
   DecimalFormat currency = 
new DecimalFormat("###,###,##0.00"); //Sets the format for any currency value
        ToggleButton Submit = new ToggleButton("Submit");//Used to submit
        //another set of information
        ToggleButton Display = new ToggleButton("Display");
        Label l = new Label("What is the weight of the item in kg?");
        Label l1 = new Label("What is the shipment type?");
        Label l2 = new Label("Would you like basic or regular insurane?");
        Label l3 = new Label("What is the order number?");
        wTxt.setMaxHeight(50);
        wTxt.setMaxWidth(300);
        oTxt.setMaxHeight(50);
        oTxt.setMaxWidth(300);
        VBox Obox = new VBox(l3, oTxt);
        VBox Wbox = new VBox(l, wTxt);
        VBox Sbox = new VBox(l1, optionsS );
        VBox Ibox = new VBox(l2, optionsI);
        primaryStage.setTitle("Shipment Tracker");
        GridPane pane = new GridPane();//setting the layout for the form
        pane.add(Obox,0,0);
        pane.add(Wbox,0,1);
        pane.add(Sbox,0,2);
        pane.add(Ibox,0,3);
        pane.add(Submit,0,4);
        pane.add(Display, 0,5);
        Scene scene = new Scene(pane, 400 ,500);
        primaryStage.setScene(scene);
         scene.getStylesheets().add("css/css.css");
        primaryStage.show();
        Submit.setOnAction(new Set());//adds another set of
        //information to list
        Display.setOnAction(e->{ //displays information in a separate tab
        for(int i=0; i<list.size();){
     Input +="Order Number: " + list.get(i) + "\n";
     Input +="Weight: " + list.get(i+1) + "kg" + "\n";
     Input +="Method of Delivery: " + list.get(i+2)+ "\n";
     Input +="Cost of Shipment: $" + currency.format(list.get(i+3)) + "\n";
     Input+="Cost of insurance: $" + currency.format(list.get(i+4)) + "\n";
     Input+="Total Cost: $" + currency.format(list.get(i+5))+ "\n";
     Input+="____________________ \n";
     i+=6;
      }
        Label head = new Label("Order Information");// sets the title for page
        dis.setText(Input);
        VBox v = new VBox(head, dis);
        Stage s = new Stage();//generates another tab
        Scene sec = new Scene(v);
         sec.getStylesheets().add("css/css.css");
        s.setTitle("Orders");
        s.setScene(sec);
        s.show();});
    }
    /**
     *Sets the values for Insurance and Shipment method based on user input
     **/
    public class Set implements EventHandler<ActionEvent>{
      
        
    public void handle(ActionEvent e){
        num = Integer.parseInt(oTxt.getText());//sets inputed order number
        weight = Double.parseDouble(wTxt.getText());//sets inputed weight
           if(Sair.isSelected()){
               method="air";//sets shipment method to air
           }
           if(Struck.isSelected()){
               method="truck";//sets shipment method to truck
           }
           if(Smail.isSelected()){
               method="mail";//sets shipment method to mail
           }
           if(Ibasic.isSelected()){
               type="basic";//sets insurance to basic
           }
           if(Iregular.isSelected()){
               type="regular";//sets insurance to regular
           }
        ShipmentOrder one =
    new ShipmentOrder(weight, method); //sends Weight and Shipping Method to
    //ShipmentOrder.java
   one.list(list);//Set Shipment Order Objects to ArrayList List
    }
}
    public static void main(String[] args) {
        launch(args);
    }
}
