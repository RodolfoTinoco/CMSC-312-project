import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JFrame;

import java.util.StringTokenizer;

import java.awt.GridLayout;
import java.awt.FlowLayout;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class InputReader
{
	private String 	namProcess;
	private String 	locality;
	private String 	priorityLevel;
	private int 	memoryRequired;
	private String 	unitStorage;
	private int 	numCycles;

	//private InputReader next;

	public InputReader()
	{
		this.namProcess = "";
		this.locality = "";
		this.priorityLevel = ""
		this.memoryRequired = 0;
		this.unitStorage = "";
		this.numCycles = 0;
	}

	public InputReader(String data)
	{
		StringTokenizer st = new StringTokenizer(data,"_");

		this.namProcess 	= st.nextToken();
		this.locality	 	= st.nextToken();
		this.priorityLevel  = st.nextToken();
		this.memoryRequired = Integer.parseInt(st.nextToken());
		this.unitStorage	= st.nextToken();
		this.numCycles 		= Integer.parseInt(st.nextToken());
	}

	//Accesors
	public String getNamProccess(){
		return this.namProcess;
	}

	public String getLocality(){
		return this.locality;
	}

	public String getPriorityLevel(){
		return this.priorityLevel;
	}

	public int getMemoryRequired(){
		return this.memoryRequired;
	}

	public String getUnitStored(){
		return this.unitStorage;
	}
	
	public int getNumCycles(){
		return this.numCycles;
	}

	//Mutators
	public void setNamProcess(String naPro){
		this.namProcess = naPro;
	}

	public void setLocality(String givenlocal){
		this.locality = givenlocal;
	}

	public void setPriorityLevel(String prioLev){
		this.priorityLevel = prioLev;
	}

	public void setMemoryRequiered(int memReq){
		this.memoryRequired = memReq;
	}

	public void setUnitStored(String uniStore){
		this.unitStorage = uniStore;
	}

	public void setNumCycles(String numCy){
		this.numCycles = numCy;
	}


	public String toString(){
		return this.namProcess+"_"+this.locality+"_"+this.priorityLevel+"_"+this.memoryRequired+"_"+this.unitStorage+"_"+this.numCycles;
	}
}