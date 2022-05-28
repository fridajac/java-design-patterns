package CreationPatterns.AbstractFactoryPattern;

public class Client {

    public static void main(String[] args) {
        Device dell = FactoryGenerator.getFactory(FactoryType.LAPTOP_FACTORY).getGadget(DeviceType.DELL);
        System.out.println(dell.getDetails());
    }
}
