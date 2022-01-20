package pojo;

import lombok.Data;

/**
 * @Autor $(CJJ)
 * @DATE 2021/8/18 18:13
 * @Computer CJJ_IT
 */
@Data
public class User {
    private String name;
    private int id;
    /*两个参数*/
    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void show(){
        System.out.println("name"+name);
        System.out.println("id"+name);
    }
}
