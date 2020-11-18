package decorator;

import java.math.BigDecimal;

/**
 * @author liudeng
 * @date 2020/11/18 下午8:28
 * @since
 **/
public class Cupqi extends Mix {
    Component component;

    public Cupqi(Component component) {
        this.component = component;
    }

    @Override
    public String getDescript() {
        return component.getDescript() + "-cupqi";
    }

    @Override
    public BigDecimal cost() {
        return component.cost().add(new BigDecimal(String.valueOf(0.2)));
    }
}
