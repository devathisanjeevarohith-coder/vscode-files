public class StringDemo{
    public static void main(String[] args){
        String s1 = "My";
        String s2 = "Java";
        System.out.println(s1.length()+" "+s2.length());
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        String s3 = s1.concat(s2);
        System.out.println(s3);
    }
}