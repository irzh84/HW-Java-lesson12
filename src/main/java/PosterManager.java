public class PosterManager {
    private Movie[] items = new Movie[0];
    private int limit;

    public PosterManager() {
        this.limit = 5;
    }

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public void add(Movie item) {
        Movie[] tmp = new Movie[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        this.items = tmp;
    }

    public Movie[] findAll() {
        return items;
    }

    public Movie[] findLast() {
        int resultLength;
        if (items.length < limit) {
            resultLength = items.length;
        } else {
            resultLength = limit;
        }
        Movie[] tmp = new Movie[resultLength];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = items[items.length - 1 - i];
        }
        return tmp;
    }
}
