package com.example.musinsa_clone.web;

import com.example.musinsa_clone.api.ApiResponse;
import com.example.musinsa_clone.test.web.dto.SizeRequest;
import com.example.musinsa_clone.web.dto.MemberJoinDTO;
import com.example.musinsa_clone.web.dto.MemberUpdateDTO;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/members")
public class MemberController {

    //회원가입
    @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200",description = "회원가입 응답",
            content = @Content(schema = @Schema(implementation = MemberJoinDTO.JoinResponseDTO.class)))
    @PostMapping("/join")
    public void join(@RequestBody MemberJoinDTO.JoinRequestDTO request) {
    }


    //회원정보 수정
    @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200",description = "회원가입 응답",
            content = @Content(schema = @Schema(implementation = MemberJoinDTO.JoinResponseDTO.class)))
    @PutMapping("/")
    public void updateUser(@RequestBody MemberUpdateDTO.MemberUpdateRequestDTO request){

    }

    //회원탈퇴

    //회원조회


}
