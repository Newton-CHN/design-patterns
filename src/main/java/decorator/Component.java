package decorator;

import java.math.BigDecimal;

/**
 * @author liudeng
 * @date 2020/11/18 下午8:14
 * @since
 **/
public abstract class Component {
    public String descript = "hello";

    public  String getDescript() {
        return descript;
    }
    public abstract BigDecimal cost();
}
