package pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Autor $(CJJ)
 * @DATE 2021/8/19 12:26
 * @Computer CJJ_IT
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private int id;
    private String pwd;
}
