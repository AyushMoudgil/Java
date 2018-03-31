
import java.io.*;
import java.util.*;
public class FileListing_Driver {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.print("input file");
		String path=sc.nextLine();

File f= new File(path);
FileReader fr = new FileReader(f);
		String path1 = "";
		String path2 = "";
		int c;
		
		
		if(f.exists()) {
			
			while((c=fr.read())!=10) {
				path1 += (char)c;
				
			}
			path1= path1.substring(0,path1.length()-1);
			
			while((c=fr.read())!=-1) {
				path2 += (char)c;
			}
		}
		
		else {
			System.out.println("file does not exist");
		}
		fr.close();
		sc.close();
		
		File f1 = new File(path1);
		ReadPath rp = new ReadPath();
		rp.ReadList(f1);
		
			rp.GenerateCsv(path2);
	}

}
