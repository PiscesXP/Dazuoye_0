/**
 * 
 */
package interpreter;

import java.util.ArrayList;

/**
 * @author PiscesXP
 * </br>Record the serial of every char.(no idea if it's necessary)
 */
public class Output {
	private ArrayList<outChar> chars = new ArrayList<outChar>();
	private int serial = 0;
	
	public void outputChar(char c){
		outChar outchar = new outChar(c,serial);
		chars.add(outchar);
		++serial;
	}
	
	public String getOutString(){
		StringBuilder sb = new StringBuilder();
		for(int i=0 ; i<chars.size() ; ++i){
			sb.append(chars.get(i).getChar());
		}
		return sb.toString();
	}
	
}

class outChar{
	private char c;
	private int serial;
	
	outChar(char c,int serial){
		this.c = c;
		this.serial = serial;
	}
	
	public char getChar(){
		return c;
	}
	
	public int getSerial(){
		return serial;
	}
}