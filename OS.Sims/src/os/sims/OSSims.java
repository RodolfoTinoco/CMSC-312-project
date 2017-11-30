/**
 * @author Aaron Kim, Aplomb Huang, Fofini
 * CMSC 312 Fall 2017 Project
 * OS simulation
 * This project is to simulate an OS's key components
 * This is the Main class with basic text file input and output.
 * All classes will be under the os.sims package in order to work
 */


package os.sims;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class OSSims {

    public static void main(String[] args) {
        
         // The name of the file to open.
        String str = ""; 
         
        String fileName = str + ".txt";

        // This will reference one line at a time
        String line = null;

        try {
            // FileReader reads text files in the default encoding.
            FileReader fileReader = 
                new FileReader(fileName);

            // Always wrap FileReader in BufferedReader.
            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
               // here is the operation of where we store the information in the line
            }   

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
        
        int n = 0, io = 0, procCycle = 0, ioCycle = 0, cycles = 0;
        
        int procCount = 0;
        
        boolean go = false; boolean flag = false;
        
        CPU1 cpu1 = new CPU1();
        
        Memory mem = new Memory();
        
        
        
        Timer procTime = new Timer();
        
        Timer ioTime = new Timer();
        
        //check system condition before new process is input to the system
        
        if(mem.getRam()>200000){flag = true;}
        
        if (cpu1.getThred() > 8){go = true;}
        
        // this is the input of process cycles, or io cycles
        
        
        if (flag && go)
        { 
            if(procCycle <= cpu1.getThred())
            { n = procCycle;          
            }
            else{n = cpu1.getThred();
           
            }
            cpu1.addProcess(n,"P1");
             procCycle  = procCycle - n;
                
            procCount ++;
        
        if (cpu1.getThred()<= 8) {cpu1.fillNull();procTime.updateTimer(procCount);}
         //else repeat process
        }
         
        //memory and cpu resouurce has already reserved to handle io aka interuupts. so there's no need to check condition to run io.
        ioCycle = cycles;
        
        if(ioCycle >0){ 
        
         if(ioCycle <= cpu1.getThred()){io = ioCycle;}
         else{io = cpu1.getThred(); ioCycle = ioCycle - io;}
         cpu1.io2Process(io, "io1");
         
         cpu1.io4Process(io, "io1"); ioTime.updateTimer(1);
         
         
         }
        
       
         
         
         
         
         
         
    }
    
}
