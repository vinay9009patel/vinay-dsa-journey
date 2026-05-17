class Solution {

    public int calculate(String s) {

        Stack<Integer> st =
                new Stack<>();

        int number = 0;

        int result = 0;

        int sign = 1;

        for (int i = 0;
             i < s.length();
             i++) {

            char c = s.charAt(i);

            // digit
            if (Character.isDigit(c)) {

                number =
                        number * 10
                        + (c - '0');

            }

            // plus
            else if (c == '+') {

                result =
                        result +
                        (sign * number);

                number = 0;

                sign = 1;
            }

            // minus
            else if (c == '-') {

                result =
                        result +
                        (sign * number);

                number = 0;

                sign = -1;
            }

            // open bracket
            else if (c == '(') {

                st.push(result);

                st.push(sign);

                result = 0;

                number = 0;

                sign = 1;
            }

            // close bracket
            else if (c == ')') {

                result =
                        result +
                        (sign * number);

                number = 0;

                int lastSign =
                        st.pop();

                int lastResult =
                        st.pop();

                result =
                        lastResult +
                        (lastSign * result);
            }
        }

        // last number
        result =
                result +
                (sign * number);

        return result;
    }
}
