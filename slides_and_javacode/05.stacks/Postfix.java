import java.util.Stack;
public class Postfix {
    private String exp;
    public Postfix(String exp) {
        this.exp = exp;
    }
    public static void main(String[] args) {
        System.out.println(new Postfix(args[0]).calc());
    }
    public Integer calc() {
        Stack<String> stack = new Stack<>();
        String ops = "[+-*/]";
        Integer res = 0, numOne, numTwo;
        for (String ex : exp.split(" ")) {
            stack.push(ex);
            System.out.println(ex);
            if (ex.matches(ops)) {
                stack.pop();
                numTwo = Integer.valueOf(stack.pop());
                numOne = Integer.valueOf(stack.pop());
                switch (ex) {
                    case "+" :
                        res += Integer.valueOf(numOne.intValue() + numTwo.intValue());
                        break;
                    case "-" :
                        res += Integer.valueOf(numOne.intValue() - numTwo.intValue());
                        break;
                    case "*" :
                        res += Integer.valueOf(numOne.intValue() * numTwo.intValue());
                        break;
                    case "/" :
                        res += Integer.valueOf(numOne.intValue() / numTwo.intValue());
                        break;
                    default :
                        break;
                }
            }
        }
        return res;
    }
}
