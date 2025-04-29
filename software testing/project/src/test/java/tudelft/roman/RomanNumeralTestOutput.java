package tudelft.roman;

import java.io.BufferedWriter;
import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

import org.junit.jupiter.api.*;

public class RomanNumeralTestOutput{
    private static BufferedWriter logWriter;
    private static int passed = 0, failed = 0;
    private static long begin;

    //create a log file
    @BeforeAll
    static public void setupLogFile() throws IOException{
        begin = System.nanoTime();//mark the starting time for total runtime
        Path directory = Paths.get("logs");
        if(!Files.exists(directory))
            Files.createDirectory(directory);//make "logs" folder if it doesn't exist
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("Asia/Taipei"));//specify time zone to Taipei
        String formattedDate = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss_(z)"));
        Path logFile = directory.resolve(formattedDate + "_log.txt");
        logWriter = Files.newBufferedWriter(logFile);
    }

    //log the name of the test
    @BeforeEach
    void beforeEach(TestInfo testInfo) throws IOException {
        logWriter.write("Running Test: " + testInfo.getDisplayName() + "\n");
    }

    @Test
    public void singleDigit1() throws IOException{
        writeResult("I", 1, new RomanNumeral().convert("I"), System.nanoTime());
    }

    @Test
    public void singleDigit2() throws IOException{
        writeResult("V", 5, new RomanNumeral().convert("V"), System.nanoTime());
    }

    @Test
    public void singleDigit3() throws IOException{
        writeResult("X", 10, new RomanNumeral().convert("X"), System.nanoTime());
        Assertions.assertEquals(10, new RomanNumeral().convert("X"));
    }

    @Test
    public void singleDigit4() throws IOException{
        writeResult("L", 50, new RomanNumeral().convert("L"), System.nanoTime());
        Assertions.assertEquals(50, new RomanNumeral().convert("L"));
    }

    @Test
    public void singleDigit5() throws IOException{
        writeResult("C", 100, new RomanNumeral().convert("C"), System.nanoTime());
        Assertions.assertEquals(100, new RomanNumeral().convert("C"));
    }

    @Test
    public void singleDigit6() throws IOException{
        writeResult("D", 500, new RomanNumeral().convert("D"), System.nanoTime());
    }

    @Test
    public void singleDigit7() throws IOException{
        writeResult("M", 1000, new RomanNumeral().convert("M"), System.nanoTime());
    }

    //test multiple digits
    @Test
    public void multipleDigits1() throws IOException{
        writeResult("II", 2, new RomanNumeral().convert("II"), System.nanoTime());
    }

    @Test
    public void multipleDigits2() throws IOException{
        writeResult("III", 3, new RomanNumeral().convert("III"), System.nanoTime());
    }

    @Test
    public void multipleDigits3() throws IOException{
        writeResult("VIII", 8, new RomanNumeral().convert("VIII"), System.nanoTime());
    }

    @Test
    public void multipleDigits4() throws IOException{
        writeResult("XVII", 17, new RomanNumeral().convert("XVII"), System.nanoTime());
    }

    //test subtractive notation
    @Test
    public void subtractiveNotation1() throws IOException{
        writeResult("IV", 4, new RomanNumeral().convert("IV"), System.nanoTime());
        Assertions.assertEquals(4, new RomanNumeral().convert("IV"));
    }

    @Test
    public void subtractiveNotation2() throws IOException{
        writeResult("IX", 9, new RomanNumeral().convert("IX"), System.nanoTime());
    }

    @Test
    public void subtractiveNotation3() throws IOException{
        writeResult("XIV", 14, new RomanNumeral().convert("XIV"), System.nanoTime());
    }

    @Test
    public void subtractiveNotation4() throws IOException{
        writeResult("XLIV", 44, new RomanNumeral().convert("XLIV"), System.nanoTime());
    }

    @Test
    public void subtractiveNotation5() throws IOException{
        writeResult("XCIV", 94, new RomanNumeral().convert("XCIV"), System.nanoTime());
    }

    @Test
    public void subtractiveNotation6() throws IOException{
        writeResult("CDXLIV", 444, new RomanNumeral().convert("CDXLIV"), System.nanoTime());
    }

    //test invalid notation
    @Test
    public void invalid1() throws IOException{
        writeResult("IIII", 0, new RomanNumeral().convert("IIII"), System.nanoTime());
    }

    @Test
    public void invalid2() throws IOException{
        writeResult("VIIII", 0, new RomanNumeral().convert("VIIII"), System.nanoTime());
    }

    @Test
    public void invalid3() throws IOException{
        writeResult("IIIV", 0, new RomanNumeral().convert("IIIV"), System.nanoTime());
    }

    @Test
    public void invalid4() throws IOException{
        writeResult("A", 0, new RomanNumeral().convert("A"), System.nanoTime());
    }

    //log test details, check result, update counters
    private void writeResult(String testString, int expectedValue, int actualValue, long start) throws IOException{
        if(actualValue == expectedValue)
            passed++;
        else
            failed++;

        logWriter.write("test string:\t" + testString + "\n" +
                "expected value:\t" + expectedValue + "\n" +
                "actual value:\t" + actualValue + "\n" +
                "result:\t" + (actualValue == expectedValue ? "PASS" : "FAIL") + "\n" +
                "runtime:\t" + ((System.nanoTime() - start) / 1_000_000) + " ms");
    }

    //add a separator for readability
    @AfterEach
    public void after() throws IOException{
        logWriter.write("\n\n------------\n\n");
    }

    //write a summary and close the file
    @AfterAll
    public static void close() throws IOException{
        logWriter.write("============ summary ============\n" +
                "passed:\t" + passed + "\n" +
                "failed:\t" + failed + "\n" +
                "runtime:\t" + ((System.nanoTime() - begin) / 1_000_000) + " ms\n");
        logWriter.close();
    }
}