package com.vidor.client;

import com.vidor.connector.GithubConnector;
import com.vidor.model.Github;
import feign.Feign;
import feign.codec.Decoder;
import feign.gson.GsonDecoder;
import org.springframework.stereotype.Component;

/**
 * Created by tim on 2017/6/7.
 */
@Component
public class GithubClient{

    public GithubClient() {}

    public GithubConnector getConnector() {
        Decoder decoder = new GsonDecoder();
        return Feign.builder().decoder(decoder).target(GithubConnector.class, "https://api.github.com");
    }


    public Github getAGithubUser(final String username) {
        return getConnector().getAGithubUser(username);
    }
}
