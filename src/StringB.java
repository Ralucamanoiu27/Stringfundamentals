public class StringB {
    public static void main(String[] args) {
        StringBuilder  sb= new StringBuilder("abbc");
        sb.append("bba");
        System.out.println(sb);
        sb.delete(3,4);
        System.out.println(sb);
        sb.insert(3,"bbb");
        System.out.println(sb);
        sb.replace(3,6,"c");
        System.out.println(sb);
        sb.insert(3,"a");
        sb.reverse();
        System.out.println(sb);

        ////palindrom//////
        String s="abcba";
        StringBuilder a= new StringBuilder(s);//palindrom
        a.reverse();
        if(s.equals(a.toString())){
            System.out.println("Palindrom");
        }
        // string bilder-ul e mai rapid ,iar string buffer-ul e trigsave cand ai mai multe fire de executie
        StringBuffer stringBuf=new StringBuffer("abc");// folosit pentru trad-uri
        stringBuf.append("Aa").replace(1,2,"aa").reverse().toString();
    }
}
