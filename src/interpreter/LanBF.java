/**
 * 
 */
package interpreter;

/**
 * @author Pisce
 *
 */
public class LanBF extends Language{
	
	public String[] BF = {">","<","+","-",".",",","[","]"};
	
	LanBF(){
		setCodes(BF);
		setCodeLen(1);
	}
	
}
