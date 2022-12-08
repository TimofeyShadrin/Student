package re.gb.oseminar7;

import re.gb.oseminar7.data.HighStudent;
import re.gb.oseminar7.data.MiddleStudent;
import re.gb.oseminar7.data.SmallStudent;
import re.gb.oseminar7.service.Service;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Service service = new Service(Arrays.asList(
                new HighStudent(),
                new MiddleStudent(),
                new HighStudent(),
                new SmallStudent()
        ));

        service.service();
    }
}