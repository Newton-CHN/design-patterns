package decorator;

import java.math.BigDecimal;

/**
 * @author liudeng
 * @date 2020/11/18 下午8:23
 * @since
 **/
public class Moca extends Mix {
    Component component;

    public Moca(Component component) {
        this.component = component;
    }

    @Override
    public String  getDescript() {
        return component.getDescript() + "-moca";
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal(String.valueOf(2.1)).add(component.cost());
    }
}
