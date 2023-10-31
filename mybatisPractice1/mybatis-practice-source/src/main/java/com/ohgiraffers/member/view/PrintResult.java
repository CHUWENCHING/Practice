package com.ohgiraffers.member.view;

import com.ohgiraffers.member.model.dto.MemberDTO;

import java.security.PublicKey;
import java.sql.SQLOutput;
import java.util.List;

public class PrintResult {

    public void printMemberList(List<MemberDTO> memberList) {
        for (MemberDTO member : memberList){
            System.out.println(member);
        }
    }

    public void printErrorMessage(String errorCode) {

        String errorMessage = " ";
        switch(errorCode){
            case "selectList":
                errorMessage = "메뉴 목록 조회를 실패하였습니다.";
                break;
        }
        System.out.println(errorMessage);


    }

    public void PrintMember(MemberDTO member){
        System.out.println(member);
    }
    public void printSuccessMessage(String successCode){
        String successMessage = " ";

        System.out.println(successMessage);
    }




}
