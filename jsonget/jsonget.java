package sample;//your folder


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

public class jsonget {
    public org.json.simple.parser.JSONParser parser = new org.json.simple.parser.JSONParser();
    JSONArray getA(String src) throws ParseException {
        Object object = parser.parse(src);
        JSONArray arr = (JSONArray) object;
        return arr;
    }
    JSONObject getO(String src) throws ParseException {
        Object object = parser.parse(src);
        JSONObject arr = (JSONObject) object;
        return arr;
    }


}
