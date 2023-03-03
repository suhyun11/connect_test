package hello.itemservice.domain.item;


import java.util.List;

public interface MemberService {
    // CRUD
    String insertBoard(Member vo);

    void updateBoard(Member vo);

    void deleteBoard(Long itemId);

    Member getBoard(Long itemId);

    List<Member> getBoardList();
}
