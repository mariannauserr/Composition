package ru.netology.manager;

import ru.netology.domain.PurchaseFilm;
public class PosterManager {
    private PurchaseFilm[] films = new PurchaseFilm[0];
    private int resultLength = 10;

    public PosterManager() {
    }

    public PosterManager(int resultLength) {
        this.resultLength = resultLength;
    }

    public void add(PurchaseFilm film) {
        int length = films.length + 1;
        PurchaseFilm[] tmp = new PurchaseFilm[length];
        System.arraycopy(films, 0, tmp, 0, films.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = film;
        films = tmp;
    }

    public PurchaseFilm[] findAll() {
        return films;
    }

    public PurchaseFilm[] findLast() {
        if (films.length > resultLength) {
            resultLength = resultLength;
        } else {
            resultLength = films.length;
        }
        PurchaseFilm[] result = new PurchaseFilm[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = films.length - i - 1;
            result[i] = films[index];
        }
        return result;
    }
}
