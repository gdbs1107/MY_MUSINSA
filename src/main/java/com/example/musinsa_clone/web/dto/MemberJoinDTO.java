package com.example.musinsa_clone.web.dto;

import com.example.musinsa_clone.domain.enumClass.Gender;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

public class MemberJoinDTO {

    @Getter
    @Schema(description = "회원가입 요청 RequestBody 입니다")
    public static class JoinRequestDTO{

        /* 회원 약관 동의 */
        @Schema(
                description = "나이약관 동의 여부 체크",
                format = "Boolean"
        )
        Boolean ageAgree;

        @Schema(
                description = "무신사약관 동의 여부 체크",
                format = "Boolean"
        )
        Boolean musinsaAgree;

        @Schema(
                description = "광고 동의약관 동의 여부 체크",
                format = "Boolean"
        )
        Boolean adAgree;

        @Schema(
                description = "마케팅 광고약관 동의 여부 체크",
                format = "Boolean"
        )
        Boolean marketingAgree;

        /* 회원 가입 정보 */
        @Schema(
                description = "회원 ID로서 사용되는 username입니다",
                format = "String"
        )
        String username;

        @Schema(
                description = "회원 비밀번호 입니다.<br>"+
                "DB에는 해싱작업이 되어 입력 됩니다",
                format = "String"
        )
        String password;

        @Schema(
                description = "회원 실명입니다",
                format = "String"
        )
        String name;

        @Schema(
                description = "회원의 전화번호입니다",
                format = "String"
        )
        String phoneNumber;

        @Schema(
                description = "회원의 email입니다<br>"+
                "형식에 맞지 않으면 회원가입이 반려됩니다",
                format = "String"
        )
        String email;

        @Schema(
                description = "회원 생년월일입니다",
                format = "LocalDate"
        )
        LocalDate birthDate;

        //성별은 추후 수정 예정
        @Schema(
                description = "회원의 성별입니다",
                format = "Gender Enum타입입니다"
        )
        Gender gender;


    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    @Schema(description = "회원가입 응답 RequestBody 입니다")
    public static class JoinResponseDTO{

        @Schema(
                description = "반환된 회원 Id입니다",
                format = "Long"
        )
        Long memberId;

    }
}
