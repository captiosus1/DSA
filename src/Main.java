//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] expressions = {"<>>>","<>>>>"};
        int[] maxReplacemnts = {2,2};
        int[] result = canBeBalanced(expressions, maxReplacemnts);
        for(int res : result) {
            System.out.println(res);
        }
    }

    public static int[] canBeBalanced(String[] expressions, int[] maxReplacements) {
        int[] Replacemnets = new int[expressions.length];
        for (int i = 0; i < expressions.length; i++) {
            String expression = expressions[i];
            int maxReplacement = maxReplacements[i];
            int imbalance = 0;
            int replacementNeeded = 0;

            for (char ch : expression.toCharArray()) {
                if (ch == '<') {
                    imbalance++;
                } else if (ch == '>') {
                    if (imbalance > 0) {
                        imbalance--;
                    } else {
                        replacementNeeded++;
                    }
                }
            }

            replacementNeeded += imbalance;
            if (replacementNeeded > maxReplacement) {
                Replacemnets[i] = 0;
            } else
                Replacemnets[i] = 1;


        }
        return Replacemnets;
    }
}