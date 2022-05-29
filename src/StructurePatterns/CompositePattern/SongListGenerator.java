package StructurePatterns.CompositePattern;

public class SongListGenerator {

    public static void main(String[] args) {
        SongComponent industrialMusic = new SongGroup("Industrial", "Grooves is the best");
        SongComponent heavyMetalMusic = new SongGroup("Heavy Metal", "Wow this is great");
        SongComponent dubStepMusic = new SongGroup("Dubstep", "Come and join us here for ever");

        SongComponent everySong = new SongGroup("Song List", "Every song that is available");
        everySong.add(industrialMusic);
        industrialMusic.add(new Song("Head is home", "Mama", 1994));
        industrialMusic.add(new Song("Spicy", "Mama", 1997));
        industrialMusic.add(dubStepMusic);
        dubStepMusic.add(new Song("Summer", "Hello Saferide", 2000));
        everySong.add(heavyMetalMusic);
        heavyMetalMusic.add(new Song("DeathWise", "Death", 2022));
        DiscJockey crazyLarry = new DiscJockey(everySong);
        crazyLarry.getSongList();
    }
}
