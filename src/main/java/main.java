import org.json.JSONException;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by UseR7 on 27.10.2016.
 */
public class main {
    public static void main(String[] args) throws IOException, JSONException {
        HTMLSportsParser parser = new HTMLSportsParser();
        for (String s:parser.getNews("Роберт Левандовски")){
            System.out.println(s);
        }
    }
}
