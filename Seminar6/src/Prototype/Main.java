package Prototype;

import Prototype.concrete.Report;
import Prototype.concrete.ReportGenerator;
import Prototype.generic.Client;
import Prototype.generic.Prototype;

public class Main {

    public static void main(String[] args) {
        Client client = new Client();
        Prototype prototypeA = client.create("A");
        Prototype prototypeB = client.create("B");


        ReportGenerator reportGenerator = new ReportGenerator();
        Report salesReport = reportGenerator.generateReport("sales", "Sales data", "PDF");
        Report marketingReport = reportGenerator.generateReport("marketing", "Marketing data", "Excel");

    }
}
