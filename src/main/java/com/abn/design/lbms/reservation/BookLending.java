package com.abn.design.lbms.reservation;

import java.util.Date;

public class BookLending {

    private Date creationDate;
    private Date dueDate;
    private Date returnDate;
    private String bookItemBarcode;
    private String memberId;

    public static boolean lendBook(String barcode, String memberId) {
        return false;
    }
    public static BookLending fetchLendingDetails(String barcode) {

        return new BookLending();
    }
}
