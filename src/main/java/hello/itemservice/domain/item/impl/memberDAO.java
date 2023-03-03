package hello.itemservice.domain.item.impl;


import hello.itemservice.domain.item.Member;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class memberDAO {

    @Autowired
    SqlSessionTemplate sqlSession;

    // CRUD 기능의 메소드 구현
    // 글 등록
    public String insertBoard(Member vo) {
        Map<String, Object> param = new HashMap<>();
        param.put("NO", vo.getMember_No());
        param.put("ID", vo.getMember_Id());
        param.put("PWD", vo.getMember_Pwd());
        param.put("ADDRESS", vo.getMember_Address());
        param.put("EMAIL", vo.getMember_Email());
        param.put("PHONE", vo.getMember_Phone());
        param.put("NAME", vo.getMember_Name());
        param.put("GRADE", vo.getMember_Grade());
        param.put("DATE", vo.getMember_Date());
        System.out.println("===> Spring JDBC로 insertBoard() 기능 처리");
        sqlSession.insert("mem.insertmem", param);
        return param.get("ID_num").toString();
    }

    // 글 수정
    public void updateBoard(Member vo) {

        Map<String, Object> param = new HashMap<>();
        param.put("ID", vo.getMember_Id());
        param.put("PWD", vo.getMember_Pwd());
        param.put("ADDRESS", vo.getMember_Address());
        param.put("EMAIL", vo.getMember_Email());
        param.put("PHONE", vo.getMember_Phone());
        param.put("NAME", vo.getMember_Name());

        System.out.println(vo.getMember_Id());
        System.out.println(vo.getMember_Pwd());
        System.out.println(vo.getMember_Address());
        System.out.println(vo.getMember_Email());
        System.out.println(vo.getMember_Phone());
        System.out.println(vo.getMember_Name());

        System.out.println("===> Spring JDBC로 updateBoard() 기능 처리");
        sqlSession.update("mem.updatemem", param);
    }

    // 글 삭제
    public void deleteBoard(Long member_No) {
        Map<String, Object> param = new HashMap<>();
        param.put("NO", member_No);
        System.out.println("===> Spring JDBC로 deleteBoard() 기능 처리");
        sqlSession.delete("mem.deletemem", param);
    }

    // 글 상세 조회
    public Member getBoard(Long memberId) {
        System.out.println("===> Spring JDBC로 getBoard() 기능 처리");
        Map<String, Object> param = new HashMap<>();
        param.put("ID", memberId);
        param.put("NO", memberId);
        return sqlSession.selectOne("mem.member", param);
    }

    // 글 목록 조회
    public List<Member> getBoardList() {
        System.out.println("===> Spring JDBC로 getBoardList() 기능 처리");
        return sqlSession.selectList("mem.list");
    }

}