package servlet;
/**
 * 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * @author nahin_alam
 *
 */
public class Voter {
	public final static String FILE_NAME = "voter.txt";
	/**
	 * @param args
	 */
	int id = 0;
	public Voter(int id){this.id = id;	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public int getId(){
		return id ;
	}
	
	public static boolean isVoter(int id ) throws IOException{
		Voter voter = new Voter(id);
		if(voter.checkID(id) == true ){
			return false;
		}
		else {
			voter.addVoter(id);
			return true;
		}
	}
	
	public boolean checkID(int id) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(new File (FILE_NAME));

		while(scanner.hasNextLine())
		{ 
			String line = scanner.nextLine();
			System.out.println(line); 
		    if(line.contains(String.valueOf(id)))
		    {
		    	scanner.close();
		         return true; 
		    }
		}
		scanner.close();
		return false;
	}

	public void addVoter(int id) throws IOException{
		File file = new File (FILE_NAME); 
		if(!file.exists()){
			//FileWriter file = new FileWriter(FILE_NAME); 
			//file.write(State.randomState().toString() + id);
			file.createNewFile(); //cShell.Currentpath,FILE_NAME);
		}
		FileWriter fw = new FileWriter(file, true);
		fw.write("\n");
		fw.write(State.randomState().toString() + id);
		fw.close();
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Voter v = new Voter(88);
		//v.addVoter(12);
		if(v.checkID(20)){
			System.out.println("there ");
		}
		else {
			System.out.println("not there");
		}

	}

}
