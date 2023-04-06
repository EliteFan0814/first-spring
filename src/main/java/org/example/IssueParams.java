package org.example;

import java.util.List;

public class IssueParams {

    /**
     * owner : OWNER
     * repo : REPO
     * title : Found a bug
     * body : I'm having a problem with this.
     * assignees : ["octocat"]
     * milestone : 1
     * labels : ["bug"]
     * headers : {"X-GitHub-Api-Version":"2022-11-28"}
     */

    private String owner;
    private String repo;
    private String title;
    private String body;
    private int milestone;
    private HeadersBean headers;
    private List<String> assignees;
    private List<String> labels;

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public int getMilestone() {
        return milestone;
    }

    public void setMilestone(int milestone) {
        this.milestone = milestone;
    }

    public HeadersBean getHeaders() {
        return headers;
    }

    public void setHeaders(HeadersBean headers) {
        this.headers = headers;
    }

    public List<String> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<String> assignees) {
        this.assignees = assignees;
    }

    public List<String> getLabels() {
        return labels;
    }

    public void setLabels(List<String> labels) {
        this.labels = labels;
    }

    public static class HeadersBean {
        /**
         * X-GitHub-Api-Version : 2022-11-28
         */

//        @com.google.gson.annotations.SerializedName("X-GitHub-Api-Version")
        private String XGitHubApiVersion;

        public String getXGitHubApiVersion() {
            return XGitHubApiVersion;
        }

        public void setXGitHubApiVersion(String XGitHubApiVersion) {
            this.XGitHubApiVersion = XGitHubApiVersion;
        }
    }
}
