package re.gb.oseminar7.data;

public class SmallStudent extends Student implements Learn{

    @Override
    public void getAllMethods() {
        learn();
        cry();
    }

    @Override
    public void learn() {
        System.out.println("Я люблю учиться");
    }

    private void cry() {
        System.out.println("Я хочу к маме");
    }
}
