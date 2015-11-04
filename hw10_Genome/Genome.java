package hw10_Genome;

import java.util.*;

public class Genome {

    public static int GENOME_SIZE = 1_000_000;
    public static char[] letters = {'A', 'C', 'G', 'T'};

    char[] sequence;

    public void generateSequence() {
        Random random = new Random();
        sequence = new char[GENOME_SIZE];

        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = letters[random.nextInt(letters.length)];
        }

    }

    public void searchDuplicatesBruteForce(char[] data, int M) {
        for (int i = 0; i < data.length - M + 1; i++) {
            for (int j = i + 1; j < data.length - M + 1; j++) {
//				System.out.println(data[i] + "," + data[j]);
                int k = i;
                int m = j;
                int n = 0;
                while (data[k++] == data[m++] && ++n < M) {
                }
                if (n == M) {
                    System.out.println("Match at " + i + " and " + j);
                }
            }
        }
    }

    public void searchDuplicatesSorting(char[] data, int M) {

        class GenomeSubstring implements Comparable<GenomeSubstring> /*, Iterable<GenomeSubstring>*/ {
            String genomeString;
            int index;

            public int compareTo(GenomeSubstring other) {
                return this.genomeString.compareTo(other.genomeString);
            }
        }

        List<GenomeSubstring> words = new LinkedList<>();

        System.out.println("start");
        for (int i = 0; i < data.length - M + 1; i++) {
            GenomeSubstring genomeSubstring = new GenomeSubstring();
            genomeSubstring.genomeString = new String(data, i, M);
            genomeSubstring.index = i;
            words.add(genomeSubstring);
            if (i % 100_000 == 0) {
                System.out.println(i);
            }
        }


        System.out.println("sort");
        Collections.sort(words);

        System.out.println("search");

        Iterator<GenomeSubstring> it = words.iterator();
        String last = "";
        int position;
        int lastPosition = 0;

        for (GenomeSubstring element : words) {
            String word = element.genomeString;
            position = element.index;
            if (word.equals(last)) {
                System.out.println("Match! at positions " + lastPosition + " and " + position);
            }
            last = word;
            lastPosition = position;
        }
    }


    public static void main(String[] args) {

        Genome genome = new Genome();

        genome.searchDuplicatesBruteForce(new char[]{'A', 'A', 'C', 'T', 'A',
                'A', 'C'}, 3);

        System.out.println("Generating");
        genome.generateSequence();
//		genome.searchDuplicatesBruteForce(genome.sequence, 10);

        System.out.println("Searching");
        genome.searchDuplicatesSorting(genome.sequence, 10);

    }


}
