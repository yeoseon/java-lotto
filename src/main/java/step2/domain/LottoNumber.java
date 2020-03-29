package step2.domain;

import java.util.Objects;

public class LottoNumber implements Comparable<LottoNumber> {
    public static final Integer MIN_NUMBER = 1;
    public static final Integer MAX_NUMBER = 45;
    public static final String LOTTO_NUMBER_RANGE_ERROR = "로또 번호는 1과 45 사이의 정수여야 합니다.";
    private final int lottoNumber;

    public LottoNumber(int lottoNumber) {
        validatedNumberRange(lottoNumber);
        this.lottoNumber = lottoNumber;
    }

    private void validatedNumberRange(int lottoNumber) {
        if(lottoNumber < MIN_NUMBER || lottoNumber > MAX_NUMBER) {
            throw new IllegalArgumentException(LOTTO_NUMBER_RANGE_ERROR);
        }
    }

    public int getValue() {
        return lottoNumber;
    }

    @Override
    public int compareTo(LottoNumber o) {
        if(o.equals(lottoNumber)) {
            return 0;
        }
        return lottoNumber > o.getValue() ? 1 : -1;
    }
}
