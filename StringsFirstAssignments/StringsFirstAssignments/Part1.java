import java.util.*;

class Part1 {
    public String findSimpleGene(String dna) {
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1) {
            return "Gene not found";
        }
        int stopIndex = dna.indexOf("TAA");
        if (stopIndex == -1) {
            return "Gene not found";
        }
        if (((stopIndex - startIndex + 1) % 3) == 0) {
            String gene = "Gene is " + dna.substring(startIndex, stopIndex + 3);
            return gene;
        }
        else {
            return "Gene not found";
        }
    }

    public void testSimpleGene() {
        List<String> dnaList = new ArrayList<>();
        dnaList.add("ATGGCTATATATAATATATAGC");
        dnaList.add("ATGCATTAATTAATTAATAATGC");
        dnaList.add("GCGCATGCATGCATGCTAAGC");
        dnaList.add("GATGCCTAATGGCTAGCTATAAGCTGC");
        dnaList.add("GCATGCGCGCGCGCGCTAAGCGGC");
        dnaList.add("GCGCCGGCCATGGATCTAAGGCCGGCGC");
        dnaList.add("GCTACATGGTACGTACGTAATAGC");
        dnaList.add("GATGCTATATAATAGTTATATAGC");
        dnaList.add("GGCTATGATATATGATATAGTAAC");
        for (String dna : dnaList) {
            System.out.println("DNA strand is " + dna);
            System.out.println(findSimpleGene(dna) + "\n");
        }
    }
public static void main(String[] args) {
        Part1 p = new Part1();
        p.testSimpleGene();
    }
}