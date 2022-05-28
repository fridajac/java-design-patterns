package CreationPatterns.AbstractFactoryPattern;

public class LaptopFactory extends AbstractDeviceFactory{
    @Override
    Device getGadget(DeviceType deviceType) {
       switch(deviceType){
           case HP:
               return new HP("8gb", "Intel", "Nvidia");
           case DELL:
               return new HP("12gb", "AME", "Nvidia");
       }
       return null;
    }
}
