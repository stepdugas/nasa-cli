package org.example.service;

import org.example.model.NEOFeedResponse;
import org.springframework.web.client.RestTemplate;

public class NEOService {

    private RestTemplate template = new RestTemplate();

    private final String API_URL = "https://api.nasa.gov/neo/rest/v1/feed";

    private final String API_KEY="zZivW7pkLpcxbS9pKu0yXDm4Tf0uiVavQzpDaXqs";

    public NEOFeedResponse getNEODate(String date){
        String url = API_URL +
                "?start_date=" + date +
                "&end_date=" + date +
                "&api_key=" + API_KEY;
//        String response = template.getForObject(url, String.class).toString();
//        System.out.println(response);

        NEOFeedResponse response = template.getForObject(url, NEOFeedResponse.class);
        return response;

    }



}
