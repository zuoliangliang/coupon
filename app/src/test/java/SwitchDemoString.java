import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;

import java.util.List;
import java.util.Map;

/**
 *  java -jar .\cfr_0_125.jar SwitchDemoString.class --decodestringswitch false    --decodelambdas false
 *  查看java是如何处理switch string  跟   lambdas 的
 */
public class SwitchDemoString {
    public static void main(String[] args) {
        switchMethod();

        lambdasTest();
    }

    private static void lambdasTest() {
        List<String> strList = ImmutableList.of("Hollis", "公众号：Hollis", "博客：www.hollischuang.com");
        Map<Integer,Integer> strMap = ImmutableMap.of(1,2,3,4,5,6);

        strList.forEach(System.out::println);
    }

    private static void switchMethod() {
        String str = "world";
        switch (str) {
            case "hello":
                System.out.println("hello");
                break;
            case "world":
                System.out.println("world");
                break;
            default:
                break;
        }
    }
}