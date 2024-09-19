package section2_syntax.part5_zoo;

import java.util.List;

public class ZooApp {

    public static void main(String[] args) {
        ZooApp zooApp = new ZooApp();
        zooApp.processZooData(args);
        zooApp.printZooSummary();
    }

    /**
     * Processes the command line data.
     * @param args
     */
    void processZooData(String[] args) {
        for (String speciesName : args) {
            ZooSpecies.registerSpeciesFromString(speciesName);
        }
    }

    /**
     * Prints a summary of the zoo.
     */
    void printZooSummary() {
        List<ZooSpecies> allSpecies = ZooSpecies.getAllSpecies();
        System.out.println("The zoo has " + allSpecies.size() + " species.");
        System.out.println("These are the species counts:");
        for (ZooSpecies species : allSpecies) {
            System.out.println("    " + species.getSpeciesName() + ": " + species.getIndividualCount());
        }
    }
}
