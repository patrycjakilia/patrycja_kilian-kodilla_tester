public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year){
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice(){
        if(this.price < 600){
            System.out.println("This notebook is very cheap.");
        }else if (this.price >= 600 && this.price <= 1000){
            System.out.println("The price is good.");
        }else {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight(){
        if(this.weight <= 600){
            System.out.println("The device is light.");
        } else if (this.weight > 600 && this.weight < 800) {
            System.out.println("The device is not very heavy");
        } else {
            System.out.println("The device is heavy");
        }
    }

    public void checkPriceandYear(){
        if (this.year >= 2024 && this.price >= 3600){
            System.out.println("Laptop o cenie powyżej 3600zł wyprodukowany po 2023 roku.");
        } else if (this.year > 2022 && this.year < 2024 && this.price < 3600 && this.price > 2500) {
            System.out.println("Laptop w przedziale cenowym pomiędzy 2500 - 3600zł wyprodukowany w 2023 roku.");
        } else {
            System.out.println("Laptop wyrodukowany przed 2023 rokiem w cenie do 2500zł");
        }
    }

}
