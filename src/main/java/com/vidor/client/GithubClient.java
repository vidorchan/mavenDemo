package com.vidor.client;

import com.vidor.connector.GithubConnector;
import com.vidor.model.Github;
import feign.Feign;
import feign.Logger;
import feign.Request;
import feign.codec.Decoder;
import feign.gson.GsonDecoder;
import org.springframework.stereotype.Component;
import com.netflix.hystrix.exception.HystrixRuntimeException;

/**
 * Created by tim on 2017/6/7.
 */
@Component
public class GithubClient{

    public GithubClient() {}

    private static final int connectTimeout = 5000;
    private static final int readTimeout = 5000;

    public GithubConnector getConnector() {
        Decoder decoder = new GsonDecoder();
        return Feign.builder()
               .decoder(decoder)
               .errorDecoder(new GitHubErrorDecoder(decoder))
               .logger(new Logger.ErrorLogger())
               .logLevel(Logger.Level.FULL)
               .options(new Request.Options(connectTimeout, readTimeout))
               .target(GithubConnector.class, "https://api.github.com");
    }

    public Github getAGithubUser(final String username) {
        try {
            return getConnector().getAGithubUser(username);
        } catch (GitHubClientError e) {
            System.out.println(e.getMessage());
            return new Github();
        } catch (HystrixRuntimeException e) {
            System.out.println(e.getMessage());
            return new Github();
        }
    }
}
