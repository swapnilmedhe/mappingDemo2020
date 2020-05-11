package com.swapnil.mappingdemmo.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Posts {
    @Id
    @Column(name="post_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer postId;

    private String title;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable( name="post_tag_details",
            joinColumns = {  @JoinColumn(name = "post_id")},
            inverseJoinColumns ={ @JoinColumn(name = "tag_id")}
            )
    private List<Tags> tagList ;

    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Tags> getTagList() {
        return tagList;
    }

    public void setTagList(List<Tags> tagList) {
        this.tagList = tagList;
    }
}
