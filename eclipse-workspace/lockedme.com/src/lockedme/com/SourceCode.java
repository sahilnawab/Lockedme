package lockedme.com;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SourceCode {
	Scanner sc = new Scanner (System.in);
	//Retrieving the file names in an ascending order	
	public void retrive(){
		
		System.out.println("Enter File Path");
		String n = sc.nextLine();
	
		File f = new File(n);
		 String s[] = f.list();
		 if (s!=null){
			 for (int i=0;i<s.length;i++) { System.out.println(s[i]);}
		 }
		 else System.out.println("file not found");
 	}
	public void add(){
			System.out.println("enter file name which you want to created");
			String s1= sc.nextLine();
			File f1= new File(s1);
			try{
				if (f1.exists()==false){
					f1.createNewFile(); // creates new file
					System.out.println("File sucsessfully cratrted");
				}
				else{
					System.out.println("File already exist");
				}
			}
			catch(IOException e){e.printStackTrace();}			
	}	
	public void delete(){
		System.out.println("Enter file name which you want to delete");
		String s2= sc.nextLine();
		File f2 = new File(s2);
		if (f2.exists()==true) 
			{f2.delete();System.out.println("File successfully deleted");}
				else {System.out.println("File does not exist");}
	}
	public void searchfile() {
		Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the file name to search
        System.out.print("Enter the file name to search: ");
        String fileName = sc.nextLine();
        
        // Prompt the user to enter the directory to search in
        System.out.print("Enter the directory to search in: ");
        String directoryPath = sc.nextLine();
        
        // Create a File object for the directory
        File f = new File(directoryPath);

        // Get the list of files in the directory and its subdirectories
        File[] files = f.listFiles();

        // Loop through the files and search for the specified file
        boolean isFound = false;
        try {for (File file : files) {
            if (file.isFile() && file.getName().equals(fileName)) {
                System.out.println("File found: " + file.getAbsolutePath());
                isFound = true;
            
            
                
            }
        }
        }catch(Exception e) {System.out.println(e.getMessage() +" wrong input entered");}
		
	
	
	}
}





