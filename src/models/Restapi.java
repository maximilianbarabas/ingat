/*
* File: Api.java
* Author: Maximilian Barabas
* Copyright: M B 
* Group: Szoft 2 N
* Date: 2023-04-19
* Github: https://github.com/maximilianbarabas
* Licenc: GNU GPL
*/

package models;

public class Restapi {

    public Restapi() {
    }
    
    public String getProperties()
    {
        HttpClient http = new HttpClient();
        String host = "http://localhost:3000/";
        String endpoint = "properties";
        String urlStr = host + endpoint;
        String res = http.get(urlStr);
        return res;
    }
}
