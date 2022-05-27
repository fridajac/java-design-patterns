package AbstractFactoryPattern;

public class FactoryGenerator {

    public static AbstractDeviceFactory getFactory(FactoryType factoryType){
        switch(factoryType){
            case LAPTOP_FACTORY:
                return new LaptopFactory();
            case MOBILE_FACTORY:
                return new MobileFactory();
        }
        return null;
    }
}
