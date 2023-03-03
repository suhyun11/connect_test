package hello.itemservice.web.view.iteam;
import javax.servlet.http.HttpServletRequest;
import hello.itemservice.domain.item.*;
import hello.itemservice.domain.item.impl.ItemServiceImpl;
import hello.itemservice.domain.item.impl.memberServiceImpl;
import hello.itemservice.domain.item.impl.productServiceImpl;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.modeler.BaseAttributeFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.multipart.MultipartFile;
import java.net.http.HttpRequest;
import java.util.Map;

@Controller
@Slf4j
@RequestMapping("/basic/items")
@RequiredArgsConstructor // 초기화 되지 않게 알아서 실행되는 녀석
public class BasicItemController {
    @Autowired
    ItemServiceImpl itemService;
    @Autowired
    productServiceImpl productService;
    @Autowired
    memberServiceImpl memberService;

    @GetMapping
    public String items(Model model) {
        model.addAttribute("items", itemService.getBoardList());
        return "items";
    }

    @GetMapping("/{itemId}")
    public String item(@PathVariable Long itemId, Model model) {
        Item item = itemService.getBoard(itemId);
        System.out.println(itemId);
        model.addAttribute("item", item);
        return "item";
    }
    @GetMapping("/add")
    public String addForm() {
        return "addForm";
    }
    @PostMapping("/add")
    public String addItemV6(Item item, RedirectAttributes redirectAttributes) {
        String itemId = itemService.insertBoard(item);
        redirectAttributes.addAttribute("itemId", itemId);
        redirectAttributes.addAttribute("status", "add");

        return "redirect:/basic/items/{itemId}";
    }

    @GetMapping("/{itemId}/edit")
    public String editForm(@PathVariable Long itemId, Model model) {
        System.out.println(itemId);
        Item item = itemService.getBoard(itemId);
        model.addAttribute("item", item);
        return "editForm";
    }
    @GetMapping("/{itemId}/delete")
    public String delete(@PathVariable Long itemId) {
        System.out.println(itemId);
        itemService.deleteBoard(itemId);
        return "redirect:/basic/items";
    }
    @PostMapping("/{itemId}/edit")
    public String edit(@PathVariable Long itemId, @ModelAttribute Item item, RedirectAttributes redirectAttributes) {
        itemService.updateBoard(item);
        redirectAttributes.addAttribute("status", "edit");
        System.out.println("호출됨");
        return "redirect:./";
    }

    @GetMapping("/header")
    public String header() {
        return "header";
    }

    @GetMapping("/member")
    public String member(Model model) {
        model.addAttribute("members", memberService.getBoardList());
        return "member";
    }

    @GetMapping("/member/{member_No}/edit")
    public String editMember(@PathVariable Long member_No, Model model) {
        System.out.println(member_No);
        Member member = memberService.getBoard(member_No);
        model.addAttribute("member", member);
        System.out.println(member.getMember_No());
        System.out.println(member.getMember_Id());

        return "editMember";
    }

    @PostMapping("/member/{member_No}/edit")
    public String edit(@PathVariable Long member_No, @ModelAttribute Member member, RedirectAttributes redirectAttributes) {
        memberService.updateBoard(member);
        redirectAttributes.addAttribute("status", "edit");
        System.out.println("Call");
        return "redirect:/basic/items/member";
    }

    @GetMapping("/member/{member_No}/delete")
    public String deleteMember(@PathVariable Long member_No) {
        System.out.println(member_No);
        memberService.deleteBoard(member_No);
        return "redirect:/basic/items/member";
    }

    @GetMapping("/product")
    public String product(Model model) {
        model.addAttribute("products", productService.getBoardList());
        return "inqProduct";
    }

    @GetMapping("/product/{productNum}")
    public String deProduct(@PathVariable Long productNum, Model model) {
        Product product = productService.getBoard(productNum);
        System.out.println(product.getProduct_num());
        System.out.println(productNum);
        model.addAttribute("product", product);
        return "deProduct";
    }

    @GetMapping("/product/add")
    public String addProduct() {
        return "addProduct";
    }
    @PostMapping("/product/add")
    public String addProduct(Product product, RedirectAttributes redirectAttributes) {
        String productNum = productService.insertBoard(product);
        redirectAttributes.addAttribute("productNum", productNum);
        redirectAttributes.addAttribute("status", "add");

        return "redirect:/basic/items/product";
    }

    @GetMapping("/product/{productNum}/edit")
    public String editProduct(@PathVariable Long productNum, Model model) {
        System.out.println(productNum);
        Product product = productService.getBoard(productNum);
        System.out.println(product.getProduct_code());
        model.addAttribute("product", product);
        return "editProduct2";
    }
    @PostMapping("/product/{productNum}/edit")
    public String edit(@PathVariable Long productNum, @ModelAttribute Product product, RedirectAttributes redirectAttributes, HttpServletRequest request) {
        System.out.println("컨트롤러");
        String productcode = request.getParameter("myInput"); //, @RequestBody Map<String, String> request
//        productcode = productcode.replace("<p><br data-cke-filler=\"true\"></p>", "");
//        productcode = productcode.replace("<p><br data-cke-filler=\"true\"></p>", "");
//        productcode = ""+ productcode + "";
        System.out.println(productcode);
        product.setProduct_code(productcode);
        productService.updateBoard(product);
//        redirectAttributes.addAttribute("status", "edit");
        System.out.println("Call");
        return "redirect:";
    }

    @GetMapping("/product/{productNum}/delete")
    public String deleteProduct(@PathVariable Long productNum) {
        System.out.println(productNum);
        productService.deleteBoard(productNum);
        return "redirect:/basic/items/product";
    }

    //레이아웃 보류
    @GetMapping("/view")
    public String view(Model model) {
        model.addAttribute("content", "view :: view");
        return "layout";
    }
}


