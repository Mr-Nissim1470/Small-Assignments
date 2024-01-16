package num;

public class IntigerBufferYosef {

	private int buffer[];
	
	private int numberOfValues;
	
	IntigerBufferYosef(){
		int BUFFER_SZ = 20;
		buffer = new int [BUFFER_SZ];
		numberOfValues = 0;
	}
	IntigerBufferYosef(int B){
		buffer = new int [B];
		numberOfValues = 0;
	}
	public boolean addRandom() {
		int num = (int) (10+90*Math.random());
		if(numberOfValues<buffer.length) {
		buffer[numberOfValues]=num;
		numberOfValues++;
		return true;
		}
		else 
			return false;
	}
	public int[] getBuffer() {
		return buffer;
	}
	public void setBuffer(int[] buffer) {
		this.buffer = buffer;
	}
	public int getNumberOfValues() {
		return numberOfValues;
	}
	public String printToConsole() {
		String Str = "";
		for(int i = 0;i<buffer.length;i++) {
			if(buffer[i]==0)
				break;
			else {
			Str+=(buffer[i]+" ");
			}	
		}
		return ("The numbers in the array are: \n"+Str);
	}
	
	}
