///package Project_1_NihalGaurav;
import java.io.*;
import java.util.*;
public class ReadPath {
	ArrayList<String> list = new ArrayList<String>();
	
	//function to read file and folder and save it into list
	public void ReadList(File fl) throws IOException{
		try {
			File[] file;
			file=fl.listFiles();
			
			//reading each element of parent directory
			for(File f: file) {
				if(f.isDirectory()) {
					// if folder found save in list and recursive call
					list.add("Directory :" + f.getAbsolutePath().toString());
					ReadList(f);
				}
				else {
					//if file found put in list
					list.add("  File :" + f.getAbsolutePath().toString());
				}
				
			}
		}
		catch(IOException e){
		      e.printStackTrace();
		}
	}
	public void GenerateCsv(String s) throws IOException{
		try {
			//writing csv file 
			System.out.println(s);
			FileWriter fw= new FileWriter(s);
			for(int i=0; i<list.size();i++) {
				fw.append(list.get(i));
				fw.append(',');
				fw.append("\n");
			}
			System.out.println(".....csv file generated sucessfully.......");
			fw.flush();
			fw.close();
		}
		catch(IOException e){
		      e.printStackTrace();
		}
	}
	
}
 