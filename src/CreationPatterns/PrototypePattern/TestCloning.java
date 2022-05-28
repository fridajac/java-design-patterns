package CreationPatterns.PrototypePattern;

public class TestCloning {

    public static void main(String[] args) {
        CloneFactory animalMaker = new CloneFactory();
        Sheep sally = new Sheep();
        System.out.println(sally.toString());
        Sheep clonedSheep = (Sheep) animalMaker.getClone(sally);
        System.out.println(clonedSheep.toString());

        System.out.println("Sally Hashcode: " +System.identityHashCode(System.identityHashCode(sally)));
        System.out.println("Cloned sheep Hashcode: " +System.identityHashCode(System.identityHashCode(sally)));

    }
}
