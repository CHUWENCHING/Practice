package com.ohgiraffers.member.sevice;

import com.ohgiraffers.member.mapper.MemberMapper;
import com.ohgiraffers.member.model.dto.MemberDTO;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

import static com.ohgiraffers.member.common.Template.getSqlSession;

public class MemberService {
    public List<MemberDTO> selectAllMenu() {
        SqlSession sqlSession = getSqlSession();
        MemberMapper memberMapper = sqlSession.getMapper(MemberMapper.class);
        List<MemberDTO>memberList = memberMapper.selectAllMember();

        sqlSession.close();
        return memberList;
    }
}
