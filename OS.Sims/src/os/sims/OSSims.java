/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package os.sims;

/**
 *
 * @author APLOMB
 */
public class OSSims {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CPU1 cpu1 = new CPU1();
        
        Memory mem = new Memory();
        
        
        cpu1.addProcess(1,"P1");
               
         System.out.println("updated resources: core1 tred1: " + cpu1.checker(1));
         
         cpu1.addProcess(2, "P2");
         
         System.out.println("updated resources: core1 tred2: " + cpu1.checker(2));
         
         
         System.out.println(cpu1.getMax());
         
         cpu1.delProcess(1,"P1");
         
        System.out.println("updated resources: core1 tred1: " + cpu1.checker(1));
        
          cpu1.delProcess(2, "P2");
          
          System.out.println("updated resources: core1 tred1: " + cpu1.checker(2));
          
        
        //here I want to add if cpu1.checker 1,2,3,4 equal 1, then new processes need to wait till either one free up
        
        
        // here I want to add, if ram and virtual memory is about to be full, new process need to wait
        
        // basically we can loop the add and del process, update memory status and counter, that's it.
        
        
        
        
    }
    
}
