package com.example.zzyzzy.semiprojectv1.board;

import com.example.zzyzzy.semiprojectv1.domain.Board;
import com.example.zzyzzy.semiprojectv1.domain.BoardDTO;
import com.example.zzyzzy.semiprojectv1.domain.BoardListDTO;
import com.example.zzyzzy.semiprojectv1.domain.BoardReplyDTO;
import com.example.zzyzzy.semiprojectv1.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestConstructor;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
@Transactional
@RequiredArgsConstructor
@TestConstructor(autowireMode = TestConstructor.AutowireMode.ALL)
public class BoardServiceTest {

    private final BoardService boardService;

    @Test
    @DisplayName("BoardService readall test")
    public void readAllTest() {
        // Given
        int cpg = 1;  // 현재 페이지가 1일때 게시글들을 읽어옴

        // When
        //List<BoardDTO> results = boardService.readBoard(cpg);
        BoardListDTO results = boardService.readBoard(cpg);

        // Then
        assertNotNull(results);
    }

    @Test
    @DisplayName("BoardService find test")
    public void findTest() {
        // Given
        int cpg = 1;
        String findtype = "title";
        String findkey = "넷플릭스";

        // When
        BoardListDTO results = boardService.findBoard(cpg, findtype, findkey);

        // Then
        assertNotNull(results);
    }

    @Test
    @DisplayName("BoardService countfind test")
    public void countfindTest() {
        // Given
        Map<String, Object> params = new HashMap<>();
        params.put("findtype", "title");
        params.put("findkey", "넷플릭스");

        // When
        int results = boardService.countfindBoard(params);

        // Then
        assertThat(results).isGreaterThan(0);
    }

    @Test
    @DisplayName("BoardService readOne test")
    public void readOneTest() {
        // Given
        int bno = 3000;

        // When
        //Board result = boardService.readOneBoard(bno);
        BoardReplyDTO result = boardService.readOneBoardReply(bno);

        // Then
        assertThat(result).isNotNull();
        assertThat(result.getBd().getUserid()).isNotNull();
    }

}
