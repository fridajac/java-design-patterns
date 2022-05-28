package CreationPatterns.AbstractFactoryPattern;

public class MobileFactory extends AbstractDeviceFactory {

    @Override
    Device getGadget(DeviceType deviceType) {
        switch(deviceType){
            case ONE_PLUS:
                return new OnePlus("8gb", "Qualcomm");
            case NOKIA:
                return new Nokia("12gb", "Intel");
        }
        return null;
    }
}
