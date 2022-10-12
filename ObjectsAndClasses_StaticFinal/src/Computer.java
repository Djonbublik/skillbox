import java.util.Scanner;

public class Computer {
    private final String vendor;
    private final String name;
    public  Processor processor;
    public  RAM ram;
    public Drive drive;
    public  Screen screen;
    public   Keyboard keyboard;

    public int totalWeight;




    public Computer(String name, String vendor, Processor processor, RAM ram, Drive drive, Screen screen, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.processor = processor;
        this.ram = ram;
        this.drive = drive;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public Computer setDrive (Drive drive){
        return new Computer(name,
                vendor,
                processor,
                ram,
                drive,
                screen,
                keyboard);
    }
    public Computer setScreen (Screen screen){
        return new Computer(name,
                vendor,
                processor,
                ram,
                drive,
                screen,
                keyboard);
    }
    public Computer setRAM (RAM ram){
        return new Computer(name,
                vendor,
                processor,
                ram,
                drive,
                screen,
                keyboard);
    }
    public Computer setProcessor (Processor processor){
        return new Computer(name,
                vendor,
                processor,
                ram,
                drive,
                screen,
                keyboard);
    }
    public Computer setKeyboard (Keyboard keyboard){
        return new Computer(name,
                vendor,
                processor,
                ram,
                drive,
                screen,
                keyboard);
    }

    public Computer setName (String name){
        return new Computer(name,
                vendor,
                processor,
                ram,
                drive,
                screen,
                keyboard);
    }
    public Computer setVendor(String vendor){
        return new Computer(name,
                vendor,
                processor,
                ram,
                drive,
                screen,
                keyboard);
    }

    public Drive getDrive (){
        return drive;
    }

    public Screen getScreen (){
        return screen;
    }
    public RAM getRam (){
        return ram;
    }
    public Processor getProcessor (){
        return processor;
    }
    public Keyboard getKeyboard(){
        return keyboard;
    }

    public int getTotalWeight(){
        return totalWeight = drive.driveWeight + screen.screenWeight + ram.ramWeight + processor.processorWeight + keyboard.ketboardWeight;
    }


    public String toString (){
        return "\n" + name + "\n" + vendor + "\n" + "\n" + "\n" + drive + "\n" + screen + "\n" + ram + "\n"
                + "\n" + processor + "\n" + keyboard + "\n" + "Obchii ves: "
                + getTotalWeight() + " gr.";
    }


}
