package com.vidor.service;

import com.vidor.client.GithubClient;
import com.vidor.model.Github;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by vichen on 6/5/2017.
 */
@Service
public class GithubService {

    private final GithubClient githubClient;

    @Autowired
    public GithubService(GithubClient githubClient) {
        this.githubClient = githubClient;
    }

    public Github findAGithubUser(final String username) {
        return githubClient.getAGithubUser(username);
    }

}
