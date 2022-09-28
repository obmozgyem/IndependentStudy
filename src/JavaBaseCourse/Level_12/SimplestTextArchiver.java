package JavaBaseCourse.Level_12;

import static java.lang.Character.isDigit;

public class SimplestTextArchiver {

    public static void main(String[] args) {
        // read source data
        String source = "A".repeat(11) + "B".repeat(3) + "C".repeat(2);
        System.out.println("Source text:   " + source);

        // processing
        String zipped = zip(source);
        // display results
        System.out.println("Zipped text:   " + zipped);

        // processing
        String unzipped = unzip(zipped);
        // display results
        System.out.println("Unzipped text: " + unzipped);
    }

    private static String zip(String source) {
        int count = 1;
        StringBuilder zip = new StringBuilder();
        char prev = source.charAt(0);
        for (int i = 1; i < source.length(); i++) {
           var corrent = source.charAt(i);
            if (corrent==prev) {
                count++;
            } else {
                zip.append(prev).append(count);
                prev=corrent;
                count=1;
            }

        }
        zip.append(prev).append(count);

        return zip.toString();
    }

    private static String unzip(String zipped) {
        StringBuilder zip = new StringBuilder();
        char first= zipped.charAt(0);
        StringBuilder countBilder = new StringBuilder();
        for (int i = 1; i < zipped.length(); i++) {
            char corrent = zipped.charAt(i);
            if(isDigit(corrent)) {
                countBilder.append(corrent);
            } else  {
                unzipchar(zip, first, countBilder);
                countBilder.setLength(0);
                first= corrent;


            }

        }

        unzipchar(zip, first, countBilder);


        return zip.toString();
    }

    private static void unzipchar(StringBuilder zip, char first, StringBuilder countBilder) {
        int count= Integer.parseInt(countBilder.toString());
        for (int i1 = 0; i1 < count; i1++) {
            zip.append(first);
        }
    }
}
