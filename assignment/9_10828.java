import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static int size;
    public static Stack<Integer> stack;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = null;
        stack = new Stack<Integer>();

        size = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            st = new StringTokenizer(br.readLine());

            String type = st.nextToken();
            if ("push".equals(type)) {
                int num = Integer.parseInt(st.nextToken());
                stack.push(num);
            } else if ("top".equals(type)) {
                sb.append((stack.size() == 0) ? -1 + "\n" : stack.peek() + "\n");
            } else if ("pop".equals(type)) {
                sb.append((stack.size() == 0) ? -1 + "\n" : stack.pop() + "\n");
            } else if ("size".equals(type)) {
                sb.append(stack.size() + "\n");
            } else if ("empty".equals(type)) {
                sb.append((stack.isEmpty()) ? 1 + "\n" : 0 + "\n");
            }
        }
        System.out.println(sb.toString());
    }
}