package Singleton;

//import java.util.ArrayList;

//PrinterManager class
public class PrinterManager extends Printer{

    private static PrinterManager single_instance; //single instance of printer 
    public Printer[] printers; //array of printers

    //private constructor
    private PrinterManager(int numPrinters){
        printers = new Printer[numPrinters];
        for(int i = 0; i < numPrinters; i++){
            printers[i] = new Printer();
        }
    }

    //important method for returning singleton instance 
    public static PrinterManager getInstance(){
        if(single_instance == null){
            single_instance = new PrinterManager(10);
        }
        return single_instance;
    }

    //assign a job to printer
    public String assignJob(String job){     
        for(Printer printer: printers){
            if(printer.isBusy() == false){
                printer.setBusy(true);
                printer.setPrintJob(job);
                return "Job has been assigned";
            }
        }
        return "All printers are busy, please try again later";
    }

    //show status of printer 
    public void showStatus(){
        for(Printer  printer : printers) {
            if(printer.isBusy){
                System.out.println("Printer " + printer + " is busy with: " + printer.getPrintJob());
            }
            else{
                System.out.println("Printer " + printer + " is available");
            }
        }
        System.out.println("");
    }

}
