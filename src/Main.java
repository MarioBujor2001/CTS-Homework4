public class Main {
    public static void main(String[] args) {
        // testare instanta obiect nou
        // Server x = new Server();
        // /preluare instanta singleton
        Server x = Server.getInstance(8080, "localhost");
        System.out.println(x.showStatus());

        /*
         O fabrica de masini care implementeaza un sistem centralizat de monitorizare
         a productiei. Sistemul trebuie sa asigure adaugarea si modificarea datelor despre masinile fabricate
         la nivelul sediului central, intr-un mediu securizat(sistemul va exista sub forma unui server dispus in datacenterul
         din HQ). Programatorii trebuie sa se asigure ca sistemul nu va putea fi replicat si ca toate datele vor fi
         manageriate prin intermediul unui singur server mentionat anterior.
        */

    }
}