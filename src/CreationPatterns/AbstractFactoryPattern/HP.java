package CreationPatterns.AbstractFactoryPattern;

public class HP extends Device{

    private String ram;
    private String processor;
    private String gpu;

    public HP(String ramSize, String processorType, String gpu){
        this.ram = ramSize;
        this.processor = processorType;
        this.gpu = gpu;
    }

    @Override
    public String getDetails() {
        return "HP config is ram size " +this.ram +" and processor type is " +this.processor +"and gpu config is " +this.gpu;
    }

    @Override
    public String toString() {
        return "HP{" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                ", gpu='" + gpu + '\'' +
                '}';
    }
}
