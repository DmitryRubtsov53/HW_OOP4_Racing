public class Truck extends Mobil implements Competing{
    private String brand;
    private String model;
    private double engineVolume;
    private String typeAuto;
    public static final double MAX_SPEED_CAR = 170;

// getters **********************************************************************************************

    public String getBrand() { return brand;
    }
    public String getModel() { return model;
    }
    public double getEngineVolume() { return engineVolume;
    }
    public String getTypeAuto() { return typeAuto;
    }
// setters **********************************************************************************************

    public void setBrand(String brand) {
        this.brand = (brand != null && !brand.isBlank()) ? brand : "default";
    }
    public void setModel(String model) {
        this.model = (model != null && !model.isBlank())? model : "default";
    }
    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume != 0 ? engineVolume : 10;
    }

    public void setTypeAuto(String typeAuto) {
        this.typeAuto = (typeAuto!= null && !typeAuto.isBlank())? typeAuto : "default";
    }
    // constructor *******************************************************************************************

    public Truck (String typeAuto, String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
        setTypeAuto(typeAuto);
    }

// methods interfase ********************************************************************

    @Override
    public void startMoving() {
        System.out.println("Start of truck: Снимаем с ручного тормоза, заводим автомобиль, прогреваем, выжимаем сцепление, включаем 1-ю передачу, нажимаем на педаль газа, отпускаем сцепление.");
    }

    @Override
    public void finishMove() {
        System.out.println("Finish of truck: Съезжаем с трассы, отпускаем педаль газа, переключаемся на нейтралку, жмём на тормоз, выключаем двигатель, ставим на ручной тормоз.");
    }

    @Override
    public void pitStop() {
        System.out.println("Пора сменить колёса! Заезжай на Pit Stop.");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время - 35.29 мин." + "\n");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость " + MAX_SPEED_CAR + " км/ч.");
    }

//    @Override
//    public void printAuto(Competing... competings) {
//        for (Competing el : competings) {
//           System.out.println(el);
//    }

    @Override
    public String toString() {
        return  this.typeAuto + ": " + this.brand + ", модель - " + this.model + ", V двигателя - " + this.engineVolume + ".";
    }
    public static void printAuto (Truck[] trucks) {
        for (Truck el : trucks) {
            System.out.println(el);
        }
        System.out.println();
        trucks[0].startMoving();
        trucks[0].pitStop();
        trucks[0].finishMove();
        trucks[0].maxSpeed();
        trucks[0].bestTime();
    }

} // class **********************************************************************************************************

