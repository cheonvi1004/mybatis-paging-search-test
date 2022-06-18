package com.junyharang.mybatis.mybatispagingtest.service;

import com.junyharang.mybatis.mybatispagingtest.CustomBaseResponse;
import com.junyharang.mybatis.mybatispagingtest.model.dto.request.BoardListSearchDTO;
import com.junyharang.mybatis.mybatispagingtest.model.dto.request.BoardWriteRequestDTO;
import com.junyharang.mybatis.mybatispagingtest.model.vo.BoardResponseVO;
import com.junyharang.mybatis.mybatispagingtest.repository.mapper.MybatisPagingTestMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequiredArgsConstructor
@Service public class MybatisPagingTestServiceImpl implements MybatisPagingTestService{

    private final MybatisPagingTestMapper mybatisPagingTestMapper;

    @Override
    public Long registerBoard(BoardWriteRequestDTO boardWriteRequestDTO) {

        return mybatisPagingTestMapper.registerBoard(boardWriteRequestDTO);

    } // registerBoard(BoardWriteRequestDTO boardWriteRequestDTO) 끝

    @Override
    public List<BoardResponseVO> getPaging(BoardListSearchDTO boardListSearchDTO) {

        return mybatisPagingTestMapper.findByPagingAndSearch(boardListSearchDTO);

    } // getPaging() 끝
} // class 끝
