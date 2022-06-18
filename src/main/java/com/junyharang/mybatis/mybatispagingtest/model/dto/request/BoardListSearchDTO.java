package com.junyharang.mybatis.mybatispagingtest.model.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Board 목록 조회 DTO
 * <pre>
 * <b>History:</b>
 * @author 주니하랑
 * @version 1.0.0, 2022.06.18 최초 작성
 */

@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardListSearchDTO {

    private int pageNum;                // 이용자 위치 Page 번호
    private int pageSize;               // 한 Page 당 출력될 게시글 개수
    private String searchType;          // 검색 시 입력될 Type
    private String searchContent;       // 검색 시 입력될 검색어

} // class 끝
