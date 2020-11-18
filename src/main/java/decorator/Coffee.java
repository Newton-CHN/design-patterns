package decorator;

/**
 * @author liudeng
 * @date 2020/11/18 下午8:15
 * @since
 **/
public class Coffee extends Component {

    public Coffee() {
        descript = "coffee";
    }

    @Override
    public String getDescript() {
        return descript;
    }

    @Override
    public double cost() {
        return 1;
    }
}
