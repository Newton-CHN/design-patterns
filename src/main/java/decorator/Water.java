package decorator;

import java.math.BigDecimal;

/**
 * @author liudeng
 * @date 2020/11/18 下午8:17
 * @since
 **/
public class Water extends Component{
    public Water() {
        descript = "water";
    }

    @Override
    public String getDescript() {
        return descript;
    }

    @Override
    public BigDecimal cost() {
        return new BigDecimal(String.valueOf(0.5));
    }
}
