import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by ZhangYucong on 2017/3/10.
 */
public class GroupingGenerator {
    public static void main(String[] args){
        int scNum = 0;
        int gNum = 0;
        List<List<List<Integer>>> scGrouping  = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        System.out.println("Input number of scan chains: ");
        scNum = input.nextInt();
        System.out.println("Input number of groups: ");
        gNum = input.nextInt();

        ArrayList<Integer> scanChain = new ArrayList<Integer>(scNum);
        for(int i=0; i<scNum; i++){
            scanChain.add(i);
//            System.out.println(scanChain.get(i));
        }
//        System.out.println(gNum);

        DepthFirst depthFirst = new DepthFirst();
        System.out.println("total number of different grouping: " + depthFirst.stirlingNum(scNum, gNum));
        depthFirst.reGrouping(scanChain, gNum).stream().forEach(System.out::println);
    }
}
