package hello.itemservice.domain.item;

import lombok.Data;

@Data
public class Member {

    private Long member_No;
    private String member_Id;
    private String member_Pwd;
    private String member_Address;
    private String member_Email;
    private String member_Phone;
    private String member_Name;
    private String member_Grade;
    private String member_Date;

    //기본 생성자
    public Member(){}

    //생성자 오버로딩

    public Member(String member_Id, String member_Pwd, String member_Address, String member_Email, String member_Phone, String member_Name, String member_Grade, String member_Date) {
        this.member_Id = member_Id;
        this.member_Pwd = member_Pwd;
        this.member_Address = member_Address;
        this.member_Email = member_Email;
        this.member_Phone = member_Phone;
        this.member_Name = member_Name;
        this.member_Grade = member_Grade;
        this.member_Date = member_Date;
    }
}
