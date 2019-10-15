package exercise6;

import org.junit.Test;
import java.util.HashSet;
import static org.junit.Assert.*;

public class GradingTests {

    @Test
    public void test1_simpleEquality() {
        DNA dna1_1 = new DNA("AAAGGTTACTGA");
        DNA dna1_2 = new DNA("AAAGGTTACTGA");
        assertEquals(dna1_1, dna1_2);
    }

    @Test
    public void test2_massHysteria() {
        DNA dna10_1 = new DNA("ATBCGGG");
        DNA dna10_2 = new DNA("CCATGAAT*G");
        assertEquals(924.7, dna10_1.totalMass(), 0.001);
        assertEquals(1280.1, dna10_2.totalMass(), 0.001);
    }

    @Test
    public void test3_cutAndSplice() {
        DNA dna3 = new DNA("TTCGGGTATGTA");
        DNA expected = new DNA("TTCGGATTGATGTATGTA");
        DNA actual = dna3.cutAndSplice("GGGTAT", 2, "ATTGAT");
        assertEquals(expected, actual);
    }

    @Test
    public void test4_cutAndSplice() {
        DNA dna13 = new DNA("ATCGGGCATGTAGGGCAT");
        DNA expected = new DNA("ATCGGGATTGATCATGTAGGGATTGATCAT");
        DNA actual = dna13.cutAndSplice("GGGCAT", 3, "ATTGAT");
        assertEquals(expected, actual);
    }

    @Test
    public void test5_cutAndSplice() {
        DNA dna5 = new DNA("ATC");
        DNA expected = new DNA("ATC");
        DNA actual = dna5.cutAndSplice("GGGCAT", 1, "ATTGAT");
        assertEquals(expected, actual);
    }

}
