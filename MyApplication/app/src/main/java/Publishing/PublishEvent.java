package Publishing;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;

import Entity.Event;

public class PublishEvent {
    static ArrayList<Event> events = new ArrayList<>();

    public static void getEvent(){

        String url = "" ; // add url
        JsonArrayRequest array = new JsonArrayRequest(Request.Method.GET, url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
                for(int i = 0  ; i < response.length(); i ++) {
                    JSONObject json = response.get(i) ;
                    Event event = new Event();
                    event.setCategory(json.get("category")) ;
                    event.setDate(json.get("date")) ;
                    //add the rest of th details after discussing

                     events.add(event) ;

                }

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        }) ;
    }

    public static ArrayList<Event> parsejson() {
        getEvent();
        return events ;
    }
}
