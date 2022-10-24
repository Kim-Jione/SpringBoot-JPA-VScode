package site.metacoding.white.dto;

import lombok.Getter;
import lombok.Setter;
import site.metacoding.white.domain.User;

public class BoardReqDto {

    @Setter
    @Getter
    public static class BoardSaveDto {
        private String title;
        private String content;
        private User user; // 서비스 로직
    }

    // DTO는 여기다가 추가로
}