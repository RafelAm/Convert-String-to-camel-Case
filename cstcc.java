import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void testSomeUnderscoreLowerStart() {
      String input = "the_Stealth_Warrior";
      System.out.println("input: "+input);      
      assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }
    @Test
    public void testSomeDashLowerStart() {
      String input = "the-Stealth-Warrior";
      System.out.println("input: "+input);      
      assertEquals("theStealthWarrior", Solution.toCamelCase(input));
    }
}


import java.lang.StringBuilder;
class Solution{

  static String toCamelCase(String s){
    
    
    // Variable string vacía para sumar los arrays separados por split
    String sepr = "";
    // Java util que nos permite modificar de muchas más maneras los Strings
      String[] sep = new String[s.length()];
      StringBuilder s1 = new StringBuilder();
  // Recorre la variable s coge cada caracter después de la _ o - y lo convierte en mayúsculas
      for(int j = 0; j < s.length();j++){
        s1.append(s.charAt(j));
          if(s.charAt(j) == '_' || s.charAt(j) == '-'){
            s1.append(Character.toUpperCase(s.charAt(j + 1)));
            j++;
          }
      }
    // Separa s1 si tiene _ o - 
      sep = s1.toString().split("_|-");
    // recorre y suma todos los valores que se han separado
      for(int i = 0;i < sep.length;i++){
      
      sepr +=  sep[i].toString();
      
      }
      return sepr;
  }
}
