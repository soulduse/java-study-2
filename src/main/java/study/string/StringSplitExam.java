package study.string;

/**
 * Created by sould on 2016-05-10.
 */
public class StringSplitExam {

    public static void main(String[] args) {
        String      data = "사과*배*파인애플*망고*수박";
        String delimiter = "\\*";

        String[] dataArr = data.split(delimiter);

        for(int i=0; i<dataArr.length; i++)
            System.out.println(dataArr[i]);
    }
}
