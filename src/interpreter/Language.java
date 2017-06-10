/**
 * 
 */
package interpreter;

/**
 * @author PiscesXP
 *
 */
public class Language {
	
	// must be order the same way of Instruction.
	private String[] codes = null;
	private int codeLength ;
	
	Language(){
	}
	
	public void setCodes(String[] codes){
		this.codes = codes;
	}
	
	public void setCodeLen(int len){
		codeLength = len;
	}
	
	public Instruction getIns(String code){
		if(codes==null)
			return null;
		
		int i=0;
		
		for(; i<code.length() ; ++i){
			if(code.equals(codes[i]))
				break;
		}
		
		switch(i){
		case 0:
			return Instruction.increPointer;
		case 1:
			return Instruction.decrePointer;
		case 2:
			return Instruction.increValue;
		case 3:
			return Instruction.decreValue;
		case 4:
			return Instruction.output;
		case 5:
			return Instruction.input;
		case 6:
			return Instruction.jumpStart;
		case 7:
			return Instruction.jumpEnd;
		}
		
		return null;
	}
}

