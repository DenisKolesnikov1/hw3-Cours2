public abstract class Transport implements Transportable {

    private final String modelName;
    private final int wheelsCount;


    public Transport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
    }

    private void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}