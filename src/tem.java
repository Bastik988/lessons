public class tem {
    public static void main(String[] args) {
        try {
            System.out.println(2/0);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Привета");
        tem.delision2(5, 0);
        System.out.println("Траляя");
    }

    public static double delision(int delim, int delit) throws Exception{
        if(delit==0){
            throw new Exception("на 0 делить нельзя");
        }
        return delim/delit;
    }

    public static double delision2(int delim, int delit){
        if(delit==0){
            try {
                throw new Exception("на 0 делить нельзя");
            } catch (Exception e) {
                e.printStackTrace();
            }
            return -1;
        }
        return delim/delit;
    }
}
