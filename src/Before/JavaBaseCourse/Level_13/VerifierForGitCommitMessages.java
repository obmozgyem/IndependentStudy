package Before.JavaBaseCourse.Level_13;

import java.util.Arrays;

public class VerifierForGitCommitMessages {
    private static final String[] VERBS = {"Summarize"};

    public static void main(String[] args) {
        String commitMessage =
                "Summarize changes in around 50 characters or less\n" +
                        "\n" +
                        "More detailed explanatory text, if necessary. Wrap it to about 72\n" +
                        "characters or so. In some contexts, the first line is treated as the\n" +
                        "subject of the commit and the rest of the text as the body. The\n" +
                        "blank line separating the summary from the body is critical (unless\n" +
                        "you omit the body entirely); various tools like `log`, `shortlog`\n" +
                        "and `rebase` can get confused if you run the two together.\n" +
                        "\n" +
                        "Explain the problem that this commit is solving. Focus on why you\n" +
                        "are making this change as opposed to how (the code explains that).\n" +
                        "Are there side effects or other unintuitive consequences of this\n" +
                        "change? Here's the place to explain them.";
        validateGitCommitMessage(commitMessage);
    }

    private static void validateGitCommitMessage(final String commitMessage) {
        String[] lines = splitMessedge(commitMessage);
        String subject = lines[0];
        verifyThatSubbjectNoEmpty(subject);
        verifyThatSubbjectSeparatedFromBody(lines);
        verifyThatSubbjectLenghtThan50(subject);
        verifyThatSubbjectCapitalized(subject);
        verifyThatSubbjectNoEndPerioad(subject);
        verifyThatSubbjectIsStarted(subject);
        if (isBodyFound(lines)) {
            verifyThatSubbjectLenghtThan72Chars(subArray(lines, 2));
        }


        System.out.println("Message is valid!");
    }

    private static String[] splitMessedge(String commitMessage) {
        return commitMessage.split("\n");
    }

    private static void verifyThatSubbjectNoEmpty(String subject) {
        if (subject.isEmpty()) {
            System.out.println("Enter a commit message!");
            System.exit(10);
        }
    }

    private static void verifyThatSubbjectSeparatedFromBody(String[] lines) {
        if (lines.length > 1&& !lines[1].isEmpty()) {
            System.out.println("Separate subject body");
            System.exit(1);
        }
    }

    private static void verifyThatSubbjectLenghtThan50(String subject) {
        if (subject.length() >50) {
            System.out.println("Limit the subject"+subject.length());
            System.exit(2);
        }
    }

    private static void verifyThatSubbjectCapitalized(String subject) {
        if (!Character.isUpperCase(subject.charAt(0))) {
            System.out.println("Capitalize the");
            System.exit(3);
        }
    }

    private static void verifyThatSubbjectNoEndPerioad(String subject) {
        char lastChar= subject.charAt(subject.length()-1);
        if (lastChar=='.') {
            System.out.println("Error");
            System.exit(4);
        }
    }

    private static void verifyThatSubbjectIsStarted(String subject) {
        String firstWord = getFirstWord(subject);
        if (!isVerb(firstWord)) {
            System.out.println("The " + firstWord + " is not verb");
            System.exit(5);
        }
    }

    private static String getFirstWord(String subject) {
        return subject.split(" ")[0];
    }

    private static boolean isVerb(String word) {
        for (final String verb : VERBS) {
            if (verb.equals(word)) {
                return true;
            }
        }

        return false;
    }

    private static boolean isBodyFound(String[] lines) {
        return lines.length > 2;
    }

    private static void verifyThatSubbjectLenghtThan72Chars(String[] lines) {
        for (String line : lines) {
            if (line.length() > 72) {
                System.out.println("Warp the body at 72" + line);
                System.exit(6);
            }
        }

    }

    private static String[] subArray(String[] lines, int startIndex) {
        return Arrays.copyOfRange(lines, startIndex, lines.length);
    }
}
