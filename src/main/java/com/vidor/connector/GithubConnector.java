package com.vidor.connector;

import com.vidor.client.GitHubErrorDecoder;
import com.vidor.model.Github;
import feign.*;
import feign.codec.Decoder;
import feign.codec.ErrorDecoder;
import feign.gson.GsonDecoder;

/**
 * Created by tim on 2017/6/7.
 */
public interface GithubConnector {

    @Headers({"Content-type: application/json"})
    @RequestLine("GET /users/{user}")
    Github getAGithubUser(@Param("user") final String username);

}
