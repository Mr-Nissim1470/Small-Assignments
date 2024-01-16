package num;

public class TempatureYosef {
		private double Tempature;
		private String Type;
		
	TempatureYosef(){
		Tempature = 0;
		Type = "Kelvin";
	}
	TempatureYosef(double Temp, String Type){
		this.Tempature=Temp;
		if(Type.contains("K")|Type.contains("k")||
			Type.contains("C")|Type.contains("c")||
			Type.contains("F")|Type.contains("f")) {
			if(Type.contains("K")||Type.contains("k"))
				this.Type = "Kelvin";
			if(Type.contains("C")||Type.contains("c"))
				this.Type = "Celsius";
			if(Type.contains("F")||Type.contains("f"))
				this.Type = "Fahrenheit";
		}
		else
			this.Type = "Kelvin";
		}
	public double getTempature() {
		return Tempature;
	}
	public void setTempature(double tempature) {
		Tempature = tempature;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public double GetCelsius() {
		double Celsius = Tempature;
		switch(Type) {
		case("Fahrenheit"):
			Celsius =  ((double)5/9)*(Tempature-32);
		break;
		case("Kelvin"):
			Celsius = Tempature-237;
		break;
	}
		return Celsius;
	}
	public double GetFahrenheit() {
		double Fahrenheit = Tempature;
		switch(Type) {
		case("Kelvin"):
			 Fahrenheit = (((double)9/5)*(Tempature-273))+32;
		break;
		case("Celsius"):
			 Fahrenheit = (((double)9/5)*(Tempature))+32;
		break;
		}
		return Fahrenheit;
	}
	public double GetKelvin() {
		double Kelvin  =Tempature;
		switch(Type) {
		case("Fahrenheit"):
			 Kelvin = ((double)5/9)*(Tempature-32)+273;
		break;
		case("Celsius"):
			Kelvin = (Tempature+273);
		break;
		}
		return Kelvin;
	}
	public String toString() {
		String Stat = "";
		Stat+=Tempature+" "+Type+ " \n"+ "In Fahrenheit is: "+GetFahrenheit()+"\n"
				+ " In Celsius is: "+GetCelsius()+"\n"
						+ "In Kelvin is: "+GetKelvin()+"\n";
		return Stat;
	}
	}
