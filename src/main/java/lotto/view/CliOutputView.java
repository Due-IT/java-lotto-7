package lotto.view;

import java.util.stream.Collectors;
import lotto.domain.Lotto;
import lotto.domain.Lottos;

public class CliOutputView {

    void printLottos(Lottos lottos) {
        System.out.println(lottos.getLottos().size() + "개를 구매했습니다.");

        for (Lotto lotto : lottos.getLottos()) {
            printLotto(lotto);
        }
    }

    private void printLotto(Lotto lotto) {
        Lotto sortedLotto = lotto.getSortedLotto();

        String numbers = convertLottoNumbersToString(sortedLotto);

        System.out.println("[" + numbers + "]");
    }

    private String convertLottoNumbersToString(Lotto sortedLotto) {
        String numbers = sortedLotto.getNumbers().stream()
            .map(String::valueOf)   // Integer를 String으로 변환
            .collect(Collectors.joining(", "));
        return numbers;
    }

}
