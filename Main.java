//Elena Voinu

public class Main {

    public static void main(String[] args) {

        //method call with the parameters 6 and 10
        calcFeetAndInchesToCentimeters(6, 10);
        calcFeetAndInchesToCentimeters(100);
   }

    //method that converts feet to inches
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){

        if(feet <0 || inches <0 || inches >12) {
            System.out.println("Invalid parameters");
            return -1;
        }
        //feet to inches conversion
        double cm = (feet * 12) * 2.54;
        cm += inches * 2.54;
        System.out.println(feet + " feet " + inches + " inches = " + cm + "cm");
        return cm;

        }// end calcFeet method

    // method overloadin with one parameter
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid parameters");
            return -1;
        }
        double feet = (int) inches/12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches +"inches= " + feet + "feet" + remainingInches + "inches");
        return  calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

}


