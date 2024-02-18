package racingcar.domain;

public class TryCount {
    private final int tryCount;

    private TryCount(int tryCount) {
        this.tryCount = tryCount;
    }

    public static TryCount from(final int userTryCount) {
        validate(userTryCount);
        return new TryCount(userTryCount);
    }

    private static void validate(final int tryCount) {
        if (isSmallerThanZero(tryCount)) {
            throw new NumberFormatException();
        }
    }

    private static boolean isSmallerThanZero(final int number) {
        return number <= 0;
    }

    public int getTryCount() {
        return tryCount;
    }
}
