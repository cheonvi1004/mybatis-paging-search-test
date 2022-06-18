package com.junyharang.mybatis.mybatispagingtest.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.junyharang.mybatis.mybatispagingtest.CustomBaseResponse;
import com.junyharang.mybatis.mybatispagingtest.model.dto.request.BoardListSearchDTO;
import com.junyharang.mybatis.mybatispagingtest.model.dto.request.BoardWriteRequestDTO;
import com.junyharang.mybatis.mybatispagingtest.model.vo.BoardResponseVO;
import com.junyharang.mybatis.mybatispagingtest.service.MybatisPagingTestServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Board Test Controller
 * <pre>
 * <b>History:</b>
 * @author 주니하랑
 * @version 1.0.0, 2022.06.18 최초 작성 (목록 조회 구현)
 * @version 1.0.1, 2022.06.19 게시글 등록 구현
 */

@RequiredArgsConstructor
@RequestMapping("/api/junyharang")
@RestController public class MybatisPagingTestController {

    private final MybatisPagingTestServiceImpl mybatisPagingTestService;

    @PostMapping("/board")
    public CustomBaseResponse<Long> registerBoard(BoardWriteRequestDTO boardWriteRequestDTO) {

        return CustomBaseResponse.ok(mybatisPagingTestService.registerBoard(boardWriteRequestDTO));

    } // registerBoard(BoardWriteRequestDTO boardWriteRequestDTO) 끝

    @GetMapping("/board")
    public CustomBaseResponse<PageInfo<BoardResponseVO>> getPaging(BoardListSearchDTO boardListSearchDTO) {

        PageHelper.startPage(boardListSearchDTO);

        return CustomBaseResponse.ok(PageInfo.of(mybatisPagingTestService.getPaging(boardListSearchDTO)));

    } // getPaging() 끝

} // class 끝
