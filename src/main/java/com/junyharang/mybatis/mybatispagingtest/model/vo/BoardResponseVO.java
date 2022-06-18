package com.junyharang.mybatis.mybatispagingtest.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BoardResponseVO {

    private Long id;
    private String title;
    private String contents;

} // class 끝
