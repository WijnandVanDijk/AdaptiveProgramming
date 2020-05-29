public class Treinrit extends Stap{

    public Treinrit(Node n, int distance, Object typeReis,int price,int tijdInMinuten) {
        super(n, distance, typeReis,price,tijdInMinuten);
    }
    @Override
    public String toString() {
        return "Trein";
    }
}