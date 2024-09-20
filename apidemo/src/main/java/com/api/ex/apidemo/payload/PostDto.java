package com.api.ex.apidemo.payload;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PostDto {

    private Long id;

    @NotEmpty
    @Size(min = 2, message = "post title should be at least 2 characters")
    private String title;

    @NotEmpty
    @Size(min = 4, message = "description should be atleast 4 characters")
    private String description;

    @NotEmpty
    @Size(min = 5, message = "post conten should be at least 5 characters")
    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
