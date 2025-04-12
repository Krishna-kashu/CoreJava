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
import com.container.ThermoBottle;
import com.content.Content;
import com.content.VideoContent;
import com.contract.Contract;
import com.contract.FreelanceContract;
import com.control.Remote;
import com.control.SmartRemote;
import com.cooking.Recipe;
import com.cooking.VeganRecipe;
import com.course.Course;
import com.course.JavaCourse;
import com.dashboard.Dashboard;
import com.dashboard.UserDashboard;
import com.document.Document;
import com.document.PDFDocument;
import com.door.SlidingDoor;
import com.editor.Editor;
import com.editor.PhotoEditor;
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
import com.electronics.Device;
import com.electronics.Smartphone;
import com.file.File;
import com.file.TextFile;
import com.footwear.RunningShoe;
import com.footwear.Shoe;
import com.form.Form;
import com.form.RegistrationForm;
import com.game.BoardGame;
import com.game.Game;

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

        System.out.println("\n--- Microwave  ---");
        Microwave microwave = new Microwave();
        SmartMicrowave smartMicrowave = new SmartMicrowave();
        Microwave ref = new SmartMicrowave();

        casting.cook(microwave);
        casting.cook(smartMicrowave);
        casting.cook(ref);

        System.out.println("\n--- Content  ---");
        Content content = new Content();
        VideoContent video = new VideoContent();
        Content content1 = new VideoContent();

        casting.stream(content);
        casting.stream(video);
        casting.stream(content1);
        System.out.println("\n--- Dashboard ---");
        Dashboard dashboard = new Dashboard();
        UserDashboard userDashboard = new UserDashboard();
        Dashboard dashboardRef = new UserDashboard();

        casting.view(dashboard);
        casting.view(userDashboard);
        casting.view(dashboardRef);

        System.out.println("\n--- Document ---");
        Document document = new Document();
        PDFDocument pdfDocument = new PDFDocument();
        Document docRef = new PDFDocument();

        casting.print(document);
        casting.print(pdfDocument);
        casting.print(docRef);

        System.out.println("\n--- Door ---");
        com.door.Door door1 = new com.door.Door();
        SlidingDoor slidingDoor = new SlidingDoor();
        com.door.Door door2 = new SlidingDoor();

        casting.slide(door1);
        casting.slide(slidingDoor);
        casting.slide(door2);

        System.out.println("\n--- Editor ---");
        Editor editor = new Editor();
        PhotoEditor photoEditor = new PhotoEditor();
        Editor editorRef = new PhotoEditor();

        casting.edit(editor);
        casting.edit(photoEditor);
        casting.edit(editorRef);

        System.out.println("\n--- Remote  ---");
        Remote remote = new Remote();
        SmartRemote smartRemote = new SmartRemote();
        Remote remote1 = new SmartRemote();

        casting.operate(remote);
        casting.operate(smartRemote);
        casting.operate(remote1);

        System.out.println("\n--- Recipe  ---");
        Recipe recipe = new Recipe();
        VeganRecipe vegan = new VeganRecipe();
        Recipe recipe1 = new VeganRecipe();

        casting.cook(recipe);
        casting.cook(vegan);
        casting.cook(recipe1);

        System.out.println("\n--- Contract  ---");
        Contract contract = new Contract();
        FreelanceContract freelance = new FreelanceContract();
        Contract contract1 = new FreelanceContract();

        casting.sign(contract);
        casting.sign(freelance);
        casting.sign(contract1);

        System.out.println("\n--- Course  ---");
        Course course = new Course();
        JavaCourse java = new JavaCourse();
        Course course1 = new JavaCourse();

        casting.enroll(course);
        casting.enroll(java);
        casting.enroll(course1);

        System.out.println("\n--- Bottle  ---");
        com.container.Bottle bottle2 = new com.container.Bottle();
        ThermoBottle thermoBottle = new ThermoBottle();
        com.container.Bottle bottle3 = new ThermoBottle();

        casting.fillBottle(bottle2);
        casting.fillBottle(thermoBottle);
        casting.fillBottle(bottle3);

        System.out.println("\n--- Electronics Device ---");
        Device device = new Device();
        Smartphone smartphone = new Smartphone();
        Device deviceRef = new Smartphone();

        casting.operate(device);
        casting.operate(smartphone);
        casting.operate(deviceRef);

        System.out.println("\n--- Fan Device ---");
        com.fan.Device fanDevice = new com.fan.Device();
        com.fan.Fan fan1 = new com.fan.Fan();
        com.fan.Device fanRef2 = new com.fan.Fan();

        casting.control(fanDevice);
        casting.control(fan1);
        casting.control(fanRef2);

        System.out.println("\n--- File ---");
        File file = new File();
        TextFile textFile = new TextFile();
        File fileRef = new TextFile();

        casting.read(file);
        casting.read(textFile);
        casting.read(fileRef);

        System.out.println("\n--- Footwear ---");
        Shoe shoe = new Shoe();
        RunningShoe runningShoe = new RunningShoe();
        Shoe shoeRef = new RunningShoe();

        casting.wear(shoe);
        casting.wear(runningShoe);
        casting.wear(shoeRef);

        System.out.println("\n--- Form ---");
        Form form = new Form();
        RegistrationForm registration = new RegistrationForm();
        Form formRef = new RegistrationForm();

        casting.fill(form);
        casting.fill(registration);
        casting.fill(formRef);

        System.out.println("\n--- Game ---");
        Game game = new Game();
        BoardGame boardGame = new BoardGame();
        Game gameRef = new BoardGame();

        casting.play(game);
        casting.play(boardGame);
        casting.play(gameRef);

    }
    }
