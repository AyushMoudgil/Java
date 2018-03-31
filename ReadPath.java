
import java.io.*;
import java.util.*;
public class ReadPath {
	ArrayList<String> list = new ArrayList<String>();

	public void ReadList(File fl) throws IOException{
		try {
			File[] file;
			file=fl.listFiles();
	for(File f: file) {
				if(f.isDirectory()) {
					list.add("Directory :" + f.getAbsolutePath().toString());
					ReadList(f);
				}
				else {
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
			
			System.out.println(s);
			FileWriter fw= new FileWriter(s);
			for(int i=0; i<list.size();i++) {
				fw.append(list.get(i));
				fw.append(',');
				fw.append("\n");
			}
			System.out.println("file made");
			fw.flush();
			fw.close();
		}
		catch(IOException e){
		      e.printStackTrace();
		}
	}
	
}
 