package baseball;

import camp.nextstep.edu.missionutils.Console;
import camp.nextstep.edu.missionutils.Randoms;
import java.lang.IllegalArgumentException;
import java.util.List;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {
        startMessage();
        String answer = createAnswer();
    }
    private static void startMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    private static String createAnswer () {
        List<String> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(Integer.toString(randomNumber));
            }
        }
        return String.join("",computer);
    }

}
