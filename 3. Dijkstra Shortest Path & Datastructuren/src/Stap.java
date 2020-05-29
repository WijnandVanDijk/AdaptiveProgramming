public class Stap {
    public Node n;
    public int distance;
    public Object typeReis;
    public int price;
    public int tijdInMinuten;

    public Stap(Node n, int distance, Object typeReis,int price,int tijdInMinuten) {
        this.n = n;
        this.distance = distance;
        this.typeReis = typeReis;
        this.price = price;
        this.tijdInMinuten = tijdInMinuten;
    }

    public int getTijdInMinuten() {
        return tijdInMinuten;
    }

    public void setTijdInMinuten(int tijdInMinuten) {
        this.tijdInMinuten = tijdInMinuten;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Node getN() {
        return n;
    }

    public void setN(Node n) {
        this.n = n;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getTypeReis() {
        return typeReis.toString().substring(9);
    }

    public void setTypeReis(Object typeReis) {
        this.typeReis = typeReis;
    }

    @Override
    public String toString() {
        return  "" + n.getName() +
                " distance = " + distance +
                "            Vervoer(werkt niet) = " + getTypeReis() +
                "            prijs = "+price +
                "            Tijd in minuten = "+ tijdInMinuten;
    }
}