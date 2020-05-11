package com.swapnil.mappingdemmo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Tags {
    @Id
    @Column(name = "tag_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer tagId;

    private String tagName;

    @ManyToMany(cascade = CascadeType.ALL ,mappedBy = "tagList")
    private List<Posts> postlist;


    public Integer getTagId() {
        return tagId;
    }

    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public List<Posts> getPostlist() {
        return postlist;
    }

    public void setPostlist(List<Posts> postlist) {
        this.postlist = postlist;
    }
}
