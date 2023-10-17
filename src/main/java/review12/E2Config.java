package review12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E2Config {
    public static void main(String[] args) throws FileNotFoundException {
        String path="C:\\Users\\abdullaaliyev\\IdeaProjects\\Files\\Config.properties";
       //String path= "C:\\Users\\Syntax\\IdeaProjects\\JavaSdetBatch17\\Files\\Config.properties";
     try (FileInputStream fis=new FileInputStream(path)){

         Properties properties=new Properties();
         properties.load(fis);
         System.out.println(properties.getProperty("browser"));

     }catch(IOException io){
         System.out.println("Please check the file that you are trying to read");
     //send an email/report to the team.
//having a backup code like create new file if the one from above path is not found.

     }
     }

    }

//i have one stupid question, did you create that Config.properties?