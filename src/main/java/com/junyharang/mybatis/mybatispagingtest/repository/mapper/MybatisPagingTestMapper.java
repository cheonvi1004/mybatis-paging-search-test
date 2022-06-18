package com.junyharang.mybatis.mybatispagingtest.repository.mapper;

import com.junyharang.mybatis.mybatispagingtest.model.dto.request.BoardListSearchDTO;
import com.junyharang.mybatis.mybatispagingtest.model.dto.request.BoardWriteRequestDTO;
import com.junyharang.mybatis.mybatispagingtest.model.vo.BoardResponseVO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Board Test Business Logic
 * <pre>
 * <b>History:</b>
 * @author 주니하랑
 * @version 1.0.0, 2022.06.18 최초 작성 (목록 조회 구현)
 * @version 1.0.1, 2022.06.19 게시글 등록 구현
 */
@Mapper @Repository public interface MybatisPagingTestMapper {

    Long registerBoard(BoardWriteRequestDTO boardWriteRequestDTO);
    List<BoardResponseVO> findByPagingAndSearch(BoardListSearchDTO boardListSearchDTO);

} // interface 끝
