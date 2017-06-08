package com.vidor.model;

/**
 * Created by vichen on 6/5/2017.
 */
public class Github {
    private String login;
    private Integer id;
    private String avatar_url;
    private String gravatar_id;
    private String url;
    private String html_url;
    private String followers_url;
    private String following_url;
    private String gists_url;
    private String starred_url;
    private String subscriptions_url;
    private String organizations_url;
    private String repos_url;
    private String events_url;
    private String received_events_url;
    private String type;
    private boolean site_admin;
    private String name;
    private String company;
    private String blog;
    private String location;
    private String email;
    private String hireable;
    private String bio;
    private Integer public_repos;
    private Integer public_gists;
    private Integer followers;
    private Integer following;
    private String created_at;
    private String updated_at;

    public Github() {
    }

    public Github(String login, Integer id, String avatar_url, String gravatar_id, String url, String html_url, String followers_url, String following_url, String gists_url, String starred_url, String subscriptions_url, String organizations_url, String repos_url, String events_url, String received_events_url, String type, boolean site_admin, String name, String company, String blog, String location, String email, String hireable, String bio, Integer public_repos, Integer public_gists, Integer followers, Integer following, String created_at, String updated_at) {
        this.login = login;
        this.id = id;
        this.avatar_url = avatar_url;
        this.gravatar_id = gravatar_id;
        this.url = url;
        this.html_url = html_url;
        this.followers_url = followers_url;
        this.following_url = following_url;
        this.gists_url = gists_url;
        this.starred_url = starred_url;
        this.subscriptions_url = subscriptions_url;
        this.organizations_url = organizations_url;
        this.repos_url = repos_url;
        this.events_url = events_url;
        this.received_events_url = received_events_url;
        this.type = type;
        this.site_admin = site_admin;
        this.name = name;
        this.company = company;
        this.blog = blog;
        this.location = location;
        this.email = email;
        this.hireable = hireable;
        this.bio = bio;
        this.public_repos = public_repos;
        this.public_gists = public_gists;
        this.followers = followers;
        this.following = following;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public String getLogin() {
        return login;
    }

    public Integer getId() {
        return id;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public String getGravatar_id() {
        return gravatar_id;
    }

    public String getUrl() {
        return url;
    }

    public String getHtml_url() {
        return html_url;
    }

    public String getFollowers_url() {
        return followers_url;
    }

    public String getFollowing_url() {
        return following_url;
    }

    public String getGists_url() {
        return gists_url;
    }

    public String getStarred_url() {
        return starred_url;
    }

    public String getSubscriptions_url() {
        return subscriptions_url;
    }

    public String getOrganizations_url() {
        return organizations_url;
    }

    public String getRepos_url() {
        return repos_url;
    }

    public String getEvents_url() {
        return events_url;
    }

    public String getReceived_events_url() {
        return received_events_url;
    }

    public String getType() {
        return type;
    }

    public boolean isSite_admin() {
        return site_admin;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getBlog() {
        return blog;
    }

    public String getLocation() {
        return location;
    }

    public String getEmail() {
        return email;
    }

    public String getHireable() {
        return hireable;
    }

    public String getBio() {
        return bio;
    }

    public Integer getPublic_repos() {
        return public_repos;
    }

    public Integer getPublic_gists() {
        return public_gists;
    }

    public Integer getFollowers() {
        return followers;
    }

    public Integer getFollowing() {
        return following;
    }

    public String getCreated_at() {
        return created_at;
    }

    public String getUpdated_at() {
        return updated_at;
    }
}
