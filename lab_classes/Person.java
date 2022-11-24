
/**
 * Escreva uma descri��o da classe Person aqui.
 * 
 * @author (seu nome) 
 * @version (um n�mero da vers�o ou uma data)
 */
public class Person
{
    private String name;
    private String id;

    /**
     * Construtor para objetos da classe Person
     */
    public Person(String name, String id)
    {
        this.name = name;
        this.id = id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void changeName(String replacementName)
    {
        name = replacementName;
    }

    public String getID()
    {
        return id;
    }

}
