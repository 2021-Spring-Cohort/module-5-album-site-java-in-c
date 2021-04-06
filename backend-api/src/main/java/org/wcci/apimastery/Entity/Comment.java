package org.wcci.apimastery.Entity;

import javax.persistence.Embeddable;

@Embeddable
public class Comment {
    private String body;
    private String name;

    protected Comment(){}

    public Comment(String body, String name) {
        this.body = body;
        this.name = name;
    }

    public String getBody() {
        return body;
    }

    public String getName() {
        return name;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setName(String name) {
        this.name = name;
    }
}
