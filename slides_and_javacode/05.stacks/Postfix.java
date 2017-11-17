import java.util.Stack;
public class Postfix {
    private String exp;
    public Postfix(String exp) {
        this.exp = exp;
    }
    public static void main(String[] args) {
        System.out.print("= " + new Postfix(args[0]).calc());
    }
    public Integer calc() {
        Stack<Integer> stack = new Stack<>();
        String ops = "[+\\-*/]";
        Integer res = 0, numOne = 0, numTwo = 0;
        for (String ex : this.exp.split(" ")) {
            System.out.print(ex + " ");
            if (ex.matches(ops)) {
                numTwo = stack.pop();
                numOne = stack.pop();
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
                stack.push(res);
            } else {
                stack.push(Integer.valueOf(ex));
            }
        }
        return res;
    }
}
