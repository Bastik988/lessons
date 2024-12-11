public class Main {
        private String name;
        private double price;
        private int quantity;
        Main(String name, double price, int quantity){
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
        public static void main(String[] args){
            Main a = new Main("Яблоко", 45.99, 45);
            Main bread = new Main("Хлеб", 35.99, 30);
            Inventory inventory = new Inventory(15);
            inventory.addMethod(a);
            inventory.addMethod(bread);
            System.out.println(inventory.getTotalValue());
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void setQuantity(int quantity) {
            this.quantity = quantity;
        }
    }

    class Inventory{
        Main[] map;
        private int n = 0;

        Inventory(int i){
            map = new Main[i];
        }

        public void addMethod(Main a) {
            map[n] = a;
            n++;
        }

        public int getN() {
            return n;
        }

        public void setN(int n) {
            this.n = n;
        }

        public int getTotalValue(){
            int result = 0;
            for(int i=0;i<n;i++){
                result += map[i].getQuantity()*map[i].getPrice();
            }
            return result;
        }
    }
