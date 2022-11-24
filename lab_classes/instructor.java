
import java.util.ArrayList;

/**
 * Escreva uma descrição da classe instructor aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class instructor extends Person
{
    private String name;
    private String id;
    private ArrayList<Student> student;


    public instructor(String name, String id, Student student)
    {  
       super (name, id);
       student = null;
    }

    public void addStudent(Student student)
    {
        this.student.add(student);
    }
    
    public void removeStudent(Student student)
    {
        this.student.remove(student);
    }
}
