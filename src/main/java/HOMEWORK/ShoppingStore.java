package HOMEWORK;


    class ShoppingStore{
        String item;
        double price;
        int quantity;

        public ShoppingStore(String item,double price,int quantity){
            this.item=item;
            this.price=price;
            this.quantity=quantity;

        }
        public double itemTotalPrice(){
            double totalValue=price+quantity;
            System.out.println(item+" The toatal value is "+totalValue);
            return totalValue;


        }


        public static void main(String[]args){
            ShoppingStore dress=new ShoppingStore("Dress",29.99,3);
            ShoppingStore shoes=new ShoppingStore("Shoes ",19.99,2);
            double dressTotal=dress.itemTotalPrice();
            double shoesTotal=shoes.itemTotalPrice();
            double totalBalance=dressTotal+shoesTotal;
            System.out.println("Your total balance is "+totalBalance);
        }
    }

