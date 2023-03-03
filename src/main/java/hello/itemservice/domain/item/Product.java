package hello.itemservice.domain.item;

import lombok.Data;

@Data
public class Product {

    private Long product_num;
    private String product_title;
    private String product_subtitle;
    private String product_writer;
    private String product_price;
    private String product_img;
    private String product_date;
    private String product_page;
    private String product_code;
    private Long product_stock; //재고
    private Long product_sale;
    private Long product_visit; //조회수


    //기본 생성자
    public Product(){}

    //생성자 오버로딩

    public Product(String product_title, String product_subtitle, String product_writer, String product_price, String product_img, String product_date, String product_page, String product_code, Long product_stock, Long product_sale, Long product_visit) {
        this.product_title = product_title;
        this.product_subtitle = product_subtitle;
        this.product_writer = product_writer;
        this.product_price = product_price;
        this.product_img = product_img;
        this.product_date = product_date;
        this.product_page = product_page;
        this.product_code = product_code;
        this.product_stock = product_stock;
        this.product_sale = product_sale;
        this.product_visit = product_visit;
    }
}
