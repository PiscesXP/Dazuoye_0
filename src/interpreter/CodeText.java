/**
 * 
 */
package interpreter;

import java.util.ArrayList;

/**
 * @author Pisce
 *
 */
public class CodeText {
	private String text=null;
	private ArrayList<Instruction> ins = new ArrayList<Instruction>();
	private Language language = null;
	
	public void setText(String text){
		this.text=text;
	}
	
	public void setLanguage(Languages lan){
		if(lan.equals(Languages.BF))
			language = new LanBF();
		else
			language = new LanOOK();
	}
	
	public Instruction translate(){
		
		return null;
	}
	
}