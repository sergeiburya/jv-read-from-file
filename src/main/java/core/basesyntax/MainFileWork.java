package core.basesyntax;

import java.util.Arrays;

public class MainFileWork {
    public static void main(String[] args) {
        FileWork fileWork = new FileWork();
        System.out.println(Arrays.toString(fileWork.readFromFile("test5")));
    }
}
