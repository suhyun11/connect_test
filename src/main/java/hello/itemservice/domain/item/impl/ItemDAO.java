package hello.itemservice.domain.item.impl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import hello.itemservice.domain.item.Item;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ItemDAO{

    @Autowired
    SqlSessionTemplate sqlSession;

    // CRUD 기능의 메소드 구현
    // 글 등록
    public String insertBoard(Item vo) {
        Map<String, Object> param = new HashMap<>();
        param.put("ITEMNAME", vo.getItem_Name());
        param.put("PRICE", vo.getPrice());
        param.put("QUANTITY", vo.getQuantity());
        System.out.println(vo.getItem_Name());
        System.out.println("===> Spring JDBC로 insertBoard() 기능 처리");
        sqlSession.insert("book.insertitem", param);
        return param.get("ID_num").toString();
    }

    // 글 수정
    public void updateBoard(Item vo) {
        Map<String, Object> param = new HashMap<>();
        param.put("ID", vo.getId());
        param.put("ITEMNAME", vo.getItem_Name());
        param.put("PRICE", vo.getPrice());
        param.put("QUANTITY", vo.getQuantity());
        System.out.println("===> Spring JDBC로 updateBoard() 기능 처리");
        sqlSession.update("book.updateitem", param);
    }

    // 글 삭제
    public void deleteBoard(Long itemId) {
        Map<String, Object> param = new HashMap<>();
        param.put("ID", itemId);
        System.out.println("===> Spring JDBC로 deleteBoard() 기능 처리");
        sqlSession.delete("book.deleteitem", param);
    }

    // 글 상세 조회
    public Item getBoard(Long itemId) {
        System.out.println("===> Spring JDBC로 getBoard() 기능 처리");
        Map<String, Object> param = new HashMap<>();
        param.put("ID", itemId);
        return sqlSession.selectOne("book.item", param);
    }

    // 글 목록 조회
    public List<Item> getBoardList() {
        System.out.println("===> Spring JDBC로 getBoardList() 기능 처리");
        return sqlSession.selectList("book.list");
    }

}