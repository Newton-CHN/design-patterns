package decorator;

/**
 * @author liudeng
 * @date 2020/11/18 下午8:29
 * @since
 **/
public class Test {
    public static void main(String[] args) {
        Component coffee = new Coffee();
        System.out.println(coffee.getDescript());

        coffee = new Moca(coffee);
        System.out.println("描述：" + coffee.getDescript() + ", 价钱：" + coffee.cost());

        coffee = new Moca(coffee);
        System.out.println("描述：" + coffee.getDescript() + ", 价钱：" + coffee.cost());

        Component water = new Water();
        System.out.println(water.getDescript());

        water = new Cupqi(water);
        water = new Cupqi(water);
        System.out.println("描述：" + water.getDescript() + ", 价钱：" + water.cost());
    }
}
