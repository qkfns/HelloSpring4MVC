package qkfns.spring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import qkfns.spring.mvc.dao.MemberDAO04;
import qkfns.spring.mvc.vo.MemberVO;

import java.util.List;

@Service("msrv04")
public class MemberService04 implements MemberService {

    @Autowired
    private MemberDAO04 mdao04;

    // 회원 정보 생성
    public String newMember(MemberVO mvo) {
        String result = "회원데이터 처리중...?!?";
        int cnt = mdao04.insertMember(mvo);
        if(cnt>0) result = "회원가입 완료";

        return result;
    }

    // 회원 정보 수정 (이름,등급,포인트)
    public String modifyMember(MemberVO mvo) {
        String result = "Memberinfo modifying ...?!?";

        int cnt = mdao04.updateMember(mvo);
        if (cnt > 0) result = "Memberinfo modifying completed!!";

        return result;
    }

    // 회원 정보 삭제 (일지매로 조회해서 삭제)
    public String removeMember(String name) {
        String result = "성적데이터 삭제처리중...?!?";

        int cnt = mdao04.deleteMember(name);
        if(cnt > 0) result = "회원정보 삭제완료!";

        return result;
    }


    public List<MemberVO> readMember() {


        return mdao04.selectMember();
    }

    // 회원정보 조회 (아이디로 검색)
    public MemberVO readOneMember(String userid) {

        return mdao04.selectOneMember(userid);
    }
}
