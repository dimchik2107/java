import java.net.MalformedURLException;
import java.net.URL;
import java.util.LinkedList;

public class Main {
    public static <var> void main(String[] args) throws MalformedURLException { //throws для обработки исключения MalformedURLException
        URL url = new URL("http://mtuci.ru");

        Crawler parser = new Crawler();
        parser.startParsing(url, 2, 0);

        LinkedList<UrlDepthPair> result = parser.proccessed;

        result.forEach(urlDepthPair -> { //анонимная функция
            System.out.println("URL is " + urlDepthPair.url + " | depth: " + urlDepthPair.depth);   //или
        });               // метод без объявления
    }
}

