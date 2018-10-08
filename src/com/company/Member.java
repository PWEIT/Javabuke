package com.company;

public class Member {

    private Movie favouriteMovie;

    public Member(Movie favouriteMovie) {
        this.favouriteMovie = favouriteMovie;
    }

    public Member(Member member) {
        this.favouriteMovie = member.favouriteMovie;
    }

    public Movie getFavouriteMovie() {
        return favouriteMovie;
    }

    public void setFavouriteMovie(Movie favouriteMovie) {
        this.favouriteMovie = favouriteMovie;
    }
   // public Movie getSecondFavouriteMovie() {
    //    return secondFavouriteMovie;
    //}
}
