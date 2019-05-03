public class Cake
{
    private int strawberryNumber;
    private int price;

    public Cake(int strawberryNumber, int price)
    {
        this.strawberryNumber = strawberryNumber;
        this.price = price;
    }

    public int getStrawberryNumber() {
        return strawberryNumber;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "strawberryNumber=" + strawberryNumber +
                '}';
    }
}
