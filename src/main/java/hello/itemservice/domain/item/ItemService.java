package hello.itemservice.domain.item;


import java.util.List;

public interface ItemService {
    // CRUD ����� �޼ҵ� ����
    // �� ���
    String insertBoard(Item vo);

    // �� ����
    void updateBoard(Item vo);

    // �� ����
    void deleteBoard(Long itemId);

    // �� �� ��ȸ
    Item getBoard(Long itemId);

    // �� ��� ��ȸ
    List<Item> getBoardList();
}
