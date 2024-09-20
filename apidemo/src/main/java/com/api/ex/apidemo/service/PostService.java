package com.api.ex.apidemo.service;

import com.api.ex.apidemo.payload.PostDto;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface PostService {
    PostDto createPost(PostDto postDto);

    List<PostDto> getAllPosts();

    PostDto getPostById(long id);

    PostDto updatePost(PostDto postDto, Long id);
    void deletePostById(long id);
}
