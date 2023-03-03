package hello.itemservice.domain.item.impl;

import java.util.List;

import hello.itemservice.domain.item.Item;
import hello.itemservice.domain.item.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ItemService")
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemDAO itemDAO;

    public String insertBoard(Item vo) {
        return itemDAO.insertBoard(vo);
    }

    public void updateBoard(Item vo) {
        itemDAO.updateBoard(vo);
    }

    public void deleteBoard(Long itemId) {
        itemDAO.deleteBoard(itemId);
    }

    public Item getBoard(Long itemId) {
        return itemDAO.getBoard(itemId);
    }

    public List<Item> getBoardList() {
        System.out.println("ItemServiceImpl...");
        return itemDAO.getBoardList();
    }
}