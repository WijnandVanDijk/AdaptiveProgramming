public class Vlucht extends Stap {

    public Vlucht(Node n, int distance, Object typeReis,int price,int tijdInMinuten){
        super(n, distance, typeReis,price, tijdInMinuten);
    }

    @Override
    public String toString() {
        return "Vlucht";
    }
}