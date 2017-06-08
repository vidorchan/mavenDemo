package com.vidor.client;

/**
 * Created by tim on 2017/6/7.
 */
public class GitHubClientError extends RuntimeException {

    private String message; // parsed from json

    @Override
    public String getMessage() {
        return message;
    }
}
