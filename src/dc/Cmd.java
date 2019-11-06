package dc;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

public class Cmd {
public static void main(String []args)throws Exception{
	Process process = Runtime.getRuntime().exec("cmd /c echo %date%&&echo %time%");
	InputStream in = process.getInputStream();
	OutputStream out = process.getOutputStream();
	BufferedReader tBufferedReader = new BufferedReader(new InputStreamReader(in));
	String sTempOneLine;
	while((sTempOneLine = tBufferedReader.readLine()) != null){
		System.out.println(sTempOneLine);
	}
	in.close();
	process.waitFor();
	System.out.print("exit!");
}
}