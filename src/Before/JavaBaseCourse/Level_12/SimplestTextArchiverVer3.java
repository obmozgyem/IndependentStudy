package Before.JavaBaseCourse.Level_12;

public class SimplestTextArchiverVer3 {

    public static void main(String[] args) {
        // read source data
        String source = "A".repeat(8) + "1".repeat(3) + "C".repeat(25);
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
        StringBuilder result = new StringBuilder();

        char prev = source.charAt(0);
        for (int i = 1; i < source.length(); i++) {
            var corrent = source.charAt(i);
            if (corrent == prev) {
                count++;
            } else {
                zipChar(count, result, prev);
                prev = corrent;
                count = 1;
            }

        }
        zipChar(count, result, prev);

        return result.toString();
    }

    private static void zipChar(int count, StringBuilder result, char prev) {
        int quotient = count / 9;
        int remainder = count % 9;
        for (int i = 0; i < quotient; i++) {
            result.append(prev).append(9);

        }
        if (remainder!=0) {
        result.append(prev).append(remainder);}
    }


    private static String unzip(String zipped) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < zipped.length(); i += 2) {
            char corrent = zipped.charAt(i);
            int count = Integer.parseInt(String.valueOf(zipped.charAt(i+1)));
            for (int j = 0; j < count; j++) {
                result.append(corrent);

            }


        }


        return result.toString();
    }


}

