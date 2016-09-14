import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

        JSONParser parser = new JSONParser();
        Object obj = parser.parse(ss); //String
        JSONObject objj = (JSONObject) obj;
        String name = (String) objj.get("name");
        JSONArray Ars = (JSONArray) (objj.get("files")).get(1);
