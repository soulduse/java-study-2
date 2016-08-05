package study.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * Created by sould on 2016-06-29.
 */
public class StringParser {

    public static void main(String[] args) throws Exception{
        URL url = new URL("http://219.255.217.140:9098/socket/server_socket_info");

        StringBuffer sb = new StringBuffer();
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(url.openStream()));

        String str = null;
        while((str = reader.readLine()) != null){
            sb.append(str);
        }
        System.out.println(sb.toString());
    }
}
