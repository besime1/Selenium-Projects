package C009;

import java.io.*;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class _01_ConnectWithPropertiesFile {
    public static void main(String[] args) throws IOException {
        //step 1. Locate  the properties within the project
        // String FilePath = "/Users/Demir/IdeaProjects/SeleniumProject/configs/configuration.properties";

        String filePath = System.getProperty("user.dir") + "/configs/configuration.properties";//-> I am telling system where my file is located.
        FileInputStream fis = new FileInputStream(filePath);
        System.out.println("filePath=" + filePath);

        //FileInputStream fis = new FileInputStream(filePath);// Filepath handler,establish connection stream with my filepath
        Properties properties = new Properties();// properties class is part of the connection establishment ,used to interact with properties
        properties.load(fis);
        //now It's ready to use. we can call any key value pair from the properties file

        String url = properties.getProperty("url");
        System.out.println("url = " + url);

        String browser = properties.getProperty("browser");
        System.out.println("browser = " + browser);
        // getting keys or values, or Both
        System.out.println("---Values Only--");
        Collection<Object> values = properties.values();
        for (Object value : values) {
            System.out.println(value);
        }
        System.out.println("--Keys Only--");
        Set<Object> keys = properties.keySet();
        for (Object key : keys) ;{
        System.out.println(keys);
    }
        System.out.println("---Key & values together");
        Set<Map.Entry<Object, Object>> entries = properties.entrySet();
        for(Map.Entry<Object,Object> entry :entries){
            System.out.println(entry);
        }


    }


}
