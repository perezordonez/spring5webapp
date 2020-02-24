package guru.springframework.spring5webapp.runner;

import guru.springframework.spring5webapp.invoice.Invoice;
import guru.springframework.spring5webapp.invoice.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class AppRunner implements CommandLineRunner {
    @Autowired
    InvoiceRepository selectedInvoices;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("hello world!");


        Invoice v1 = new Invoice("111");
        Invoice v2 = new Invoice("222");
        Invoice v3 = new Invoice("333");

        selectedInvoices.save(v1);
        selectedInvoices.save(v2);
        selectedInvoices.save(v3);


        System.out.println("all saved");

    }
}
