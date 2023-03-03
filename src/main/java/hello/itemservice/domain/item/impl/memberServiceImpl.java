package hello.itemservice.domain.item.impl;

import hello.itemservice.domain.item.Member;
import hello.itemservice.domain.item.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("MemberService")
public class memberServiceImpl implements MemberService {
    @Autowired
    private memberDAO memberDAO;

    @Override
    public String insertBoard(Member vo) {
        return null;
    }

    @Override
    public void updateBoard(Member vo) {
        memberDAO.updateBoard(vo);
    }

    @Override
    public void deleteBoard(Long member_No) {
        memberDAO.deleteBoard(member_No);
    }

    @Override
    public Member getBoard(Long member_No) {
        return memberDAO.getBoard(member_No);
    }

    public List<Member> getBoardList() {
        System.out.println("MemberServiceImpl...");
        return memberDAO.getBoardList();
    }
}