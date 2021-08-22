package da2;
import java.io.File;
import java.io.FilenameFilter;
public class ques_2 {
    public static void main(String args[]){
        File folder=new File("C:/Users/DELL/Desktop/java lab assignments/");
        FilenameFilter txtFileFilter = new FilenameFilter(){
            @Override
            public boolean accept(File dir, String name)
            {
                if(name.endsWith(".pdf") || name.endsWith(".docx"))
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        };
        File[] files = folder.listFiles(txtFileFilter);
        for (File file : files)
        {
            System.out.println(file.getName());
        }
        if(folder.canWrite())
        {
            System.out.println(folder.getAbsolutePath() + " can write.\n");
        }
        else
        {
            System.out.println(folder.getAbsolutePath() + " cannot write.\n");
        }
        if(folder.canRead())
        {
            System.out.println(folder.getAbsolutePath() + " can read.\n");
        }
        else
        {
            System.out.println(folder.getAbsolutePath() + " cannot read.\n");
        }
    }
}
