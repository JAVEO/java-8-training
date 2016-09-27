package eu.javeo.training.java8.data.model;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Invoice {
    private final String number;
    private final User user;
    private final LocalDate dataOfIssue;
    private final List<InvoiceItem> items;

    public Invoice(String number, LocalDate dataOfIssue, User user, List<InvoiceItem> items) {
        this.number = number;
        this.dataOfIssue = dataOfIssue;
        this.user = user;
        this.items = Collections.unmodifiableList(items);
    }

    public String getNumber() {
        return number;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getDataOfIssue() {
        return dataOfIssue;
    }

    public List<InvoiceItem> getItems() {
        return items;
    }

    @Override
    public String toString() {
        return "Invoice " + number + " of " + dataOfIssue + " for " + user.getFirstName() + " " + user.getLastName() + "\n" +
                items.stream().map(InvoiceItem::toString).collect(Collectors.joining("\n"));
    }
}
