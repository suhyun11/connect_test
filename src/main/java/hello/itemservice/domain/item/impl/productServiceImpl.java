package hello.itemservice.domain.item.impl;

import hello.itemservice.domain.item.Product;
import hello.itemservice.domain.item.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ProductService")
public class productServiceImpl implements ProductService {
    @Autowired
    private productDAO productDAO;

    @Override
    public String insertBoard(Product vo) {
        return productDAO.insertBoard(vo);
    }

    @Override
    public void updateBoard(Product vo) {
        productDAO.updateBoard(vo);
    }

    @Override
    public void deleteBoard(Long product_num) {
        productDAO.deleteBoard(product_num);
    }

    @Override
    public Product getBoard(Long product_num) { return productDAO.getBoard(product_num);}

    public List<Product> getBoardList() {
        System.out.println("ProductServiceImpl...");
        return productDAO.getBoardList();
    }
}