package Q1;

public class Temperature {
    private double Celsius;

    public Temperature(){
        this.Celsius = 0.0;
    }
    public Temperature(double Celsius){
        this.Celsius = Celsius;
    }
    public double toFahrenheit(){
        return (Celsius*9/5)+32;

    }
    public double toCelsius(){
        return Celsius;
    }
    public void setCelsius(double Celsius){
        this.Celsius = Celsius;
    }
    public void setFahrenheit(double fahrenheit){
        this.Celsius = (fahrenheit-32)*5/9;
    }

}
