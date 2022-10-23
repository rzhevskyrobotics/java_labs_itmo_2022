package labs.pm.data;

public interface Rateable<T>{
    public static final Rating DEFAULT_RATING = Rating.NOT_RATED;

    public abstract T applyRating(Rating rating);

    public default Rating getRating() {
        return DEFAULT_RATING;
    }

    public static Rating convert(int stars) {
        return (stars>=0&&stars<=5) ? Rating.values()[stars] : DEFAULT_RATING;
    }

    public default T applyRating(int stars) {
        return applyRating(convert(stars));
    }
}
