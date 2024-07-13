package pkg109.remotefileexample;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
public class RemoteFileExample 
{    
    public static void main(String[] args) 
    {
        try
        {
            URL url = new URL("https://www.w3.org/TR/2003/REC-PNG-20031110/iso_8859-1.txt");
            HttpURLConnection connection = (HttpURLConnection)url.openConnection();
            InputStream inputStream = connection.getInputStream();
            InputStreamReader streamReader = new InputStreamReader(inputStream);
            char[] buffer = new char[1024];
            StringBuilder builder = new StringBuilder();
            FileOutputStream fileOutputStream = new FileOutputStream("kopyalanan.txt");
            int length = 0;
            while((length = streamReader.read(buffer)) != -1)
            {
                builder.append(Arrays.copyOfRange(buffer, 0, length));
                fileOutputStream.write(new String(Arrays.copyOfRange(buffer, 0, length)).getBytes());
            }
            System.out.println(builder.toString());
        }
        catch (Exception e) 
        {
            e.printStackTrace();
        }  
    }    
}
