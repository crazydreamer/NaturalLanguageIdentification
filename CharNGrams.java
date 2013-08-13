import java.io.*;

public class CharNGrams{
	
	private String text;

	public CharNGrams(){
		this.text = "";
	}
	
	public CharNGrams(String filename){
		this.text = "";
		try{
			File file = new File(filename);
			FileReader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(fileReader);
			String line = null;
			while((line = reader.readLine())!=null) text = text + line;
			reader.close();	
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

	public String oneGramsToString(){
		return "TEST";
	}

	public String getFile(){
		return "TEST";
	}
}
