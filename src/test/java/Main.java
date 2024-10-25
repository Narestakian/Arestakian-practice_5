public class Main {
    public static void main (String[] args){
        System.out.println("Task1");
        isEven check = new isEven();
        check.isEven(4);
        check.isEven(7);
        System.out.println("Task2");
        findLargest largest = new findLargest();
        largest.findLargest(5,12,9);
        System.out.println("Task3");
        calculateArea Area = new calculateArea();
        Area.calculateArea(5.5,4.0);
        System.out.println("Task4");
        greet greet = new greet();
        greet.greet();
        greet.greet("Alice");
        System.out.println("Task5");
        ConvertToCelsius Convert = new ConvertToCelsius();
        double  CelsiusTemperature = Convert.ConvertToCelsius(98.6);
        System.out.println(CelsiusTemperature);



    }
}
