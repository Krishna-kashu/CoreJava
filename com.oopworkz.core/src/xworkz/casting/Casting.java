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
import com.content.Content;
import com.content.VideoContent;
import com.dashboard.Dashboard;
import com.dashboard.UserDashboard;
import com.document.Document;
import com.document.PDFDocument;
import com.gamelevel.BonusLevel;
import com.gamelevel.GameLevel;
import com.hygine.ToothBrush;
import com.microwave.Microwave;
import com.microwave.SmartMicrowave;
import com.security.Camera;
import com.security.SecurityCamera;
import com.chair.Chair;
import com.chair.ReclinerChair;
import com.furnitureplus.MassageChair;
import com.officechair.OfficeChair;



public class Casting {
    public void close(Door door) {
        if (door != null) {
            door.open();
            if (door instanceof SmartDoor) {
                SmartDoor smartDoor = (SmartDoor) door;
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
            if (account instanceof SavingsAccount) {
                SavingsAccount savings = (SavingsAccount) account;
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
            if (appliance instanceof WashingMachine) {
                WashingMachine washingMachine = (WashingMachine) appliance;
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
            if (paint instanceof SprayPaint) {
                SprayPaint spray = (SprayPaint) paint;
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
            if (transaction instanceof WithdrawalTransaction) {
                WithdrawalTransaction withdrawal = (WithdrawalTransaction) transaction;
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
            if (mirror instanceof SmartMirror) {
                SmartMirror smart = (SmartMirror) mirror;
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
            if (bed instanceof AdjustableBed) {
                AdjustableBed adjustable = (AdjustableBed) bed;
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
            if (book instanceof EBook) {
                EBook novel = (EBook) book;
                novel.download();
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
            if (bottle instanceof WaterBottle) {
                WaterBottle smart = (WaterBottle) bottle;
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
            if (camera instanceof SecurityCamera) {
                SecurityCamera securityCamera = (SecurityCamera) camera;
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
            if (chair instanceof ReclinerChair) {
                ReclinerChair recliner = (ReclinerChair) chair;
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
            if (chair instanceof MassageChair) {
                MassageChair massage = (MassageChair) chair;
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
            if (chair instanceof OfficeChair) {
                OfficeChair office = (OfficeChair) chair;
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
            if (brush instanceof ElectricBrush) {
                ElectricBrush electricBrush = (ElectricBrush) brush;
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
            if (brush instanceof ToothBrush) {
                ToothBrush toothBrush = (ToothBrush) brush;
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
            if (fan instanceof CeilingFan) {
                CeilingFan ceilingFan = (CeilingFan) fan;
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
            if (laptop instanceof GamingLaptop) {
                GamingLaptop gaming = (GamingLaptop) laptop;
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
            if (microwave instanceof SmartMicrowave) {
                SmartMicrowave smart = (SmartMicrowave) microwave;
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
            if (content instanceof VideoContent) {
                VideoContent video = (VideoContent) content;
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
            if (level instanceof BonusLevel) {
                BonusLevel bonus = (BonusLevel) level;
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
            if (dashboard instanceof UserDashboard) {
                UserDashboard user = (UserDashboard) dashboard;
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
            if (document instanceof PDFDocument) {
                PDFDocument pdf = (PDFDocument) document;
                pdf.encrypt();
            } else {
                System.out.println("Not a PDFDocument");
            }
        } else {
            System.out.println("Document is null");
        }
    }
}
