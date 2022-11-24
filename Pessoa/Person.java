
/**
 * Escreva uma descrição da classe Person aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Person
{
    // campo da idade
    private int egage;
    // campo do nome
    private String egname;

    /**
     * Construtor para objetos da classe Person
     */
    public Person(int age)
    {
        egage = age;
        egname = "";
    }
    
    public void insertName(String name)
    {
        egname = name;
    }
    
    public void printPerson()
    {
        System.out.println("#########################");
        System.out.println("# Description of Person: #");
        System.out.println("The name of this person is: "+ egname + ";");
        System.out.println("The age of this person is: "+ egage + ".");
        System.out.println("#########################");
        System.out.println();
    }

}
