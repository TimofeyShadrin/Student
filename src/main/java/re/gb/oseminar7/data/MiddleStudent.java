package re.gb.oseminar7.data;

public class MiddleStudent extends Student implements Learn, Smoke{
    @Override
    public void learn() {
        System.out.println("Я ненавижу учиться");
    }

    @Override
    public void getAllMethods() {
        learn();
        walkLesson();
        smoke();
    }

    @Override
    public void smoke() {
        System.out.println("Я начал курить");
    }

    private void walkLesson() {
        System.out.println("Я прогулял урок");
    }
}
