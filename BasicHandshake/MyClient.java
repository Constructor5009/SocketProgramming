import java.net.*;
import java.io.*;

class MyClient{

	public static void main(String args[]){
	
	try{
	
    Socket s = new Socket("localhost",4300);  // it takes 2 parameters 1) IP address of server and 2) Port number of server.
    System.out.println(s);
    DataOutputStream dos = new DataOutputStream(s.getOutputStream());
    dos.writeUTF("Hello Server How are you?...");

    dos.close();	
    } 
    catch(Exception e){
      System.out.println("Exception has occured!"+e);
      }
	
	
	}

}
