
package projekat3s.projekat3.s;

import java.io.*;
import java.net.*;

public class Projekat3S {

    public static void main(String[] args) {
            
        int host=3000;
        String odgovor;
        String tacnost;
        int i=0;
        try{
        ServerSocket server=new ServerSocket(host);
        Socket veza=server.accept();
        System.out.println("Veza je uspostavljena");
        DataInputStream dIn=new DataInputStream(veza.getInputStream());
        DataOutputStream dOut=new DataOutputStream(veza.getOutputStream());
        while(true){
        odgovor=dIn.readUTF();
        if(i==0 && "70".equals(odgovor))
        {
            tacnost="1";
            i++;
        }
        else if(i==1 && "400".equals(odgovor))
        {
            tacnost="1";
            i++;
        }
        else if(i==2 && "502".equals(odgovor))
        {
            tacnost="1";
            i++;
        }
        
        else if(i==3 && "535".equals(odgovor))
        {
            tacnost="1";
            i++;
        }
        
        else if(i==4 && "214".equals(odgovor))
        {
            tacnost="1";
            i++;
        }
        else
        {
            tacnost="0";
        }
            
        dOut.writeUTF(tacnost);
        }
        }
        catch(IOException e)
        {
           System.out.println("Nije se napravio ServerSocket!");
        }
        
        
    }
}
