package pojo;

import lombok.Data;

/**
 * @Autor $(CJJ)
 * @DATE 2021/8/18 19:00
 * @Computer CJJ_IT
 */
@Data
public class UserT {
    private String name;
    private int id;
    /*两个参数*/
    public UserT(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void pop(){
        System.out.println("name="+name);
        System.out.println("id="+id);
    }
}
