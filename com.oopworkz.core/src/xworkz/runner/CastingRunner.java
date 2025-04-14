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
import com.gamelevel.BonusLevel;
import com.gamelevel.GameLevel;
import com.home.Refrigerator;
import com.hydration.SmartBottle;
import com.inputdevice.Keyboard;
import com.inputdevice.MechanicalKeyboard;
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
import com.instrument.Guitar;
import com.instrument.Instrument;
import com.interior.Furniture;
import com.interior.Table;
import com.jar.Container;
import com.jar.Jar;
import com.kitchen.DesignerMug;
import com.kitchen.Mug;
import com.kitchenware.Cup;
import com.kitchenware.TravelCup;
import com.lamp.Lamp;
import com.lamp.DeskLamp;
import com.lesson.Lesson;
import com.lesson.MathLesson;
import com.library.AudioBook;
import com.light.Light;
import com.light.SmartLight;
import com.locker.Locker;
import com.locker.DigitalLocker;
import com.mediaFile.MediaFile;
import com.mediaFile.AudioFile;
import com.message.Message;
import com.message.TextMessage;
import com.mirror.DigitalMirror;
import com.navigator.Map;
import com.navigator.GPSMap;
import com.notebook.Notebook;
import com.notebook.SpiralNotebook;
import com.notes.DigitalNotebook;
import com.camera.DSLR;
import com.notification.Notification;
import com.notification.EmailNotification;
import com.office.Printer;
import com.office.LaserPrinter;
import com.organizer.Calendar;
import com.organizer.DigitalCalendar;
import com.paymentMethod.PaymentMethod;
import com.paymentMethod.CreditCard;
import com.ticketing.TicketMachine;
import com.ticketing.TrainTicketMachine;
import com.time.Clock;
import com.time.SmartClock;
import com.timekeeping.AlarmClock;
import com.tool.Hammer;
import com.tool.Tool;
import com.toolbox.ToolBox;
import com.toolbox.Wrench;
import com.transaction.Transaction;
import com.transaction.OnlineTransaction;
import com.transport.Car;
import com.transport.Vehicle;
import com.travel.Bag;
import com.travel.LaptopBag;
import com.tv.TV;
import com.tv.TVRemote;
import com.user.User;
import com.user.AdminUser;
import com.wearables.Watch;
import com.wearables.SmartWatch;
import com.website.Website;
import com.website.Blog;
import com.workshop.Drill;
import com.writing.Pen;
import com.writing.FountainPen;


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

        System.out.println("\n--- Home Appliance ---");
        com.home.Appliance appliance1 = new com.home.Appliance();
        Refrigerator fridge = new Refrigerator();
        com.home.Appliance applianceRef1 = new Refrigerator();

        casting.use(appliance1);
        casting.use(fridge);
        casting.use(applianceRef1);

        System.out.println("\n--- Hydration Bottle ---");
        com.hydration.Bottle bottle4 = new com.hydration.Bottle();
        SmartBottle smartBottle = new SmartBottle();
        com.hydration.Bottle bottleRef = new SmartBottle();

        casting.check(bottle4);
        casting.check(smartBottle);
        casting.check(bottleRef);

        System.out.println("\n--- Input Device Keyboard ---");
        Keyboard keyboard = new Keyboard();
        MechanicalKeyboard mechanicalKeyboard = new MechanicalKeyboard();
        Keyboard keyboardRef = new MechanicalKeyboard();

        casting.type(keyboard);
        casting.type(mechanicalKeyboard);
        casting.type(keyboardRef);

        System.out.println("\n--- Instrument ---");
        Instrument instrument = new Instrument();
        Guitar guitar = new Guitar();
        Instrument instrumentRef = new Guitar();

        casting.play(instrument);
        casting.play(guitar);
        casting.play(instrumentRef);

        System.out.println("\n--- GameLevel (BonusLevel) ---");
        GameLevel baseLevel = new GameLevel();
        BonusLevel bonusLevel = new BonusLevel();
        GameLevel refBonus = new BonusLevel();

        casting.progress(baseLevel);
        casting.progress(bonusLevel);
        casting.progress(refBonus);

        System.out.println("\n--- Interior Furniture ---");
        Furniture furniture = new Furniture();
        Table table = new Table();
        Furniture furnitureRef = new Table();

        casting.place(furniture);
        casting.place(table);
        casting.place(furnitureRef);

        System.out.println("\n--- Jar Container ---");
        Container container = new Container();
        Jar jar = new Jar();
        Container containerRef = new Jar();

        casting.store(container);
        casting.store(jar);
        casting.store(containerRef);

        System.out.println("\n--- Kitchen Mug ---");
        Mug mug = new Mug();
        DesignerMug designer = new DesignerMug();
        Mug mugRef = new DesignerMug();

        casting.drink(mug);
        casting.drink(designer);
        casting.drink(mugRef);

        System.out.println("\n--- Kitchenware Cup ---");
        Cup cup = new Cup();
        TravelCup travel = new TravelCup();
        Cup cupRef = new TravelCup();

        casting.pour(cup);
        casting.pour(travel);
        casting.pour(cupRef);

        System.out.println("\n--- Lamp ---");
        Lamp lamp = new Lamp();
        DeskLamp deskLamp = new DeskLamp();
        Lamp lampRef = new DeskLamp();

        casting.switchOn(lamp);
        casting.switchOn(deskLamp);
        casting.switchOn(lampRef);

        System.out.println("\n--- Document (PDFDocument) ---");
        Document document1 = new Document();
        PDFDocument pdfDoc = new PDFDocument();
        Document refPdf = new PDFDocument();

        casting.print(document1);
        casting.print(pdfDoc);
        casting.print(refPdf);

        System.out.println("\n--- Game (BoardGame) ---");
        Game baseGame = new Game();
        BoardGame boardGame1 = new BoardGame();
        Game refBoard = new BoardGame();

        casting.play(baseGame);
        casting.play(boardGame1);
        casting.play(refBoard);

        System.out.println("\n--- Lesson ---");
        Lesson lesson = new Lesson();
        MathLesson math = new MathLesson();
        Lesson lessonRef = new MathLesson();

        casting.teach(lesson);
        casting.teach(math);
        casting.teach(lessonRef);

        System.out.println("\n--- Library ---");
        com.library.Book book1 = new com.library.Book();
        AudioBook audioBook = new AudioBook();
        com.library.Book bookRef = new AudioBook();

        casting.read(book1);
        casting.read(audioBook);
        casting.read(bookRef);

        System.out.println("\n--- Chair (OfficeChair) ---");
        com.officechair.Chair chair1 = new com.officechair.Chair();
        OfficeChair officeChair1 = new OfficeChair();
        com.officechair.Chair refOffice = new OfficeChair();

        casting.sit(chair1);
        casting.sit(officeChair1);
        casting.sit(refOffice);

        System.out.println("\n--- Printer (LaserPrinter) ---");
        Printer basePrinter = new Printer();
        LaserPrinter laserPrinter = new LaserPrinter();
        Printer refLaser = new LaserPrinter();

        casting.output(basePrinter);
        casting.output(laserPrinter);
        casting.output(refLaser);

        System.out.println("\n--- Light ---");
        Light light = new Light();
        SmartLight smartLight = new SmartLight();
        Light lightRef = new SmartLight();

        casting.illuminate(light);
        casting.illuminate(smartLight);
        casting.illuminate(lightRef);

        System.out.println("\n--- Locker ---");
        Locker locker = new Locker();
        DigitalLocker digitalLocker = new DigitalLocker();
        Locker lockerRef = new DigitalLocker();

        casting.secure(locker);
        casting.secure(digitalLocker);
        casting.secure(lockerRef);

        System.out.println("\n--- MediaFile ---");
        MediaFile media = new MediaFile();
        AudioFile audio = new AudioFile();
        MediaFile mediaRef = new AudioFile();

        casting.playMedia(media);
        casting.playMedia(audio);
        casting.playMedia(mediaRef);

        System.out.println("\n--- Message ---");
        Message message = new Message();
        TextMessage text = new TextMessage();
        Message messageRef = new TextMessage();

        casting.send(message);
        casting.send(text);
        casting.send(messageRef);

        System.out.println("\n--- Mirror ---");
        com.mirror.Mirror mirror3 = new com.mirror.Mirror();
        DigitalMirror digitalMirror = new DigitalMirror();
        com.mirror.Mirror mirrorRef = new DigitalMirror();

        casting.reflect(mirror3);
        casting.reflect(digitalMirror);
        casting.reflect(mirrorRef);

        System.out.println("\n--- Music Instrument ---");
        Instrument instrument2 = new Instrument();
        Guitar guitar2 = new Guitar();
        Instrument instrumentRef2 = new Guitar();

        casting.playInstrument(instrument2);
        casting.playInstrument(guitar2);
        casting.playInstrument(instrumentRef2);

        System.out.println("\n--- Navigator ---");
        Map map = new Map();
        GPSMap gpsMap = new GPSMap();
        Map mapRef = new GPSMap();

        casting.navigate(map);
        casting.navigate(gpsMap);
        casting.navigate(mapRef);

        System.out.println("\n--- Notebook ---");
        Notebook notebook = new Notebook();
        SpiralNotebook spiralNotebook = new SpiralNotebook();
        Notebook notebookRef = new SpiralNotebook();

        casting.writeNotes(notebook);
        casting.writeNotes(spiralNotebook);
        casting.writeNotes(notebookRef);

        System.out.println("\n--- Notes (DigitalNotebook) ---");
        com.notes.Notebook digitalNote = new DigitalNotebook();
        DigitalNotebook actualDigitalNote = new DigitalNotebook();

        casting.saveNotes(digitalNote);
        casting.saveNotes(actualDigitalNote);

        System.out.println("\n--- Camera ---");
        com.camera.Camera camera3 = new com.camera.Camera();
        DSLR dslr = new DSLR();
        com.camera.Camera camRef = new DSLR();

        casting.shoot(camera3);
        casting.shoot(dslr);
        casting.shoot(camRef);

        System.out.println("\n--- Notification ---");
        Notification notification = new Notification();
        EmailNotification email = new EmailNotification();
        Notification notifRef = new EmailNotification();

        casting.notifyUser(notification);
        casting.notifyUser(email);
        casting.notifyUser(notifRef);

        System.out.println("\n--- Office Printer ---");
        Printer printer = new Printer();
        LaserPrinter laser = new LaserPrinter();
        Printer printerRef = new LaserPrinter();

        casting.printDocument(printer);
        casting.printDocument(laser);
        casting.printDocument(printerRef);

        System.out.println("\n--- Office Chair ---");
        com.officechair.Chair chair3 = new com.officechair.Chair();
        OfficeChair officeChair2 = new OfficeChair();
        com.officechair.Chair chairRef = new OfficeChair();

        casting.sit(chair3);
        casting.sit(officeChair2);
        casting.sit(chairRef);

        System.out.println("\n--- Organizer ---");
        Calendar calendar = new Calendar();
        DigitalCalendar digital = new DigitalCalendar();
        Calendar calendarRef = new DigitalCalendar();

        casting.organize(calendar);
        casting.organize(digital);
        casting.organize(calendarRef);

        System.out.println("\n--- Payment Method ---");
        PaymentMethod method = new PaymentMethod();
        CreditCard creditCard = new CreditCard();
        PaymentMethod methodRef = new CreditCard();

        casting.makePayment(method);
        casting.makePayment(creditCard);
        casting.makePayment(methodRef);

        System.out.println("\n--- Planner ---");
        Calendar calendar1 = new Calendar();
        DigitalCalendar digitalCalendar = new DigitalCalendar();
        Calendar calendarRef1 = new DigitalCalendar();

        casting.plan(calendar1);
        casting.plan(digitalCalendar);
        casting.plan(calendarRef1);

        System.out.println("\n--- Plant ---");
        com.plant.Plant plant = new com.plant.Plant();
        com.plant.Flower flower = new com.plant.Flower();
        com.plant.Plant plantRef = new com.plant.Flower();

        casting.grow(plant);
        casting.grow(flower);
        casting.grow(plantRef);

        System.out.println("\n--- Pot ---");
        com.pot.Utensil utensil = new com.pot.Utensil();
        com.pot.Pot pot = new com.pot.Pot();
        com.pot.Utensil utensilRef = new com.pot.Pot();

        casting.cook(utensil);
        casting.cook(pot);
        casting.cook(utensilRef);

        System.out.println("\n--- Printing ---");
        com.printing.Printer printer1 = new com.printing.Printer();
        com.printing.LaserPrinter laserPrinter1 = new com.printing.LaserPrinter();
        com.printing.Printer printerRef1 = new com.printing.LaserPrinter();

        casting.printDocs(printer1);
        casting.printDocs(laserPrinter1);
        casting.printDocs(printerRef1);

        System.out.println("\n--- Product ---");
        com.product.Product product = new com.product.Product();
        com.product.Shampoo shampoo = new com.product.Shampoo();
        com.product.Product productRef = new com.product.Shampoo();

        casting.checkProduct(product);
        casting.checkProduct(shampoo);
        casting.checkProduct(productRef);

        System.out.println("\n--- Quiz ---");
        com.quiz.Quiz quiz = new com.quiz.Quiz();
        com.quiz.OnlineQuiz onlineQuiz = new com.quiz.OnlineQuiz();
        com.quiz.Quiz quizRef = new com.quiz.OnlineQuiz();

        casting.conductQuiz(quiz);
        casting.conductQuiz(onlineQuiz);
        casting.conductQuiz(quizRef);

        System.out.println("\n--- Recipe ---");
        com.recipe.Recipe recipe2 = new com.recipe.Recipe();
        com.recipe.DessertRecipe dessert = new com.recipe.DessertRecipe();
        com.recipe.Recipe recipeRef = new com.recipe.DessertRecipe();

        casting.cookRecipe(recipe2);
        casting.cookRecipe(dessert);
        casting.cookRecipe(recipeRef);

        System.out.println("\n--- Remainder ---");
        com.remainder.Reminder reminder = new com.remainder.Reminder();
        com.remainder.MeetingReminder meeting = new com.remainder.MeetingReminder();
        com.remainder.Reminder reminderRef = new com.remainder.MeetingReminder();

        casting.remind(reminder);
        casting.remind(meeting);
        casting.remind(reminderRef);

        System.out.println("\n--- Report ---");
        com.report.Report report = new com.report.Report();
        com.report.SalesReport sales = new com.report.SalesReport();
        com.report.Report reportRef = new com.report.SalesReport();

        casting.viewReport(report);
        casting.viewReport(sales);
        casting.viewReport(reportRef);

        System.out.println("\n--- Retail (ShelfLabel) ---");
        com.retail.ShelfLabel label = new com.retail.ShelfLabel();
        com.retail.DigitalShelfLabel digital1 = new com.retail.DigitalShelfLabel();
        com.retail.ShelfLabel labelRef = new com.retail.DigitalShelfLabel();

        casting.labelShelf(label);
        casting.labelShelf(digital1);
        casting.labelShelf(labelRef);

        System.out.println("\n--- School (Board) ---");
        com.school.Board board = new com.school.Board();
        com.school.SmartBoard smart1 = new com.school.SmartBoard();
        com.school.Board boardRef = new com.school.SmartBoard();

        casting.useBoard(board);
        casting.useBoard(smart1);
        casting.useBoard(boardRef);

        System.out.println("\n--- Security (Camera) ---");
        com.security.Camera cam = new com.security.Camera();
        com.security.SecurityCamera secCam = new com.security.SecurityCamera();
        com.security.Camera camRef1 = new com.security.SecurityCamera();

        casting.monitorSecurity(cam);
        casting.monitorSecurity(secCam);
        casting.monitorSecurity(camRef1);

        System.out.println("\n--- Sensor ---");
        com.sensor.Sensor sensor = new com.sensor.Sensor();
        com.sensor.TemperatureSensor tempSensor = new com.sensor.TemperatureSensor();
        com.sensor.Sensor sensorRef = new com.sensor.TemperatureSensor();

        casting.checkSensor(sensor);
        casting.checkSensor(tempSensor);
        casting.checkSensor(sensorRef);

        System.out.println("\n--- Service ---");
        com.service.Service service = new com.service.Service();
        com.service.CleaningService cleaning = new com.service.CleaningService();
        com.service.Service serviceRef = new com.service.CleaningService();

        casting.checkService(service);
        casting.checkService(cleaning);
        casting.checkService(serviceRef);

        System.out.println("\n--- Settings ---");
        com.settings.AccountSettings settings = new com.settings.AccountSettings();
        com.settings.PrivacySettings privacy = new com.settings.PrivacySettings();
        com.settings.AccountSettings settingsRef = new com.settings.PrivacySettings();

        casting.updateSettings(settings);
        casting.updateSettings(privacy);
        casting.updateSettings(settingsRef);

        System.out.println("\n--- Shape ---");
        com.shape.Shape shape = new com.shape.Shape();
        com.shape.Circle circle = new com.shape.Circle();
        com.shape.Shape shapeRef = new com.shape.Circle();

        casting.drawShape(shape);
        casting.drawShape(circle);
        casting.drawShape(shapeRef);

        System.out.println("\n--- Sound (Speaker) ---");
        com.sound.Speaker speaker = new com.sound.Speaker();
        com.sound.BluetoothSpeaker bluetooth = new com.sound.BluetoothSpeaker();
        com.sound.Speaker speakerRef = new com.sound.BluetoothSpeaker();

        casting.playSpeaker(speaker);
        casting.playSpeaker(bluetooth);
        casting.playSpeaker(speakerRef);

        System.out.println("\n--- Stationery ---");
        com.stationery.Notebook notebook1 = new com.stationery.Notebook();
        com.stationery.SketchBook sketch = new com.stationery.SketchBook();
        com.stationery.Notebook noteRef = new com.stationery.SketchBook();

        casting.writeNotebook(notebook1);
        casting.writeNotebook(sketch);
        casting.writeNotebook(noteRef);

        System.out.println("\n--- Storage (Shelf) ---");
        com.storage.Shelf shelf = new com.storage.Shelf();
        com.storage.Bookshelf bookshelf = new com.storage.Bookshelf();
        com.storage.Shelf shelfRef = new com.storage.Bookshelf();

        casting.checkShelf(shelf);
        casting.checkShelf(bookshelf);
        casting.checkShelf(shelfRef);

        System.out.println("\n--- Stream ---");
        com.stream.Stream stream = new com.stream.Stream();
        com.stream.AudioStream audioStream = new com.stream.AudioStream();
        com.stream.Stream streamRef = new com.stream.AudioStream();

        casting.streamAudio(stream);
        casting.streamAudio(audioStream);
        casting.streamAudio(streamRef);

        System.out.println("\n--- Subscription ---");
        com.subscription.Subscription sub = new com.subscription.Subscription();
        com.subscription.PremiumSubscription premium = new com.subscription.PremiumSubscription();
        com.subscription.Subscription subRef = new com.subscription.PremiumSubscription();

        casting.handleSubscription(sub);
        casting.handleSubscription(premium);
        casting.handleSubscription(subRef);

        System.out.println("\n--- ThermoCup ---");
        com.thermocup.Cup cup1 = new com.thermocup.Cup();
        com.thermocup.ThermoCup thermo = new com.thermocup.ThermoCup();
        com.thermocup.Cup cupRef1 = new com.thermocup.ThermoCup();

        casting.useCup(cup1);
        casting.useCup(thermo);
        casting.useCup(cupRef1);

        System.out.println("\n--- Ticket (Movie) ---");
        com.ticket.Ticket movieTicket = new com.ticket.Ticket();
        com.ticket.MovieTicket movie = new com.ticket.MovieTicket();
        com.ticket.Ticket refMovie = new com.ticket.MovieTicket();

        casting.bookMovieTicket(movieTicket);
        casting.bookMovieTicket(movie);
        casting.bookMovieTicket(refMovie);

        System.out.println("\n--- TicketBooking (Online) ---");
        com.ticketbooking.Ticket onlineTicket = new com.ticketbooking.Ticket();
        com.ticketbooking.OnlineTicket online = new com.ticketbooking.OnlineTicket();
        com.ticketbooking.Ticket refOnline = new com.ticketbooking.OnlineTicket();

        casting.bookOnlineTicket(onlineTicket);
        casting.bookOnlineTicket(online);
        casting.bookOnlineTicket(refOnline);

        System.out.println("\n--- Ticketing ---");
        TicketMachine machine = new TicketMachine();
        TrainTicketMachine trainMachine = new TrainTicketMachine();
        TicketMachine machineRef = new TrainTicketMachine();
        casting.operateMachine(machine);
        casting.operateMachine(trainMachine);
        casting.operateMachine(machineRef);

        System.out.println("\n--- Time ---");
        Clock clock = new Clock();
        SmartClock smartClock = new SmartClock();
        Clock clockRef = new SmartClock();
        casting.showTime(clock);
        casting.showTime(smartClock);
        casting.showTime(clockRef);

        System.out.println("\n--- Timekeeping ---");
        com.timekeeping.Clock tkClock = new com.timekeeping.Clock();
        AlarmClock alarm = new AlarmClock();
        com.timekeeping.Clock tkClockRef = new AlarmClock();
        casting.alarmTest(tkClock);
        casting.alarmTest(alarm);
        casting.alarmTest(tkClockRef);

        System.out.println("\n--- Tool ---");
        Tool tool = new Tool();
        Hammer hammer = new Hammer();
        Tool toolRef = new Hammer();
        casting.useTool(tool);
        casting.useTool(hammer);
        casting.useTool(toolRef);

        System.out.println("\n--- Toolbox ---");
        ToolBox box = new ToolBox();
        Wrench wrench = new Wrench();
        ToolBox boxRef = new Wrench();
        casting.openToolbox(box);
        casting.openToolbox(wrench);
        casting.openToolbox(boxRef);

        System.out.println("\n--- Transaction ---");
        Transaction tx = new Transaction();
        OnlineTransaction onlineTx = new OnlineTransaction();
        Transaction txRef = new OnlineTransaction();
        casting.handleTransaction(tx);
        casting.handleTransaction(onlineTx);
        casting.handleTransaction(txRef);

        System.out.println("\n--- Transport ---");
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Vehicle vehicleRef = new Car();
        casting.driveVehicle(vehicle);
        casting.driveVehicle(car);
        casting.driveVehicle(vehicleRef);

        System.out.println("\n--- Travel ---");
        Bag bag = new Bag();
        LaptopBag laptopBag = new LaptopBag();
        Bag bagRef = new LaptopBag();
        casting.checkBag(bag);
        casting.checkBag(laptopBag);
        casting.checkBag(bagRef);

        System.out.println("\n--- TV ---");
        TV tv = new TV();
        TVRemote tvRemote = new TVRemote();
        TV tvRef = new TVRemote();
        casting.operateTV(tv);
        casting.operateTV(tvRemote);
        casting.operateTV(tvRef);

        System.out.println("\n--- User ---");
        User user = new User();
        AdminUser admin = new AdminUser();
        User userRef = new AdminUser();
        casting.manageUser(user);
        casting.manageUser(admin);
        casting.manageUser(userRef);

        System.out.println("\n--- Wearables ---");
        Watch watch = new Watch();
        SmartWatch smartWatch = new SmartWatch();
        Watch watchRef = new SmartWatch();
        casting.wearWatch(watch);
        casting.wearWatch(smartWatch);
        casting.wearWatch(watchRef);

        System.out.println("\n--- Website ---");
        Website website = new Website();
        Blog blog = new Blog();
        Website websiteRef = new Blog();
        casting.browseSite(website);
        casting.browseSite(blog);
        casting.browseSite(websiteRef);

        System.out.println("\n--- Workshop ---");
        com.workshop.Tool tool2 = new com.workshop.Tool();
        Drill drill = new Drill();
        com.workshop.Tool tool1 = new Drill();
        casting.useWorkshopTool(tool2);
        casting.useWorkshopTool(drill);
        casting.useWorkshopTool(tool1);

        System.out.println("\n--- Writing ---");
        Pen pen = new Pen();
        FountainPen fountain = new FountainPen();
        Pen penRef = new FountainPen();
        casting.writeSomething(pen);
        casting.writeSomething(fountain);
        casting.writeSomething(penRef);


    }
    }
