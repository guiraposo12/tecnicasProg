
/**
 * Escreva uma descrição da classe Heater aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Heater
{
    // variáveis de instância 
    private int min;
    private int temperature;
    private int max;
    private int increment;

    /**
     * Construtor para objetos da classe Heater
     */
    public Heater()
    {
        temperature = 15;   
        increment = 5;
        max = 40;
        min = -10;
    }

    public void warmer()
    {
        if (temperature + increment <= max){
            temperature += increment;   
        }
        else{
            System.out.println("The increment in temperature reaches the max("+max+") value");    
        }
    }
    
    public void cooler()
    {
        if (temperature - increment >= min){
            temperature -= increment;   
        }
        else{
            System.out.println("The increment in temperature reaches the min("+min+") value");    
        }
    }
    
    public int getTemperature()
    {
        return temperature;   
    }
    
    public void setIncrement(int value)
    {
        if (increment >= 0){
            increment = value;   
        }
        else{
            System.out.println("Insert a positive value to increment.");    
        }  
    }
}
