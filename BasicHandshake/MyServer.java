import java.net.*;
import java.io.*;

class MyServer{

	public static void main(String args[]){
	
	try{
	
	ServerSocket sk = new ServerSocket(4300); // port number 
	System.out.println("Server has started and waiting for client request...");
	Socket s = sk.accept();
	System.out.println(s);
	DataInputStream di = new DataInputStream(s.getInputStream());

	String msg = (String)di.readUTF();
	System.out.println(msg);
	di.close();
	}catch(Exception e)
	{System.out.println(e);}

	
	}


}
