package com.junyharang.mybatis.mybatispagingtest.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Board 글 등록 DTO
 * <pre>
 * <b>History:</b>
 * @author 주니하랑
 * @version 1.0.0, 2022.06.19 최초 작성
 */

@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardWriteRequestDTO {

    private Long id;                // 게시글 고유 번호
    private String title;           // 게시글 제목
    private String contents;        // 게시글 내용

} // class 끝
