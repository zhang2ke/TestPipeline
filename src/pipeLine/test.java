package pipeLine;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;


public class test {

	public static void main(String[] args){
		// TODO Auto-generated method stub			
		try{
			File file = new File("D:/output.log");
			if(!file.exists())
				file.createNewFile();
			FileWriter writer = new FileWriter(file);
			
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			System.out.println(df.format(new Date()));
			
			String content = df.format(new Date()) + " Write first word!";
			writer.write(content);
			writer.close();		
			
		}
		catch(IOException e){
			e.printStackTrace();
		}		
	}

}
