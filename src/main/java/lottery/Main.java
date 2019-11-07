package lottery;

import java.util.List;
import lottery.domain.LottoTicketSeller;
import lottery.domain.LottoTickets;
import lottery.view.InputView;
import lottery.view.ResultView;

public class Main {

    public static void main(String[] args) {
        int purchaseAmount = InputView.payAmount();

        LottoTickets lottoTickets = LottoTicketSeller.purchaseRandomGames(purchaseAmount);
        ResultView.printLottoTickets(lottoTickets);

        List<Integer> winNumbers = InputView.getWinNumbers();
        int bonusNumber = InputView.getBonusNumber(winNumbers);
        LottoResults results = lottoTickets.match(winNumbers, bonusNumber);
        ResultView.printLottoResults(results);
    }
}
