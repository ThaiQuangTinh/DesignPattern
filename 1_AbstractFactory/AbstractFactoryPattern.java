// Abstract product
interface Chair {

    void create();

}

// Product
class PlasticChair implements Chair {

    @Override
    public void create() {
        System.out.println("\nCreate plastic chair.");
    }

}

// Product
class WoodChair implements Chair {

    @Override
    public void create() {
        System.out.println("\nCreate wood chair.");
    }

}

// Abstract product
interface Table {

    void create();

}

// Product
class PlasticTable implements Table {

    @Override
    public void create() {
        System.out.println("\nCreate wood table.");
    }

}

// Product
class WoodTable implements Table {

    @Override
    public void create() {
        System.out.println("\nCreate wood table.");
    }

}

// Abstract factory
abstract class AbstractFactory {

    public abstract Chair createChair();

    public abstract Table createTable();

}

// Concreate abstract factory
class PlasticFactory extends AbstractFactory {

    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new PlasticTable();
    }

}

class WoodFactory extends AbstractFactory {

    @Override
    public Chair createChair() {
        return new PlasticChair();
    }

    @Override
    public Table createTable() {
        return new WoodTable();
    }

}

/**
 * AbstractFactoryPattern
 */
public class AbstractFactoryPattern {

    public static void main(String[] args) {
        AbstractFactory plasticFactory = new PlasticFactory();
        Chair plasticChair = plasticFactory.createChair();
        plasticChair.create();

        AbstractFactory woodFactory = new WoodFactory();
        
    }
}