package composite.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Demo {
    private static final Logger logger = LoggerFactory.getLogger(Demo.class);

    public static void main(String[] args) {
        Unit soldier1 = new Soldier();
        Unit soldier2 = new Soldier();
        Unit soldier3 = new Soldier();

        Unit tank = new Tank();

        var group = new Group();
        group.addUnit(soldier1);
        group.addUnit(soldier2);
        group.addUnit(soldier3);
        group.addUnit(tank);

        logger.info("first group:");
        group.move();

        var group2 = new Group();
        group2.addUnit(group);
        group2.addUnit(new Tank());

        logger.info("second group:");
        group2.move();
    }
}
