package decorator;

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
    public double cost() {
        return 0.5;
    }
}
