package design.pattern2.builder;

public class SourceCode {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append(100).append("hello").toString());

        String s = null;
        System.out.println(stringBuilder.append(s));
    }
}
