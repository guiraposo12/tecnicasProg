
/**
 * Escreva uma descrição da classe numberp aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class number
{
    /**
     * Construtor para objetos da classe number
     */
    public number(){}

    /**
     * Um exemplo de um método - substitua este comentário pelo seu próprio
     * 
     * @param  y   um exemplo de um parâmetro de método
     * @return     a soma de x e y 
     */
    public boolean isPrime(int n)
    {
        int index = 2;
        boolean found = true;
        
        while (index < n){
            if (n % index == 0){
            found = false;    
            }
            index++;   
        }
        return found;
    }
}
