package re.gb.oseminar7.data;

public class HighStudent extends Student implements Learn, Smoke{
    @Override
    public void learn() {
        System.out.println("Я должен учиться");
    }

    @Override
    public void smoke() {
        System.out.println("Я бросаю курить");
    }

    @Override
    public void getAllMethods() {
        learn();
        prepare();
        smoke();
        meeting();
    }

    private void meeting() {
        System.out.println("У меня есть друг (подруга)");
    }

    private void prepare() {
        System.out.println("Я готовлюсь к экзаменам");
    }
}
