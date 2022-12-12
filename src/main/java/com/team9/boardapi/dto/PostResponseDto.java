package com.team9.boardapi.dto;

import com.team9.boardapi.entity.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
public class PostResponseDto {

    // 게시글 단순 조회, 게시글 작성에 사용될 Dto
    private Long id;
    private LocalDateTime createAt;
    private LocalDateTime modifiedAt;
    private String title;
    private String contents;

    public PostResponseDto(Post post) {
        this.id = post.getId();
        this.createAt = post.getCreatedAt();
        this.modifiedAt = post.getModifiedAt();
        this.title = post.getTitle();
        this.contents = post.getContent();
    }

}