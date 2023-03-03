package hello.itemservice.domain.item.impl;


import hello.itemservice.domain.item.Product;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class productDAO {

    @Autowired
    SqlSessionTemplate sqlSession;

    // CRUD 기능의 메소드 구현
    // 글 등록
    public String insertBoard(Product vo) {
        Map<String, Object> param = new HashMap<>();
        param.put("TITLE", vo.getProduct_title());
        param.put("SUB", vo.getProduct_subtitle());
        param.put("WRITER", vo.getProduct_writer());
        param.put("PRICE", vo.getProduct_price());
        param.put("IMG", vo.getProduct_img());
        param.put("DATE", vo.getProduct_date());
        param.put("PAGE", vo.getProduct_page());
        param.put("CODE", vo.getProduct_code());
        System.out.println("===> Spring JDBC로 insertBoard() 기능 처리");
        sqlSession.insert("pro.insertpro", param);
        return param.get("PRODUCT_NUM_num").toString();
    }

    // 글 수정
    public void updateBoard(Product vo) {
        Map<String, Object> param = new HashMap<>();
        param.put("TITLE", vo.getProduct_title());
        param.put("SUB", vo.getProduct_subtitle());
        param.put("WRITER", vo.getProduct_writer());
        param.put("PRICE", vo.getProduct_price());
        param.put("IMG", vo.getProduct_img());
        param.put("DATE", vo.getProduct_date());
        param.put("PAGE", vo.getProduct_page());
        param.put("CODE", vo.getProduct_code());
        param.put("STOCK", vo.getProduct_stock());
        param.put("SALE", vo.getProduct_sale());
        param.put("VISIT", vo.getProduct_visit());
        param.put("NUM", vo.getProduct_num());
        System.out.println("===> Spring JDBC로 updateBoard() 기능 처리");
        sqlSession.update("pro.updatepro", param);
    }

    // 글 삭제
    public void deleteBoard(Long product_num) {
        Map<String, Object> param = new HashMap<>();
        param.put("NUM", product_num);
        System.out.println("===> Spring JDBC로 deleteBoard() 기능 처리");
        sqlSession.delete("pro.deletepro", param);
    }

    // 글 상세 조회
    public Product getBoard(Long product_num) {
        System.out.println("===> Spring JDBC로 getBoard() 기능 처리");
        Map<String, Object> param = new HashMap<>();
        param.put("NUM", product_num);
        return sqlSession.selectOne("pro.product", param);
    }

    // 글 목록 조회
    public List<Product> getBoardList() {
        System.out.println("===> Spring JDBC로 getBoardList() 기능 처리");
        return sqlSession.selectList("pro.list");
    }

}