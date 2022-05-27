package AbstractFactoryPattern;

public class Dell extends Device {

    private String ram;
    private String processor;
    private String gpu;

    public Dell(String ramSize, String processorType, String gpu){
        this.ram = ramSize;
        this.processor = processorType;
        this.gpu = gpu;
    }

    @Override
    public String getDetails() {
        return "Dell config is ram size " +this.ram +" and processor type is " +this.processor +" and the gpu config is  "+this.gpu;
    }

    @Override
    public String toString() {
        return "Dell{" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                ", gpu='" +gpu + '\'' +
                '}';
    }
}
