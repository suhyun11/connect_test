package hello.itemservice.domain.item;


import java.util.List;

public interface ProductService {

    // CRUD
    String insertBoard(Product vo);

    void updateBoard(Product vo);

    void deleteBoard(Long itemId);

    Product getBoard(Long itemId);

    List<Product> getBoardList();
}
