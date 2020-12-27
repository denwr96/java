package javaguru.sunday.teacher.lesson_10.lessoncode.library;

public class Reader {

    private String fullName;
    private ReaderCard readerCard;
    private long phoneNumber;

    public Reader(String fullName, ReaderCard readerCard, long phoneNumber) {
        this.fullName = fullName;
        this.readerCard = readerCard;
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public ReaderCard getReaderCard() {
        return readerCard;
    }

    public void setReaderCard(ReaderCard readerCard) {
        this.readerCard = readerCard;
    }
}
