package com.ohgiraffers.member.controller;

import com.ohgiraffers.member.model.dto.MemberDTO;
import com.ohgiraffers.member.sevice.MemberService;
import com.ohgiraffers.member.view.PrintResult;

import java.util.List;

public class MemberController {

    private final PrintResult printResult;
    private final MemberService memberService;

    public MemberController() {
        printResult = new PrintResult();
        memberService = new MemberService();
    }


    public void selectAllMember() {
        List<MemberDTO> memberList = memberService.selectAllMenu();

        if(memberList !=null){
            printResult.printMemberList(memberList);
        } else{
            printResult.printErrorMessage("selectList");
        }


    }
}