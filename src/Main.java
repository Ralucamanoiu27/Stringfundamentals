public class Main {
    public static void main(String[] args) {// ca  sa intram in clasa strig sa vedem ce functii exista  dublu clic si apoi control+clic


        String a = "    abcd    ";
        String c = a.concat(a);
        String e;
        e = c.trim();// scoate spatiile din fata si spate ca in excel
        int q=a.length();
        boolean contain= a.contains("ab");
        boolean startWith= a.startsWith("abc");
        boolean endWith= a.endsWith("b");
         int  compare = a.compareTo("abc");




    }
}

