package hello.itemservice.domain.item;

import lombok.Data;

@Data
public class Item {

    private Long id;
    private String item_Name;
    private Integer price;
    private Integer quantity;
    
    //기본 생성자
    public Item(){}

    //생성자 오버로딩
    public Item(String item_Name, Integer price, Integer quantity) {
        this.item_Name = item_Name;
        this.price = price;
        this.quantity = quantity;
    }
}
