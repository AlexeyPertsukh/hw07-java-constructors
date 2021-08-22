package hw7_2;

//Класс - телефон
public class Phone {
    private String  model;          //модель
    private double  diag;           //диагональ
    private double  rom;            //ОЗУ
    private double  flash;          //флэш
    private int     batCapacity;    //емкость аккумулятора

    public Phone()
    {
        this("неизвестно", 0, 0, 0, 0);
    }

    public Phone(String  model)
    {
        this(model, 0, 0, 0, 0);
    }

    public Phone(String  model, double  diag, double  rom, double  flash, int batCapacity)
    {
        setModel(model);
        setDiag(diag);
        setRom(rom);
        setFlash(flash);
        setBatCapacity(batCapacity);
    }

    //Set
    public void setModel(String model)
    {
        this.model = model;
    }

    public void setDiag(double diag)
    {
        if (diag >= 0) {
            this.diag = diag;
        }
    }

    public void setRom(double rom)
    {
        if (diag >= 0) {
            this.rom = rom;
        }
    }

    public void setFlash(double flash)
    {
        if (diag >= 0) {
            this.flash = flash;
        }
    }

    public void setBatCapacity(int batCapacity)
    {
        if (diag >= 0) {
            this.batCapacity = batCapacity;
        }
    }

    //Get
    public String getModel()
    {
        return model;
    }

    public double getDiag()
    {
        return diag;
    }

    public double getRom()
    {
        return rom;
    }

    public double getFlash()
    {
        return flash;
    }

    public int getBatCapacity()
    {
        return batCapacity;
    }

    //
    //Сравнение объектов Phone
    public boolean equals(Phone phoneCmp){
        boolean res = ( this.model.equals(phoneCmp.model)           &&
                        this.diag == phoneCmp.diag                  &&
                        this.rom == phoneCmp.rom                    &&
                        this.flash == phoneCmp.flash                &&
                        this.batCapacity == phoneCmp.batCapacity
        );
        return res;
    }

    //
    public void info()
    {
        System.out.printf("Модель: %s \n", getModel() );
        System.out.printf("Диагональ: %.2f\" \n", getDiag() );
        System.out.printf("ОЗУ: %.1f Гб \n", getRom() );
        System.out.printf("Флэш: %.1f Гб \n", getFlash() );
        System.out.printf("Емкость аккумулятора: %d мАч \n", getBatCapacity() );
    }
}
