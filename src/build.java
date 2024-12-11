public class build {
    public static void main(String[] args){
        StringBuilder top = new StringBuilder("Hello world!");
        top.append(5);
        top.setCharAt(0, 'm');
        System.out.println(top.charAt(0));
        top.delete(0, 2);
        top.deleteCharAt(7);
        top.insert(3, "lou");
        System.out.println(top);
        top.replace(0, 3, "Xauwa");
        System.out.println(top);

        String map = String.valueOf(top);


    }
}