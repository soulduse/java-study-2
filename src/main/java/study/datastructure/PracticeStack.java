package study.datastructure;

import java.util.Stack;

/**
 * Created by developerkhy@gmail.com on 2017. 5. 25.
 * Blog      : http://soulduse.tistory.com
 * Github    : http://github.com/soulduse
 */
public class PracticeStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("beginSize : "+stack.size());

        for(int i=0; i<stack.size(); i++){
            System.out.print(stack.get(i)+"\t");
        }
        System.out.println();
        for(int i=0; i<5; i++){
            stack.pop();
        }

        System.out.println("endSize : "+stack.size());
    }
}
