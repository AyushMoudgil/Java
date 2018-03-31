//package Project_1_NihalGaurav;
import java.io.*;
import java.util.*;
public class FileListing_Driver {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.print("input file of the text file");
		String path=sc.nextLine();
		
		//making file of user given path
		File f= new File(path);
		FileReader fr = new FileReader(f);
		String path1 = "";
		String path2 = "";
		int c;
		
		//seperating paths
		if(f.exists()) {
			//catching first path
			while((c=fr.read())!=10) {
				path1 += (char)c;
				
			}
			path1= path1.substring(0,path1.length()-1);
			
			//first path seperated now catching secound path
			while((c=fr.read())!=-1) {
				path2 += (char)c;
			}
		}
		
		//printing error if user enters wrong path
		else {
			System.out.println("file does not exist on given path . please input correct path");
		}
		fr.close();
		sc.close();
		
		//calling function Readlist with the help of object of ReadPath
		File f1 = new File(path1);
		ReadPath rp = new ReadPath();
		rp.ReadList(f1);
		
		//calling function for csv file
		rp.GenerateCsv(path2);
	}

}
