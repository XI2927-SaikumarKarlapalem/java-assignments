package assignment;
import java.nio.file.*;
import java.nio.file.Files;
import java.io.File;
import java.io.IOException;
import java.util.stream.*;

public class fileop {
	public static void main(String [] args)
	{
		 long line=0;
		 try {
			Path p= Files.writeString(Files.createTempFile("test","txt"),"hii");
			Path k=Paths.get("C:\\Users\\Saikumar.karlapalem\\OneDrive - Xebia Nederland B.V\\Desktop\\assignment2.txt");
			String msg=Files.readString(p);
				String msg2=Files.readString(k);
             	System.out.println(msg);
             	System.out.println(msg2);
             	//Stream<String> m=msg2.lines();
        		//m.forEach(System.out::println);
        		System.out.println(msg2.lines().count());
			   // Stream<String> line1=Files.("C:\\Users\\Saikumar.karlapalem\\OneDrive - Xebia Nederland B.V\\Desktop\\assignment2.txt").count();
		 }
		 
		 catch (IOException e) {
                  
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		 return;
	}

}
