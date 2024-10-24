package com.example.musinsa_clone.test.web.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

public class SizeRequest {


    @Getter
    @Schema(description = "상의 사이즈 입력을 위한 DTO")
    public static class TopSizeRequest{

        @Schema(
                description = "흉곽 사이즈를 입력해주세요",
                format = "string"
        )
        private String chestSize;  // 가슴 사이즈
        @Schema(
                description = "소매길이 사이즈를 입력해주세요",
                format = "string"
        )
        private String sleeveLength;  // 소매 길이


    }
    @Getter
    public static class BottomSizeRequest{

        private String waistSize;  // 허리 사이즈
        private String inseamLength;  // 안쪽 다리 길이

    }

    @Getter
    public static class ShoeSizeRequest{

        private String shoeSize;  // 신발 사이즈

    }
}
