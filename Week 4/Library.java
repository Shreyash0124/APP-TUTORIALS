// 2. Library Management with Inheritance

import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

class LibraryItem {
    protected String title;
    protected String author;
    protected String id;
    protected boolean issued = false;
    protected Date dueDate;

    public LibraryItem(String title, String author, String id) {
        this.title = title;
        this.author = author;
        this.id = id;
    }

    public void issue(Date dueDate) {
        if (!issued) {
            this.issued = true;
            this.dueDate = dueDate;
            System.out.println(title + " issued till " + dueDate);
        } else {
            System.out.println(title + " already issued");
        }
    }

    public void returnItem() {
        if (issued) {
            this.issued = false;
            System.out.println(title + " returned");
        } else {
            System.out.println(title + " was not issued");
        }
    }

    public long calculateLateFee(Date returnDate) {
        if (!issued || returnDate.before(dueDate)) {
            return 0;
        }
        long diff = returnDate.getTime() - dueDate.getTime();
        long daysLate = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
        return daysLate * 1; // base late fee per day
    }
}

class Book extends LibraryItem {
    public Book(String title, String author, String id) {
        super(title, author, id);
    }

    @Override
    public long calculateLateFee(Date returnDate) {
        return super.calculateLateFee(returnDate) * 2; // double fee for books
    }
}

class Magazine extends LibraryItem {
    public Magazine(String title, String author, String id) {
        super(title, author, id);
    }

    @Override
    public long calculateLateFee(Date returnDate) {
        return super.calculateLateFee(returnDate); // base fee
    }
}

class DVD extends LibraryItem {
    public DVD(String title, String author, String id) {
        super(title, author, id);
    }

    @Override
    public long calculateLateFee(Date returnDate) {
        return super.calculateLateFee(returnDate) * 3; // triple fee for DVDs
    }
}

class Library {
    private ArrayList<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public LibraryItem findItemById(String id) {
        for (LibraryItem item : items) {
            if (item.id.equals(id)) {
                return item;
            }
        }
        return null;
    }

    public void issueItem(String id, Date dueDate) {
        LibraryItem item = findItemById(id);
        if (item != null) {
            item.issue(dueDate);
        } else {
            System.out.println("Item not found");
        }
    }

    public void returnItem(String id, Date returnDate) {
        LibraryItem item = findItemById(id);
        if (item != null) {
            long fee = item.calculateLateFee(returnDate);
            item.returnItem();
            if (fee > 0) {
                System.out.println("Late fee: " + fee);
            }
        } else {
            System.out.println("Item not found");
        }
    }
}
