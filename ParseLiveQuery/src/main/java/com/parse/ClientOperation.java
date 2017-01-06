package com.parse;

import org.json.JSONException;
import org.json.JSONObject;

/* package */ abstract class ClientOperation {

     abstract JSONObject getJSONObjectRepresentation() throws JSONException;

     protected JSONObject filterObjectTo(JSONObject object, String... keys) throws JSONException {
          return new JSONObject(object, keys);
     }
}
