import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

class JSONSportsSearchEngine {
    final static String URL = "http://www.sports.ru/search/search.json?query=";

    String search(String query) throws JSONException {
        String id;
        GzipPageParser parser = new GzipPageParser();
        JSONObject object = new JSONObject(parser.getFullPageData(URL, query));

        JSONArray array = object.getJSONArray("suggestions");
        JSONObject first = array.getJSONObject(0);
        id = first.getString("id");
        return id;
    }
}
