package TugasPraktikum;

public class Main {
    public static void main(String[] args) {

        Invoice[] invoices = {
            new Invoice("Beras", 2, 50000),
            new Invoice("Minyak", 1, 20000),
            new Invoice("Gula", 3, 15000),
            new Invoice("Telur", 10, 3000)
        };

        Employee employee1 = new Employee(505, "Syududu", 3500000, invoices);
        employee1.tampilDetail();
    }



}