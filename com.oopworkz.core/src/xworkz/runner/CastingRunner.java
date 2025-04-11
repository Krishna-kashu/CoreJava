package xworkz.runner;

import com.access.Door;
import com.access.SmartDoor;
import com.account.Account;
import com.account.SavingsAccount;
import com.appliance.Appliance;
import com.appliance.WashingMachine;
import com.artist.Paint;
import com.artist.SprayPaint;
import com.banktransaction.BankTransaction;
import com.banktransaction.WithdrawalTransaction;
import com.bathroom.Mirror;
import com.bathroom.SmartMirror;
import com.book.Book;
import com.book.EBook;
import com.chair.Chair;
import com.chair.ReclinerChair;
import com.climate.CeilingFan;
import com.climate.Fan;
import com.computing.GamingLaptop;
import com.computing.NotebookComputer;
import com.furnitureplus.MassageChair;
import com.microwave.Microwave;
import com.microwave.SmartMicrowave;
import com.officechair.OfficeChair;
import com.security.Camera;
import com.security.SecurityCamera;
import xworkz.casting.Casting;
import com.bed.Bed;
import com.bed.AdjustableBed;
import com.bottle.Bottle;
import com.bottle.WaterBottle;
import com.hygine.ToothBrush;
import com.brush.Brush;
import com.brush.ElectricBrush;

public class CastingRunner {
    public static void main(String[] args) {
        Casting casting = new Casting();

        // Door hierarchy
        Door door = new Door();
        SmartDoor smartDoor = new SmartDoor();
        Door doorRef = new SmartDoor();
        casting.close(door);
        casting.close(smartDoor);
        casting.close(doorRef);

        System.out.println("------------------------------------");

        // Account hierarchy
        Account account = new Account();
        SavingsAccount savings = new SavingsAccount();
        Account accountRef = new SavingsAccount();
        casting.checkAccount(account);
        casting.checkAccount(savings);
        casting.checkAccount(accountRef);

        System.out.println("------------------------------------");

        // Appliance hierarchy
        Appliance appliance = new Appliance();
        WashingMachine wm = new WashingMachine();
        Appliance applianceRef = new WashingMachine();
        casting.runAppliance(appliance);
        casting.runAppliance(wm);
        casting.runAppliance(applianceRef);

        System.out.println("------------------------------------");

        // Paint hierarchy
        Paint paint = new Paint();
        SprayPaint spray = new SprayPaint();
        Paint paintRef = new SprayPaint();
        casting.paint(paint);
        casting.paint(spray);
        casting.paint(paintRef);


        System.out.println("\n--- BankTransaction  ---");
        BankTransaction txn = new BankTransaction();
        WithdrawalTransaction withdraw = new WithdrawalTransaction();
        BankTransaction refTxn = new WithdrawalTransaction();

        casting.checkTransaction(txn);
        casting.checkTransaction(withdraw);
        casting.checkTransaction(refTxn);

        System.out.println("\n--- Mirror  ---");
        Mirror mirror = new Mirror();
        SmartMirror smart = new SmartMirror();
        Mirror refMirror = new SmartMirror();

        casting.checkMirror(mirror);
        casting.checkMirror(smart);
        casting.checkMirror(refMirror);

        System.out.println("\n--- Bed  ---");
        Bed bed = new Bed();
        AdjustableBed adjustable = new AdjustableBed();
        Bed refBed = new AdjustableBed();

        casting.checkBed(bed);
        casting.checkBed(adjustable);
        casting.checkBed(refBed);
        System.out.println("\n--- Book  ---");
        Book book = new Book();
        EBook novel = new EBook();
        Book refBook = new EBook();

        casting.checkBook(book);
        casting.checkBook(novel);
        casting.checkBook(refBook);

        System.out.println("\n--- Bottle  ---");
        Bottle bottle = new Bottle();
        WaterBottle waterBottle = new WaterBottle();
        Bottle bottle1 = new WaterBottle();

        casting.checkBottle(bottle);
        casting.checkBottle(waterBottle);
        casting.checkBottle(bottle1);

        System.out.println("\n---- Camera  ----");
        Camera camera = new Camera();
        SecurityCamera security = new SecurityCamera();
        com.security.Camera camera1 = new com.security.Camera();

        casting.monitor(camera);
        casting.monitor(security);
        casting.monitor(camera1);

        System.out.println("\n---- Chair (com.chair) ----");
        Chair chair = new Chair();
        ReclinerChair recliner = new ReclinerChair();
        Chair refChair = new ReclinerChair();
        casting.relax(chair);
        casting.relax(recliner);
        casting.relax(refChair);

        System.out.println("\n---- Chair (com.furnitureplus) ----");
        com.furnitureplus.Chair furnitureChair = new com.furnitureplus.Chair();
        MassageChair massageChair = new MassageChair();
        com.furnitureplus.Chair refFurnitureChair = new MassageChair();
        casting.massage(furnitureChair);
        casting.massage(massageChair);
        casting.massage(refFurnitureChair);

        System.out.println("\n---- Chair (com.officechair) ----");
        com.officechair.Chair officeChair = new com.officechair.Chair();
        OfficeChair office = new OfficeChair();
        com.officechair.Chair refOfficeChair = new OfficeChair();
        casting.roll(officeChair);
        casting.roll(office);
        casting.roll(refOfficeChair);

        System.out.println("\n--- Brush  ---");
        com.brush.Brush brush = new com.brush.Brush();
        ElectricBrush electric = new ElectricBrush();
        Brush brushRef = new ElectricBrush();
        casting.brush(brush);
        casting.brush(electric);
        casting.brush(brushRef);

        System.out.println("\n---  Hygine Brush---");
        com.hygine.Brush  brush1 = new com.hygine.Brush();
        ToothBrush toothBrush = new ToothBrush();
        com.hygine.Brush brush2 = new com.hygine.Brush();
        casting.brushTeeth(brush1);
        casting.brushTeeth(toothBrush);
        casting.brushTeeth(brush2);

        System.out.println("\n--- Fan  ---");
        Fan fan = new Fan();
        CeilingFan ceiling = new CeilingFan();
        Fan fanRef = new CeilingFan();
        casting.Stop(fan);
        casting.Stop(ceiling);
        casting.Stop(fanRef);

        System.out.println("\n--- Laptop  ---");
        NotebookComputer laptop = new NotebookComputer();
        GamingLaptop gaming = new GamingLaptop();
        NotebookComputer laptopRef = new GamingLaptop();
        casting.benchmark(laptop);
        casting.benchmark(gaming);
        casting.benchmark(laptopRef);

        System.out.println("\n--- Microwave Hierarchy ---");
        Microwave microwave = new Microwave();
        SmartMicrowave smartMicrowave = new SmartMicrowave();
        Microwave ref = new SmartMicrowave();

        casting.cook(microwave);
        casting.cook(smartMicrowave);
        casting.cook(ref);


    }
}
