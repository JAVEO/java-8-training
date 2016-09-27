package eu.javeo.training.java8.data;

import eu.javeo.training.java8.data.model.*;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class Data {

    // Users
    public static final User userJaroslawPsikuta = new User("Jarosław", "Psikuta", "jaro.psikuta@o2.pl",  LocalDate.of(2016,  3,  7));
    public static final User userZygfrydWiadro   = new User("Zygfryd",  "Wiadro",  "zigi@gmail.com",      LocalDate.of(2016,  4, 24));
    public static final User userLeopoldKozibak  = new User("Leopold",  "Kozibąk", "kozibak@gmail.com",   LocalDate.of(2016,  5, 16));
    public static final User userWaldemarKilof   = new User("Waldemar", "Kilof",   "waldek.kilof@wp.pl",  LocalDate.of(2015, 11, 17));
    public static final User userRomualdDzik     = new User("Romuald",  "Dzik",    "dziku@onet.eu",       LocalDate.of(2016,  4, 30));
    public static final User userAntoniSzpadel   = new User("Antoni",   "Szpadel", "a.szpadel@gmail.com", LocalDate.of(2015, 12,  4));

    // Products
    public static final Product prodKeyboard   = new Product("Klawiatura",   60);
    public static final Product prodMouse      = new Product("Mysz",         35);
    public static final Product prodNotebook   = new Product("Notebook",   2780);
    public static final Product prodMonitor    = new Product("Monitor",    1240);
    public static final Product prodPrinter    = new Product("Drukarka",    450);
    public static final Product prodTV         = new Product("Telewizor",  3200);
    public static final Product prodSmartphone = new Product("Smartphone", 1520);
    public static final Product prodTablet     = new Product("Tablet",     2470);
    public static final Product prodDrone      = new Product("Dron",       8400);

    // Orders
    public static final List<Order> orders = Arrays.asList(
        new Order(LocalDate.of(2016, 5, 11), userJaroslawPsikuta, new HashMap<Product, Integer>() {{
            put(prodNotebook,   1);
            put(prodSmartphone, 2);
        }}),
        new Order(LocalDate.of(2016, 5, 23), userWaldemarKilof, new HashMap<Product, Integer>() {{
            put(prodTV,         3);
        }}),
        new Order(LocalDate.of(2016, 5, 30), userAntoniSzpadel, new HashMap<Product, Integer>() {{
            put(prodNotebook,   1);
            put(prodMouse,      1);
        }}),
        new Order(LocalDate.of(2016, 6,  2), userLeopoldKozibak, new HashMap<Product, Integer>() {{
            put(prodNotebook,   1);
        }}),
        new Order(LocalDate.of(2016, 6,  7), userRomualdDzik, new HashMap<Product, Integer>() {{
            put(prodKeyboard,   1);
            put(prodMouse,      1);
            put(prodTablet,     1);
            put(prodSmartphone, 1);
        }}),
        new Order(LocalDate.of(2016, 6, 19), userJaroslawPsikuta, new HashMap<Product, Integer>() {{
            put(prodDrone,      3);
        }}),
        new Order(LocalDate.of(2016, 6, 22), userZygfrydWiadro, new HashMap<Product, Integer>() {{
            put(prodTV,         1);
            put(prodMonitor,    1);
        }}),
        new Order(LocalDate.of(2016, 6, 26), userRomualdDzik, new HashMap<Product, Integer>() {{
            put(prodNotebook,   3);
        }}),
        new Order(LocalDate.of(2016, 7, 1), userJaroslawPsikuta, new HashMap<Product, Integer>() {{
            put(prodDrone,      3);
            put(prodTablet,     5);
        }}),
        new Order(LocalDate.of(2016, 7, 12), userAntoniSzpadel, new HashMap<Product, Integer>() {{
            put(prodPrinter,    1);
            put(prodKeyboard,   1);
        }}),
        new Order(LocalDate.of(2016, 7, 14), userJaroslawPsikuta, new HashMap<Product, Integer>() {{
            put(prodPrinter,   10);
        }})
    );

    // Invoices
    public static final List<Invoice> invoices = Arrays.asList(
        new Invoice("FV 11/5/2016", LocalDate.of(2016, 5, 11), userJaroslawPsikuta, Arrays.asList(
            new InvoiceItem(prodSmartphone, 2),
            new InvoiceItem(prodNotebook,   1)
        )),
        new Invoice("FV 23/5/2016", LocalDate.of(2016, 5, 23), userWaldemarKilof, Arrays.asList(
            new InvoiceItem(prodTV, 3)
        )),
        new Invoice("FV 30/5/2016", LocalDate.of(2016, 5, 30), userAntoniSzpadel, Arrays.asList(
            new InvoiceItem(prodNotebook, 1),
            new InvoiceItem(prodMouse,    1)
        )),
        new Invoice("FV 2/6/2016", LocalDate.of(2016, 6,  2), userLeopoldKozibak, Arrays.asList(
            new InvoiceItem(prodNotebook,  1)
        )),
        new Invoice("FV 7/6/2016", LocalDate.of(2016, 6,  7), userRomualdDzik, Arrays.asList(
            new InvoiceItem(prodKeyboard,   1),
            new InvoiceItem(prodMouse,      1),
            new InvoiceItem(prodTablet,     1),
            new InvoiceItem(prodSmartphone, 1)
        )),
        new Invoice("FV 19/6/2016", LocalDate.of(2016, 6, 19), userJaroslawPsikuta, Arrays.asList(
            new InvoiceItem(prodDrone, 3)
        )),
        new Invoice("FV 22/6/2016", LocalDate.of(2016, 6, 22), userZygfrydWiadro, Arrays.asList(
            new InvoiceItem(prodTV,      1),
            new InvoiceItem(prodMonitor, 1)
        )),
        new Invoice("FV 26/6/2016", LocalDate.of(2016, 6, 26), userRomualdDzik, Arrays.asList(
            new InvoiceItem(prodNotebook, 3)
        )),
        new Invoice("FV 1/7/2016", LocalDate.of(2016, 7, 1), userJaroslawPsikuta, Arrays.asList(
            new InvoiceItem(prodDrone,  3),
            new InvoiceItem(prodTablet, 5)
        )),
        new Invoice("FV 12/7/2016", LocalDate.of(2016, 7, 12), userAntoniSzpadel, Arrays.asList(
            new InvoiceItem(prodPrinter,    1),
            new InvoiceItem(prodKeyboard,   1)
        )),
        new Invoice("FV 14/7/2016", LocalDate.of(2016, 7, 14), userJaroslawPsikuta, Arrays.asList(
            new InvoiceItem(prodPrinter,   10)
        ))
    );
}
