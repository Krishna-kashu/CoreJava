package xworkz.casting;

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
import com.bed.Bed;
import com.bed.AdjustableBed;
import com.book.Book;
import com.book.EBook;
import com.bottle.Bottle;
import com.bottle.WaterBottle;
import com.brush.Brush;
import com.brush.ElectricBrush;
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
import com.gamelevel.BonusLevel;
import com.gamelevel.GameLevel;
import com.home.Refrigerator;
import com.hydration.SmartBottle;
import com.hygine.ToothBrush;
import com.inputdevice.Keyboard;
import com.inputdevice.MechanicalKeyboard;
import com.microwave.Microwave;
import com.microwave.SmartMicrowave;
import com.security.Camera;
import com.security.SecurityCamera;
import com.chair.Chair;
import com.chair.ReclinerChair;
import com.furnitureplus.MassageChair;
import com.officechair.OfficeChair;
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
import com.plant.Plant;
import com.plant.Flower;
import com.pot.Pot;
import com.pot.Utensil;
import com.product.Product;
import com.product.Shampoo;
import com.quiz.Quiz;
import com.quiz.OnlineQuiz;
import com.recipe.DessertRecipe;
import com.remainder.Reminder;
import com.remainder.MeetingReminder;
import com.report.Report;
import com.report.SalesReport;
import com.retail.ShelfLabel;
import com.retail.DigitalShelfLabel;
import com.school.Board;
import com.school.SmartBoard;
import com.sensor.Sensor;
import com.sensor.TemperatureSensor;
import com.service.Service;
import com.service.CleaningService;
import com.settings.AccountSettings;
import com.settings.PrivacySettings;
import com.shape.Shape;
import com.shape.Circle;
import com.sound.Speaker;
import com.sound.BluetoothSpeaker;
import com.stationery.SketchBook;
import com.storage.Bookshelf;
import com.storage.Shelf;
import com.stream.Stream;
import com.stream.AudioStream;
import com.subscription.Subscription;
import com.subscription.PremiumSubscription;
import com.thermocup.ThermoCup;
import com.ticket.Ticket;
import com.ticket.MovieTicket;
import com.ticketbooking.OnlineTicket;
import com.ticketing.TicketMachine;
import com.ticketing.TrainTicketMachine;
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


public class Casting {
    public void close(Door door) {
        if (door != null) {
            door.open();
            if (door instanceof SmartDoor smartDoor) {
                smartDoor.lockRemotely();
                smartDoor.open();
            } else {
                System.out.println("door is not null");
            }
        } else {
            System.out.println("door is null");
        }
    }

    public void checkAccount(Account account) {
        if (account != null) {
            account.deposit();
            if (account instanceof SavingsAccount savings) {
                savings.deposit();
            } else {
                System.out.println("Not a SavingsAccount");
            }
        } else {
            System.out.println("Account is null");
        }
    }

    public void runAppliance(Appliance appliance) {
        if (appliance != null) {
            appliance.turnOn();
            if (appliance instanceof WashingMachine washingMachine) {
                washingMachine.turnOn();
            } else {
                System.out.println("Not a WashingMachine");
            }
        } else {
            System.out.println("Appliance is null");
        }
    }

    public void paint(Paint paint) {
        if (paint != null) {
            paint.apply();
            if (paint instanceof SprayPaint spray) {
                spray.apply();
            } else {
                System.out.println("Not a SprayPaint");
            }
        } else {
            System.out.println("Paint is null");
        }
    }

    public void checkTransaction(BankTransaction transaction) {
        if (transaction != null) {
            transaction.execute();
            if (transaction instanceof WithdrawalTransaction withdrawal) {
                //WithdrawalTransaction withdrawal = (WithdrawalTransaction) transaction;
                withdrawal.execute();
            } else {
                System.out.println("Not a WithdrawalTransaction");
            }
        } else {
            System.out.println("Transaction is null");
        }
    }

    public void checkMirror(Mirror mirror) {
        if (mirror != null) {
            mirror.reflect();
            if (mirror instanceof SmartMirror smart) {
                //SmartMirror smart = (SmartMirror) mirror;
                smart.showNews();
            } else {
                System.out.println("Not a SmartMirror");
            }
        } else {
            System.out.println("Mirror is null");
        }
    }

    public void checkBed(Bed bed) {
        if (bed != null) {
            bed.sleep();
            if (bed instanceof AdjustableBed adjustable) {
                //AdjustableBed adjustable = (AdjustableBed) bed;
                adjustable.raiseHead();
            } else {
                System.out.println("Not an AdjustableBed");
            }
        } else {
            System.out.println("Bed is null");
        }
    }

    public void checkBook(Book book) {
        if (book != null) {
            book.read();
            if (book instanceof EBook ebook) {
                //EBook novel = (EBook) book;
                ebook.download();
            } else {
                System.out.println("Not a Novel");
            }
        } else {
            System.out.println("Book is null");
        }
    }

    public void checkBottle(Bottle bottle) {
        if (bottle != null) {
            bottle.open();
            if (bottle instanceof WaterBottle smart) {
                //WaterBottle smart = (WaterBottle) bottle;
                smart.refill();
                smart.open();
            } else {
                System.out.println("Not a SmartBottle");
            }
        } else {
            System.out.println("Bottle is null");
        }
    }

    public void monitor(Camera camera) {
        if (camera != null) {
            camera.capture();
            if (camera instanceof SecurityCamera securityCamera) {
                securityCamera.detectMotion();
                securityCamera.capture();
            } else {
                System.out.println("Not a SecurityCamera");
            }
        } else {
            System.out.println("Camera is null");
        }
    }

    public void relax(Chair chair) {
        if (chair != null) {
            chair.sit();
            if (chair instanceof ReclinerChair recliner) {
                recliner.sit();
                recliner.recline();
            } else {
                System.out.println("Not a ReclinerChair");
            }
        } else {
            System.out.println("Chair is null");
        }
    }

    public void massage(com.furnitureplus.Chair chair) {
        if (chair != null) {
            chair.sit();
            if (chair instanceof MassageChair massage) {
                massage.sit();
                massage.massage();
            } else {
                System.out.println("Not a MassageChair");
            }
        } else {
            System.out.println("Furniture Chair is null");
        }
    }

    public void roll(com.officechair.Chair chair) {
        if (chair != null) {
            chair.sit();
            if (chair instanceof OfficeChair office) {
                office.sit();
                office.adjustHeight();
            } else {
                System.out.println("Not an OfficeChair");
            }
        } else {
            System.out.println("Office Chair is null");
        }
    }

    public void brush(Brush brush) {
        if (brush != null) {
            brush.clean();
            if (brush instanceof ElectricBrush electricBrush) {
                electricBrush.vibrate();
                electricBrush.clean();
            } else {
                System.out.println("Not a ToothBrush");
            }
        } else {
            System.out.println("Brush is null");
        }
    }

    public void brushTeeth(com.hygine.Brush brush) {
        if (brush != null) {
            brush.clean();
            if (brush instanceof ToothBrush toothBrush) {
                toothBrush.clean();
                toothBrush.vibrate();
            } else {
                System.out.println("Not a ToothBrush");
            }
        } else {
            System.out.println("Brush is null");
        }
    }

    public void Stop(Fan fan) {
        if (fan != null) {
            fan.rotate();
            if (fan instanceof CeilingFan ceilingFan) {
                ceilingFan.rotate();
                ceilingFan.changeSpeed();
            } else {
                System.out.println("Not a CeilingFan");
            }
        } else {
            System.out.println("Fan is null");
        }
    }

    public void benchmark(NotebookComputer laptop) {
        if (laptop != null) {
            laptop.boot();
            if (laptop instanceof GamingLaptop gaming) {
                gaming.boot();
            } else {
                System.out.println("Not a GamingLaptop");
            }
        } else {
            System.out.println("Laptop is null");
        }
    }

    public void cook(Microwave microwave) {
        if (microwave != null) {
            microwave.heat();
            if (microwave instanceof SmartMicrowave smart) {
                smart.heat();
                smart.connectWiFi();
            } else {
                System.out.println("Not a SmartMicrowave");
            }
        } else {
            System.out.println("Microwave is null");
        }
    }

    public void stream(Content content) {
        if (content != null) {
            content.display();
            if (content instanceof VideoContent video) {
                video.playInFullScreen();
                video.display();
            } else {
                System.out.println("Not a VideoContent");
            }
        } else {
            System.out.println("Content is null");
        }
    }

    public void progress(GameLevel level) {
        if (level != null) {
            level.start();
            if (level instanceof BonusLevel bonus) {
                bonus.start();
            } else {
                System.out.println("Not a BonusLevel");
            }
        } else {
            System.out.println("GameLevel is null");
        }
    }
    public void view(Dashboard dashboard) {
        if (dashboard != null) {
            dashboard.render();
            if (dashboard instanceof UserDashboard user) {
                user.render();
            } else {
                System.out.println("Not a UserDashboard");
            }
        } else {
            System.out.println("Dashboard is null");
        }
    }
    public void print(Document document) {
        if (document != null) {
            document.print();
            if (document instanceof PDFDocument pdf) {
                pdf.encrypt();
            } else {
                System.out.println("Not a PDFDocument");
            }
        } else {
            System.out.println("Document is null");
        }
    }
    public void slide(com.door.Door door) {
        if (door != null) {
            door.open();
            if (door instanceof SlidingDoor sliding) {
                sliding.open();
                sliding.lock();
            } else {
                System.out.println("Not a SlidingDoor");
            }
        } else {
            System.out.println("Door is null");
        }
    }
    public void edit(Editor editor) {
        if (editor != null) {
            editor.edit();
            if (editor instanceof PhotoEditor photo) {
                photo.edit();
            } else {
                System.out.println("Not a PhotoEditor");
            }
        } else {
            System.out.println("Editor is null");
        }
    }
    public void operate(Remote remote) {
        if (remote != null) {
            remote.pressButton();
            if (remote instanceof SmartRemote smart) {
                smart.pressButton();
            } else {
                System.out.println("Not a SmartRemote");
            }
        } else {
            System.out.println("Remote is null");
        }
    }
    public void cook(Recipe recipe) {
        if (recipe != null) {
            recipe.cook();
            if (recipe instanceof VeganRecipe vegan) {
                vegan.listIngredients();
            } else {
                System.out.println("Not a VeganRecipe");
            }
        } else {
            System.out.println("Recipe is null");
        }
    }
    public void sign(Contract contract) {
        if (contract != null) {
            contract.sign();
            if (contract instanceof FreelanceContract freelance) {
                freelance.sign();
            } else {
                System.out.println("Not a FreelanceContract");
            }
        } else {
            System.out.println("Contract is null");
        }
    }
    public void enroll(Course course) {
        if (course != null) {
            course.enroll();
            if (course instanceof JavaCourse java) {
                java.enroll();
            } else {
                System.out.println("Not a JavaCourse");
            }
        } else {
            System.out.println("Course is null");
        }
    }
    public void fillBottle(com.container.Bottle bottle) {
        if (bottle != null) {
            bottle.fill();
            if (bottle instanceof ThermoBottle smart) {
                smart.fill();
                smart.fill();
            } else {
                System.out.println("Not a SmartBottle");
            }
        } else {
            System.out.println("Bottle is null");
        }
    }
    public void operate(Device device) {
        if (device != null) {
            device.start();
            if (device instanceof Smartphone smart) {
                smart.makeCall();
                smart.start();
            } else {
                System.out.println("Not a Smartphone");
            }
        } else {
            System.out.println("Device is null");
        }
    }
    public void control(com.fan.Device device) {
        if (device != null) {
            device.start();
            if (device instanceof com.fan.Fan fan) {
                fan.start();
                fan.rotate();
            } else {
                System.out.println("Not a Fan");
            }
        } else {
            System.out.println("FanDevice is null");
        }
    }
    public void read(File file) {
        if (file != null) {
            file.open();
            if (file instanceof TextFile text) {
                text.open();
                text.countWords();
            } else {
                System.out.println("Not a TextFile");
            }
        } else {
            System.out.println("File is null");
        }
    }
    public void wear(Shoe shoe) {
        if (shoe != null) {
            shoe.wear();
            if (shoe instanceof RunningShoe running) {
                running.wear();
            } else {
                System.out.println("Not a RunningShoe");
            }
        } else {
            System.out.println("Shoe is null");
        }
    }
    public void fill(Form form) {
        if (form != null) {
            form.submit();
            if (form instanceof RegistrationForm reg) {
                reg.submit();
            } else {
                System.out.println("Not a RegistrationForm");
            }
        } else {
            System.out.println("Form is null");
        }
    }
    public void play(Game game) {
        if (game != null) {
            game.startGame();
            if (game instanceof BoardGame board) {
                board.startGame();
            } else {
                System.out.println("Not a BoardGame");
            }
        } else {
            System.out.println("Game is null");
        }
    }

    public void use(com.home.Appliance appliance) {
        if (appliance != null) {
            appliance.operate();
            if (appliance instanceof Refrigerator fridge) {
                fridge.defrost();
                fridge.operate();
            } else {
                System.out.println("Not a Refrigerator");
            }
        } else {
            System.out.println("Appliance is null");
        }
    }

    public void check(com.hydration.Bottle bottle) {
        if (bottle != null) {
            bottle.pour();
            if (bottle instanceof SmartBottle smart) {
                smart.trackIntake();
                smart.pour();
            } else {
                System.out.println("Not a SmartBottle");
            }
        } else {
            System.out.println("Bottle is null");
        }
    }
    public void type(Keyboard keyboard) {
        if (keyboard != null) {
            keyboard.type();
            if (keyboard instanceof MechanicalKeyboard mech) {
                mech.type();
            } else {
                System.out.println("Not a MechanicalKeyboard");
            }
        } else {
            System.out.println("Keyboard is null");
        }
    }
    public void play(Instrument instrument) {
        if (instrument != null) {
            instrument.play();
            if (instrument instanceof Guitar guitar) {
                guitar.play();
            } else {
                System.out.println("Not a Guitar");
            }
        } else {
            System.out.println("Instrument is null");
        }
    }

    public void place(Furniture furniture) {
        if (furniture != null) {
            furniture.place();
            if (furniture instanceof Table table) {
                table.fold();
                table.place();
            } else {
                System.out.println("Not a Table");
            }
        } else {
            System.out.println("Furniture is null");
        }
    }

    public void store(Container container) {
        if (container != null) {
            container.fill();
            if (container instanceof Jar jar) {
                jar.seal();
            } else {
                System.out.println("Not a Jar");
            }
        } else {
            System.out.println("Container is null");
        }
    }

    public void drink(Mug mug) {
        if (mug != null) {
            mug.fill();
            if (mug instanceof DesignerMug designer) {
                designer.fill();
            } else {
                System.out.println("Not a DesignerMug");
            }
        } else {
            System.out.println("Mug is null");
        }
    }

    public void pour(Cup cup) {
        if (cup != null) {
            cup.pour();
            if (cup instanceof TravelCup travel) {
                travel.pour();
            } else {
                System.out.println("Not a TravelCup");
            }
        } else {
            System.out.println("Cup is null");
        }
    }
    public void switchOn(Lamp lamp) {
        if (lamp != null) {
            lamp.turnOn();
            if (lamp instanceof DeskLamp deskLamp) {
                deskLamp.turnOn();
            } else {
                System.out.println("Not a DeskLamp");
            }
        } else {
            System.out.println("Lamp is null");
        }
    }

    public void teach(Lesson lesson) {
        if (lesson != null) {
            lesson.teach();
            if (lesson instanceof MathLesson math) {
                math.teach();
            } else {
                System.out.println("Not a MathLesson");
            }
        } else {
            System.out.println("Lesson is null");
        }
    }

    public void read(com.library.Book book) {
        if (book != null) {
            book.read();
            if (book instanceof AudioBook audio) {
                audio.playAudio();
                audio.read();
            } else {
                System.out.println("Not an AudioBook");
            }
        } else {
            System.out.println("Book is null");
        }
    }

    public void illuminate(Light light) {
        if (light != null) {
            light.switchOn();
            if (light instanceof SmartLight smart) {
                smart.switchOn();
            } else {
                System.out.println("Not a SmartLight");
            }
        } else {
            System.out.println("Light is null");
        }
    }

    public void secure(Locker locker) {
        if (locker != null) {
            locker.lock();
            if (locker instanceof DigitalLocker digital) {
                digital.encrypt();
            } else {
                System.out.println("Not a DigitalLocker");
            }
        } else {
            System.out.println("Locker is null");
        }
    }

    public void playMedia(MediaFile mediaFile) {
        if (mediaFile != null) {
            mediaFile.play();
            if (mediaFile instanceof AudioFile audioFile) {
                //audioFile.adjustVolume();  this method is package default
                audioFile.play();
            } else {
                System.out.println("Not an AudioFile");
            }
        } else {
            System.out.println("MediaFile is null");
        }
    }

    public void send(Message message) {
        if (message != null) {
            message.sendMessage();
            if (message instanceof TextMessage text) {
                text.sendMessage();
            } else {
                System.out.println("Not a TextMessage");
            }
        } else {
            System.out.println("Message is null");
        }
    }
    public void reflect(com.mirror.Mirror mirror) {
        if (mirror != null) {
            mirror.reflect();
            if (mirror instanceof DigitalMirror digital) {
                digital.reflect();
            } else {
                System.out.println("Not a DigitalMirror");
            }
        } else {
            System.out.println("Mirror is null");
        }
    }

    public void playInstrument(Instrument instrument) {
        if (instrument != null) {
            instrument.play();
            if (instrument instanceof Guitar guitar) {
                guitar.play();
            } else {
                System.out.println("Not a Guitar");
            }
        } else {
            System.out.println("Instrument is null");
        }
    }

    public void navigate(Map map) {
        if (map != null) {
            map.showRoute();
            if (map instanceof GPSMap gps) {
                gps.giveDirections();
                gps.showRoute();
            } else {
                System.out.println("Not a GPSMap");
            }
        } else {
            System.out.println("Map is null");
        }
    }

    public void writeNotes(Notebook notebook) {
        if (notebook != null) {
            notebook.write();
            if (notebook instanceof SpiralNotebook spiral) {
                spiral.write();
            } else {
                System.out.println("Not a SpiralNotebook");
            }
        } else {
            System.out.println("Notebook is null");
        }
    }

    public void saveNotes(com.notes.Notebook notebook) {
        if (notebook != null) {
            notebook.writeNotes();
            if (notebook instanceof DigitalNotebook digital) {
                digital.writeNotes();
            } else {
                System.out.println("Not a DigitalNotebook");
            }
        } else {
            System.out.println("Notebook is null");
        }
    }

    public void shoot(com.camera.Camera camera) {
        if (camera != null) {
            camera.takePhoto();
            if (camera instanceof DSLR dslr) {
                dslr.takePhoto();
            } else {
                System.out.println("Not a DSLR");
            }
        } else {
            System.out.println("Camera is null");
        }
    }

    public void notifyUser(Notification notification) {
        if (notification != null) {
            notification.send();
            if (notification instanceof EmailNotification email) {
                email.send();
            } else {
                System.out.println("Not an EmailNotification");
            }
        } else {
            System.out.println("Notification is null");
        }
    }

    public void printDocument(Printer printer) {
        if (printer != null) {
            printer.print();
            if (printer instanceof LaserPrinter laser) {
                laser.print();
                laser.tonerLevel();
            } else {
                System.out.println("Not a LaserPrinter");
            }
        } else {
            System.out.println("Printer is null");
        }
    }

    public void sit(com.officechair.Chair chair) {
        if (chair != null) {
            chair.sit();
            if (chair instanceof OfficeChair office) {
                office.adjustHeight();
            } else {
                System.out.println("Not an OfficeChair");
            }
        } else {
            System.out.println("Chair is null");
        }
    }

    public void organize(Calendar calendar) {
        if (calendar != null) {
            calendar.displayDate();
            if (calendar instanceof DigitalCalendar digital) {
                digital.displayDate();
                digital.addEvent();
            } else {
                System.out.println("Not a DigitalCalendar");
            }
        } else {
            System.out.println("Calendar is null");
        }
    }

    public void makePayment(PaymentMethod method) {
        if (method != null) {
            method.processPayment();
            if (method instanceof CreditCard credit) {
                credit.processPayment();
            } else {
                System.out.println("Not a CreditCard");
            }
        } else {
            System.out.println("PaymentMethod is null");
        }
    }
    public void plan(Calendar calendar) {
        if (calendar != null) {
            calendar.displayDate();
            if (calendar instanceof DigitalCalendar digital) {
                digital.addEvent();
                digital.displayDate();
            } else {
                System.out.println("Not a DigitalCalendar");
            }
        } else {
            System.out.println("Calendar is null");
        }
    }

    public void grow(Plant plant) {
        if (plant != null) {
            plant.grow();
            if (plant instanceof Flower flower) {
                flower.grow();
            } else {
                System.out.println("Not a Flower");
            }
        } else {
            System.out.println("Plant is null");
        }
    }

    public void cook(Utensil utensil) {
        if (utensil != null) {
            utensil.use();
            if (utensil instanceof Pot pot) {
                pot.use();
            } else {
                System.out.println("Not a Pot");
            }
        } else {
            System.out.println("Utensil is null");
        }
    }

    public void output(Printer printer) {
        if (printer != null) {
            printer.print();
            if (printer instanceof LaserPrinter laser) {
                laser.tonerLevel();
                laser.tonerLevel();
            } else {
                System.out.println("Not a LaserPrinter");
            }
        } else {
            System.out.println("Printer is null");
        }
    }
    public void checkProduct(Product product) {
        if (product != null) {
            product.apply();
            if (product instanceof Shampoo shampoo) {
                shampoo.apply();
            } else {
                System.out.println("Not a Shampoo");
            }
        } else {
            System.out.println("Product is null");
        }
    }

    public void conductQuiz(Quiz quiz) {
        if (quiz != null) {
            quiz.start();
            if (quiz instanceof OnlineQuiz online) {
                online.start();
            } else {
                System.out.println("Not an OnlineQuiz");
            }
        } else {
            System.out.println("Quiz is null");
        }
    }

    public void cookRecipe(com.recipe.Recipe recipe) {
        if (recipe != null) {
            recipe.prepare();
            if (recipe instanceof DessertRecipe dessert) {
                dessert.prepare();
            } else {
                System.out.println("Not a DessertRecipe");
            }
        } else {
            System.out.println("Recipe is null");
        }
    }

    public void remind(Reminder reminder) {
        if (reminder != null) {
            reminder.alert();
            if (reminder instanceof MeetingReminder meet) {
                meet.alert();
            } else {
                System.out.println("Not a MeetingReminder");
            }
        } else {
            System.out.println("Reminder is null");
        }
    }
    public void viewReport(Report report) {
        if (report != null) {
            report.generate();
            if (report instanceof SalesReport sales) {
                sales.generate();
            } else {
                System.out.println("Not a SalesReport");
            }
        } else {
            System.out.println("Report is null");
        }
    }

    public void labelShelf(ShelfLabel label) {
        if (label != null) {
            label.displayPrice();
            if (label instanceof DigitalShelfLabel digital) {
                digital.displayPrice();
            } else {
                System.out.println("Not a DigitalShelfLabel");
            }
        } else {
            System.out.println("ShelfLabel is null");
        }
    }

    public void useBoard(Board board) {
        if (board != null) {
            board.write();
            if (board instanceof SmartBoard smart) {
                smart.write();
                smart.connectToWifi();
            } else {
                System.out.println("Not a SmartBoard");
            }
        } else {
            System.out.println("Board is null");
        }
    }

    public void monitorSecurity(Camera camera) {
        if (camera != null) {
            camera.capture();
            if (camera instanceof SecurityCamera security) {
                security.detectMotion();
            } else {
                System.out.println("Not a SecurityCamera");
            }
        } else {
            System.out.println("Camera is null");
        }
    }

    public void checkSensor(Sensor sensor) {
        if (sensor != null) {
            sensor.readValue();
            if (sensor instanceof TemperatureSensor temperatureSensor) {
                temperatureSensor.readValue();
            } else {
                System.out.println("Not a TemperatureSensor");
            }
        } else {
            System.out.println("Sensor is null");
        }
    }
    public void checkService(Service service) {
        if (service != null) {
            service.provide();
            if (service instanceof CleaningService cleaning) {
                cleaning.provide();
            } else {
                System.out.println("Not a CleaningService");
            }
        } else {
            System.out.println("Service is null");
        }
    }

    public void updateSettings(AccountSettings settings) {
        if (settings != null) {
            settings.open();
            if (settings instanceof PrivacySettings privacy) {
                privacy.open();
            } else {
                System.out.println("Not a PrivacySettings");
            }
        } else {
            System.out.println("Settings is null");
        }
    }

    public void drawShape(Shape shape) {
        if (shape != null) {
            shape.draw();
            if (shape instanceof Circle circle) {
                circle.draw();
            } else {
                System.out.println("Not a Circle");
            }
        } else {
            System.out.println("Shape is null");
        }
    }

    public void playSpeaker(Speaker speaker) {
        if (speaker != null) {
            speaker.playSound();
            if (speaker instanceof BluetoothSpeaker bt) {
                bt.connectBluetooth();
            } else {
                System.out.println("Not a BluetoothSpeaker");
            }
        } else {
            System.out.println("Speaker is null");
        }
    }

    public void writeNotebook(com.stationery.Notebook notebook) {
        if (notebook != null) {
            notebook.open();
            if (notebook instanceof SketchBook sketch) {
                sketch.open();
            } else {
                System.out.println("Not a SketchBook");
            }
        } else {
            System.out.println("Notebook is null");
        }
    }
    public void checkShelf(Shelf shelf) {
        if (shelf != null) {
            shelf.placeItem();
            if (shelf instanceof Bookshelf book) {
                book.placeItem();
            } else {
                System.out.println("Not a Bookshelf");
            }
        } else {
            System.out.println("Shelf is null");
        }
    }

    public void streamAudio(Stream stream) {
        if (stream != null) {
            stream.start();
            if (stream instanceof AudioStream audio) {
                audio.start();
            } else {
                System.out.println("Not an AudioStream");
            }
        } else {
            System.out.println("Stream is null");
        }
    }

    public void handleSubscription(Subscription subscription) {
        if (subscription != null) {
            subscription.activate();
            if (subscription instanceof PremiumSubscription premium) {
                premium.activate();
            } else {
                System.out.println("Not a PremiumSubscription");
            }
        } else {
            System.out.println("Subscription is null");
        }
    }

    public void useCup(com.thermocup.Cup cup) {
        if (cup != null) {
            cup.fill();
            if (cup instanceof ThermoCup thermo) {
                thermo.maintainTemperature();
            } else {
                System.out.println("Not a ThermoCup");
            }
        } else {
            System.out.println("Cup is null");
        }
    }
    public void bookMovieTicket(Ticket ticket) {
        if (ticket != null) {
            ticket.book();
            if (ticket instanceof MovieTicket movie) {
                movie.book();
            } else {
                System.out.println("Not a MovieTicket");
            }
        } else {
            System.out.println("Ticket (movie) is null");
        }
    }

    public void bookOnlineTicket(com.ticketbooking.Ticket ticket) {
        if (ticket != null) {
            ticket.book();
            if (ticket instanceof OnlineTicket online) {
                online.book();
            } else {
                System.out.println("Not an OnlineTicket");
            }
        } else {
            System.out.println("Ticket (online) is null");
        }
    }
    public void operateMachine(TicketMachine machine) {
        if (machine != null) {
            machine.issueTicket();
            if (machine instanceof TrainTicketMachine trainTicketMachine) {
                trainTicketMachine.issueTicket();
            } else {
                System.out.println("Not a TrainTicketMachine");
            }
        } else {
            System.out.println("TicketMachine is null");
        }
    }

    public void showTime(com.time.Clock clock) {
        if (clock != null) {
            clock.showTime();
            if (clock instanceof SmartClock smartClock) {
                smartClock.showTime();
                smartClock.setAlarm();
            } else {
                System.out.println("Not a SmartClock");
            }
        } else {
            System.out.println("Clock is null");
        }
    }

    public void alarmTest(com.timekeeping.Clock clock) {
        if (clock != null) {
            clock.showTime();
            if (clock instanceof AlarmClock) {
                clock.showTime();
            } else {
                System.out.println("Not an AlarmClock");
            }
        } else {
            System.out.println("AlarmClock is null");
        }
    }

    public void useTool(Tool tool) {
        if (tool != null) {
            tool.use();
            if (tool instanceof Hammer hammer) {
                tool.use();
                hammer.swing();
            } else {
                System.out.println("Not a Hammer");
            }
        } else {
            System.out.println("Tool is null");
        }
    }

    public void openToolbox(ToolBox box) {
        if (box != null) {
            box.activate();
            if (box instanceof Wrench) {
                box.activate();
            } else {
                System.out.println("Not a Wrench");
            }
        } else {
            System.out.println("ToolBox is null");
        }
    }

    public void handleTransaction(Transaction transaction) {
        if (transaction != null) {
            transaction.execute();
            if (transaction instanceof OnlineTransaction) {
                transaction.execute();
            } else {
                System.out.println("Not an OnlineTransaction");
            }
        } else {
            System.out.println("Transaction is null");
        }
    }

    public void driveVehicle(Vehicle vehicle) {
        if (vehicle != null) {
            vehicle.move();
            if (vehicle instanceof Car) {
                ((Car) vehicle).honk();
            } else {
                System.out.println("Not a Car");
            }
        } else {
            System.out.println("Vehicle is null");
        }
    }
    public void checkBag(Bag bag) {
        if (bag != null) {
            bag.carry();
            if (bag instanceof LaptopBag) {
                ((LaptopBag) bag).protectLaptop();
            } else {
                System.out.println("Not a LaptopBag");
            }
        } else {
            System.out.println("Bag is null");
        }
    }

    public void operateTV(TV tv) {
        if (tv != null) {
            tv.powerOn();
            if (tv instanceof TVRemote) {
                tv.powerOn();
            } else {
                System.out.println("Not a TVRemote");
            }
        } else {
            System.out.println("TV is null");
        }
    }

    public void manageUser(User user) {
        if (user != null) {
            user.login();
            if (user instanceof AdminUser) {
                user.login();
            } else {
                System.out.println("Not an AdminUser");
            }
        } else {
            System.out.println("User is null");
        }
    }

    public void wearWatch(Watch watch) {
        if (watch != null) {
            watch.showTime();
            if (watch instanceof SmartWatch) {
                watch.showTime();
                ((SmartWatch) watch).trackSteps();
            } else {
                System.out.println("Not a SmartWatch");
            }
        } else {
            System.out.println("Watch is null");
        }
    }

    public void browseSite(Website website) {
        if (website != null) {
            website.load();
            if (website instanceof Blog) {
                website.load();
            } else {
                System.out.println("Not a Blog");
            }
        } else {
            System.out.println("Website is null");
        }
    }

    public void useWorkshopTool(com.workshop.Tool tool) {
        if (tool != null) {
            tool.use();
            if (tool instanceof Drill) {
                tool.use();
            } else {
                System.out.println("Not a Drill");
            }
        } else {
            System.out.println("Tool is null");
        }
    }

    public void writeSomething(Pen pen) {
        if (pen != null) {
            pen.write();
            if (pen instanceof FountainPen) {
                pen.write();
            } else {
                System.out.println("Not a FountainPen");
            }
        } else {
            System.out.println("Pen is null");
        }
    }
    public void printDocs(com.printing.Printer printer) {
        if (printer != null) {
            printer.print();
            if (printer instanceof com.printing.LaserPrinter) {
                printer.print();
            } else {
                System.out.println("Not a LaserPrinter");
            }
        } else {
            System.out.println("Printer is null");
        }
    }
}
