public class classed {
    public static void main(String[] args){
        String vor = "Mother";
        int i=0;
        for(;i<vor.length();i++);
        System.out.println(i);
        return;
    }

    public static void var(){
        System.out.println(new Test());
        String tap = "Hello";
        String pam = new String("Привет");
        String pom = "Привет";
        if(tap.equals(pom)){
            System.out.println("Они равны!1");
        }
        if(tap==pam){
            System.out.println("Они равны!2");
        }

        tap.length();
        int m = tap.length();
        char top = tap.charAt(0);
        System.out.println(tap.toUpperCase()); //HELLO
        String mop = "Привет мир!";
        String[] map = mop.split(" ");
        for(String each: map){
            System.out.println(each);
        }

        System.out.println(tap.replace('l', 'b'));
        System.out.println(tap.replace("ll", "bb"));
    }
}

class Test{

}
