package com.plurasight;

public class Quote {
    private int quotesNumber;
    private String quotesText;

    public Quote(int quotesNumber, String quotesText) {
        this.quotesNumber = quotesNumber;
        this.quotesText = quotesText;}
public String toString(){
    return "quoteNumber" + quotesNumber+ "is " + quotesText;}

    public int getquotesNumber() {
        return quotesNumber;
    }

    public void setQuotesNumber(int quotesNumber) {
        this.quotesNumber = quotesNumber;
    }

    public String getQuoteText() {
        return quotesText;
    }

    public void setQuotesText(String quotesText) {
        this.quotesText = quotesText;
    }
}
