/**
 * 
 */
package interpreter;

import java.util.ArrayList;

/**
 * @author PiscesXP
 * </br>Problems:
 * 
 * Byte allocate may conflict.
 * No exception prompt.
 * Byte searching is too slow. (simply iterate)
 * 
 */
public class Memory {
	private ArrayList<MemByte> bytes = new ArrayList<MemByte>();
	Memory(){
	}
	
	public void alloMemByte(byte value,int location){
		MemByte membyte = new MemByte(value,location);
		bytes.add(membyte);
	}
	
	public void alloMemByte(int value,int location){
		alloMemByte((byte)value,location);
	}
	
	public void setMemByte(byte value,int location){
		for(MemByte each : bytes){
			if(each.getLocation()==location){
				each.setValue(value);
			}
		}
	}
	
	public void setMemByte(int value,int location){
		setMemByte((byte)value,location);
	}
	
	public void resetMemory(){
		bytes=null;
		bytes = new ArrayList<MemByte>();
	}
	
}

/**
 * @author Pisce
 * @version 
 * 
 */
class MemByte{
	private byte value=0;
	private int location=-1;
	
	MemByte(int location){
		this.location=location;
	}
	
	MemByte(byte value,int location){
		this.value=value;
		this.location=location;
	}
	
	MemByte(int value,int location){
		this((byte)value,location);
	}
	
	public byte getValue(){
		return value;
	}
	
	public int getLocation(){
		return location;
	}
	
	public void setValue(byte value){
		this.value=value;
	}
	
	public void setValue(int value){
		setValue((byte)value);
	}
}

class ByteConflictException extends Exception{
	public ByteConflictException(){
		super("This byte location already existed.");
	}
}
